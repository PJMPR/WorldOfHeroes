package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Item;

public class ItemMapper implements IMapResultSetIntoEntity<Item>{

	public Item map(ResultSet rs) throws SQLException {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setStat1(rs.getString("stat1"));
		item.setStat2(rs.getString("stat2"));
		item.setStat3(rs.getString("stat3"));
		return item;
	}

}
