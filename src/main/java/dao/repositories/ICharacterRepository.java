package dao.repositories;

import java.util.List;

import domain.model.Character;

public interface ICharacterRepository extends IRepository<Character> {

	List<Character> withLvl(int lvl);
	List<Character> withFaction(String faction);
	List<Character> withRace(String race);
	List<Character> withJob(String job);
	
}
