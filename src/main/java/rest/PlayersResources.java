package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import domain.model.Player;
import domain.model.Character;
import rest.dto.CharacterDto;
import rest.dto.PlayerDto;

@Path("/players")
@Stateless
public class PlayersResources {
	
	Mapper mapper = new DozerBeanMapper();
	
    @PersistenceContext
    EntityManager entityManager;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<PlayerDto> result = new ArrayList<PlayerDto>();
    	for(Player p: entityManager.createNamedQuery("player.all",Player.class).getResultList()){
        	result.add(mapper.map(p, PlayerDto.class));
        }
        return Response.ok(new GenericEntity<List<PlayerDto>>(result){}).build();
    }
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/characters") 
    public Response getpersonWallets(@PathParam("id") int playerId){
    	Player p = entityManager.createNamedQuery("player.id", Player.class)
    			.setParameter("id", playerId)
    			.getSingleResult();
    	if(p==null)
    		return Response.status(Status.NOT_FOUND).build();
    	List<CharacterDto> results = new ArrayList<CharacterDto>();
    	for(Character c: p.getCharacters()){
    		results.add(mapper.map(c, CharacterDto.class));
    	}
    	return Response.ok(new GenericEntity<List<CharacterDto>>(results){}).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Player player) {
        entityManager.persist(player);
        return Response.ok(player.getId()).build();
    }
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id){
		Player result = entityManager.createNamedQuery("player.id", Player.class).setParameter("playerId", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		return Response.ok(result).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") int id, Player p){
		Player result = entityManager.createNamedQuery("player.id", Player.class).setParameter("playerId", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		result.setName(p.getName());
		result.setSurname(p.getSurname());
		entityManager.persist(result);
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response delete(@PathParam("id") int id){
		Player result = entityManager.createNamedQuery("player.id", Player.class).setParameter("playerId", id).getSingleResult();
		if(result==null){
			return Response.status(404).build();
		}
		entityManager.remove(result);
		return Response.ok().build();
	}
	
}