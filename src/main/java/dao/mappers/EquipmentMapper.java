package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Equipment;
import domain.model.Item;

public class EquipmentMapper implements IMapResultSetIntoEntity<Equipment>{

	public Equipment map(ResultSet rs) throws SQLException {
		Equipment equipment = new Equipment();
		equipment.setId(rs.getInt("id"));
		equipment.setHead((Item)rs.getObject("head"));
		equipment.setShoulder((Item)rs.getObject("shoulder"));
		equipment.setBack((Item)rs.getObject("back"));
		equipment.setChest((Item)rs.getObject("chest"));
		equipment.setWrist((Item)rs.getObject("wrist"));
		equipment.setHands((Item)rs.getObject("hands"));
		equipment.setWaist((Item)rs.getObject("waist"));
		equipment.setLegs((Item)rs.getObject("legs"));
		equipment.setFeet((Item)rs.getObject("feet"));
		equipment.setWeapon((Item)rs.getObject("weapon"));
		return equipment;
	}

}
