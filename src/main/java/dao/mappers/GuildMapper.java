package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Faction;
import domain.model.Guild;

public class GuildMapper implements IMapResultSetIntoEntity<Guild>{

	public Guild map(ResultSet rs) throws SQLException {
		Guild guild = new Guild();
		guild.setId(rs.getInt("id"));
		guild.setName(rs.getString("name"));
		guild.setFaction((Faction) rs.getObject("faction"));
		return guild;
	}

}
