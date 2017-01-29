package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Character;

public class CharacterMapper implements IMapResultSetIntoEntity<Character>{

	public Character map(ResultSet rs) throws SQLException {
		Character character = new Character();
		character.setId(rs.getInt("id"));
		character.setName(rs.getString("name"));
		character.setFaction(rs.getString("faction"));
		character.setRace(rs.getString("race"));
		character.setJob(rs.getString("job"));
		character.setLvl(rs.getInt("lvl"));
		character.setHp(rs.getInt("hp"));
		character.setDamage(rs.getInt("damage"));
		character.setStrength(rs.getInt("strength"));
		character.setAgility(rs.getInt("agility"));
		character.setIntellect(rs.getInt("intellect"));
		character.setStamina(rs.getInt("stamina"));
		return character;
	}

}
