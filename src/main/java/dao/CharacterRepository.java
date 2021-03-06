package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.ICharacterRepository;
import dao.uow.IUnitOfWork;
import domain.model.Character;

public class CharacterRepository extends RepositoryBase<Character> implements ICharacterRepository {

	private PreparedStatement getLvl;
	private PreparedStatement getFaction;
	private PreparedStatement getRace;
	private PreparedStatement getJob;

	public CharacterRepository(Connection connection, IMapResultSetIntoEntity<Character> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);
		try {
			getLvl = connection.prepareStatement(getLvlSql());
			getFaction = connection.prepareStatement(getFactionSql());
			getRace = connection.prepareStatement(getRaceSql());
			getJob = connection.prepareStatement(getJobSql());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String getJobSql() {
		return "SELECT * FROM character WHERE class=?";
	}

	private String getRaceSql() {
		return "SELECT * FROM character WHERE race=?";
	}

	private String getFactionSql() {
		return "SELECT * FROM character WHERE faction=?";
	}

	private String getLvlSql() {
		return "SELECT * FROM character WHERE lvl=?";
	}
	

	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE character(" + "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "name varchar(20)," + "faction varchar(20)," + "race varchar(20)," + "class varchar(20)," + "lvl int,"
				+ "hp int," + "damage int," + "strength int," + "agility int," + "intellect int," + "stamina int,"
				+ "GUILD_ID int," + "PLAYER_ID int," + "EQUIPMENT_ID int,"	
				+ "FOREIGN KEY (GUILD_ID) REFERENCES guild(id),"
                + "FOREIGN KEY (PLAYER_ID) REFERENCES player(id),"
				+ "FOREIGN KEY (EQUIPMENT_ID) REFERENCES equipment(id)" + ")";
	}

	@Override
	protected String tableName() {
		return "character";
	}

	@Override
	protected String insertSql() {
		return "INSERT INTO character(name, faction, race, class, lvl, hp, damage, strength, agility, intellect, stamina, GUILD_ID, PLAYER_ID, EQUIPMENT_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	}

	@Override
	protected String updateSql() {
		return "UPDATE character SET (name, faction, race, class, lvl, hp, damage, strength, agility, intellect, stamina, GUILD_ID, PLAYER_ID, EQUIPMENT_ID)=(?,?,?,?,?,?,?,?,?,?,?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setUpdate(Character entity) throws SQLException {
		update.setString(1, entity.getName());
		update.setString(2, entity.getFaction().toString());
		update.setString(3, entity.getRace().toString());
		update.setString(4, entity.getJob().toString());
		update.setInt(5, entity.getLvl());
		update.setInt(6, entity.getHp());
		update.setInt(7, entity.getDamage());
		update.setInt(8, entity.getStrength());
		update.setInt(9, entity.getAgility());
		update.setInt(10, entity.getIntellect());
		update.setInt(11, entity.getStamina());
		update.setInt(12, entity.getGuild().getId());
		update.setInt(13, entity.getPlayer().getId());
		update.setInt(14, entity.getEquipment().getId());
	}

	@Override
	protected void setInsert(Character entity) throws SQLException {
		insert.setString(1, entity.getName());
		insert.setString(2, entity.getFaction().toString());
		insert.setString(3, entity.getRace().toString());
		insert.setString(4, entity.getJob().toString());
		insert.setInt(5, entity.getLvl());
		insert.setInt(6, entity.getHp());
		insert.setInt(7, entity.getDamage());
		insert.setInt(8, entity.getStrength());
		insert.setInt(9, entity.getAgility());
		insert.setInt(10, entity.getIntellect());
		insert.setInt(11, entity.getStamina());
		insert.setInt(12, entity.getGuild().getId());
		insert.setInt(13, entity.getPlayer().getId());
		insert.setInt(14, entity.getEquipment().getId());
	}

	public List<Character> withLvl(int lvl) {
		List<Character> characters = new ArrayList<Character>();
		try {
			getLvl.setInt(1, lvl);
			ResultSet resultSet = getLvl.executeQuery();
			while (resultSet.next()) {
				Character character = new Character();
				character.setName(resultSet.getString("name"));
				characters.add(character);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return characters;
	}
	
	public List<Character> withFaction(String faction) {
		List<Character> characters = new ArrayList<Character>();
		try {
			getFaction.setString(1, faction);
			ResultSet resultSet = getFaction.executeQuery();
			while (resultSet.next()) {
				Character character = new Character();
				character.setName(resultSet.getString("name"));
				characters.add(character);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return characters;
	}

	public List<Character> withRace(String race) {
		List<Character> characters = new ArrayList<Character>();
		try {
			getRace.setString(1, race);
			ResultSet resultSet = getRace.executeQuery();
			while (resultSet.next()) {
				Character character = new Character();
				character.setName(resultSet.getString("name"));
				characters.add(character);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return characters;
	}

	public List<Character> withJob(String job) {
		List<Character> characters = new ArrayList<Character>();
		try {
			getJob.setString(1, job);
			ResultSet resultSet = getJob.executeQuery();
			while (resultSet.next()) {
				Character character = new Character();
				character.setName(resultSet.getString("name"));
				characters.add(character);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return characters;
	}

}