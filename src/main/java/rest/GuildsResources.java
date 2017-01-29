package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import domain.model.Guild;
import rest.dto.GuildDto;

@Path("/guilds")
@Stateless
public class GuildsResources {
	
    Mapper mapper = new DozerBeanMapper();
    
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<GuildDto> result = new ArrayList<GuildDto>();
    	for(Guild g: entityManager.createNamedQuery("guild.all",Guild.class).getResultList()){
        	result.add(mapper.map(g, GuildDto.class));
        }
        return Response.ok(new GenericEntity<List<GuildDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Guild result = entityManager.createNamedQuery("guild.id", Guild.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}