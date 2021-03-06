package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IPlayerRepository;
import dao.uow.IUnitOfWork;
import domain.model.Player;

public class PlayerRepository extends RepositoryBase<Player> implements IPlayerRepository {
	
    private PreparedStatement getName;
    private PreparedStatement getSurname;
    private PreparedStatement getCountry;
	
	public PlayerRepository(Connection connection, IMapResultSetIntoEntity<Player> mapper, IUnitOfWork uow) {
		super(connection,mapper,uow);
		try {
            getName = connection.prepareStatement(getNameSql());
            getSurname = connection.prepareStatement(getSurnameSql());
            getCountry = connection.prepareStatement(getCountrySql());
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	private String getCountrySql() {
		return "SELECT * FROM player WHERE country=?";
	}

	private String getSurnameSql() {
		return "SELECT * FROM player WHERE surname=?";
	}

	private String getNameSql() {
		return "SELECT * FROM player WHERE name=?";
	}

	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE player("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "login varchar(20)," + "password varchar(50),"
				+ "name varchar(20)," + "surname varchar(50),"
				+ "email varchar(50)," + "country varchar(20)" + ")";
	}

	@Override
	protected String tableName() {
		return "player";
	}

	@Override
	protected String insertSql() {
		return "INSERT INTO player(login, password, name, surname, email, country) VALUES (?,?,?,?,?,?)";
	}
	
	@Override
	protected String updateSql() {
		return "UPDATE player SET (login, password, name, surname, email, country)=(?,?,?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setInsert(Player entity) throws SQLException {
		insert.setString(1, entity.getLogin());
		insert.setString(2, entity.getPassword());
		insert.setString(3, entity.getName());
		insert.setString(4, entity.getSurname());
		insert.setString(5, entity.getEmail());
		insert.setString(6, entity.getCountry());
	}
	
	@Override
	protected void setUpdate(Player entity) throws SQLException {
		update.setString(1, entity.getLogin());
		update.setString(2, entity.getPassword());
		update.setString(3, entity.getName());
		update.setString(4, entity.getSurname());
		update.setString(5, entity.getEmail());
		update.setString(6, entity.getCountry());
	}

	public List<Player> withName(String name) {
        List<Player> players = new ArrayList<Player>();
        try{
            getName.setString(1, name);
            ResultSet resultSet = getName.executeQuery();
            while(resultSet.next()){
            	players.add(mapper.map(resultSet));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return players;
	}

	public List<Player> withSurname(String surname) {
        List<Player> players = new ArrayList<Player>();
        try{
            getSurname.setString(1, surname);
            ResultSet resultSet = getSurname.executeQuery();
            while(resultSet.next()){
            	players.add(mapper.map(resultSet));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return players;
	}

	public List<Player> withCountry(String country) {
        List<Player> players = new ArrayList<Player>();
        try{
            getCountry.setString(1, country);
            ResultSet resultSet = getCountry.executeQuery();
            while(resultSet.next()){
            	players.add(mapper.map(resultSet));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return players;
	}

}