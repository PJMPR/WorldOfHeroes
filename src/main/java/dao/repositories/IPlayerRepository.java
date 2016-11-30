package dao.repositories;

import java.util.List;

import domain.model.Player;

public interface IPlayerRepository extends IRepository<Player> {

	List<Player> withName(String name);
	List<Player> withSurname(String surname);
	List<Player> withCountry(String country);
	
}
