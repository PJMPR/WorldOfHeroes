package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Player;

public class PlayerMapper implements IMapResultSetIntoEntity<Player>{

	public Player map(ResultSet rs) throws SQLException {
		Player player = new Player();
		player.setId(rs.getInt("id"));
		player.setLogin(rs.getString("login"));
		player.setPassword(rs.getString("password"));
		player.setName(rs.getString("name"));
		player.setSurname(rs.getString("surname"));
		player.setEmail(rs.getString("email"));
		player.setCountry(rs.getString("country"));
		return player;
	}

}
