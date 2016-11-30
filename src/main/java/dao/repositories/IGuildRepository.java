package dao.repositories;

import java.util.List;

import domain.model.Guild;

public interface IGuildRepository extends IRepository<Guild>{

	List<Guild> withFaction(String faction);
	
}
