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

import domain.model.Equipment;
import rest.dto.EquipmentDto;


@Path("/equipments")
@Stateless
public class EquipmentResources {
	
    Mapper mapper = new DozerBeanMapper();
    
    @PersistenceContext
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll(){
    	List<EquipmentDto> result = new ArrayList<EquipmentDto>();
    	for(Equipment e: entityManager.createNamedQuery("equipment.all",Equipment.class).getResultList()){
        	result.add(mapper.map(e, EquipmentDto.class));
        }
        return Response.ok(new GenericEntity<List<EquipmentDto>>(result){}).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
    	Equipment result = entityManager.createNamedQuery("equipment.id", Equipment.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
	
}