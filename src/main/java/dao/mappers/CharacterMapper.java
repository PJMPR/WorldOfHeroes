package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Character;
import domain.model.Classes;
import domain.model.Equipment;
import domain.model.Faction;
import domain.model.Guild;
import domain.model.Player;
import domain.model.Race;

public class CharacterMapper implements IMapResultSetIntoEntity<Character>{

	public Character map(ResultSet rs) throws SQLException {
		Character character = new Character();
		character.setId(rs.getInt("id"));
		character.setName(rs.getString("name"));
		character.setFaction((Faction)rs.getObject("faction"));
		character.setRace((Race)rs.getObject("race"));
		character.setJob((Classes)rs.getObject("job"));
		character.setLvl(rs.getInt("lvl"));
		character.setHp(rs.getInt("hp"));
		character.setDamage(rs.getInt("damage"));
		character.setStrength(rs.getInt("strength"));
		character.setAgility(rs.getInt("agility"));
		character.setIntellect(rs.getInt("intellect"));
		character.setStamina(rs.getInt("stamina"));
		character.setGuildId((Guild)rs.getObject("guildId"));
		character.setPlayerId((Player)rs.getObject("playerId"));
		character.setEquipmentId((Equipment)rs.getObject("equipmentId"));
		return character;
	}

}
