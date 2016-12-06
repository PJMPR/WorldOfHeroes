package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.model.Equipment;
import domain.model.Item;

public class EquipmentMapper implements IMapResultSetIntoEntity<Equipment>{

	public Equipment map(ResultSet rs) throws SQLException {
		Equipment equipment = new Equipment();
		equipment.setId(rs.getInt("id"));
		equipment.setHeadId(rs.getInt("head"));
		equipment.setShoulderId(rs.getInt("shoulder"));
		equipment.setBackId(rs.getInt("back"));
		equipment.setChestId(rs.getInt("chest"));
		equipment.setWristId(rs.getInt("wrist"));
		equipment.setHandsId(rs.getInt("hands"));
		equipment.setWaistId(rs.getInt("waist"));
		equipment.setLegsId(rs.getInt("legs"));
		equipment.setFeetId(rs.getInt("feet"));
		equipment.setWeaponId(rs.getInt("weapon"));
		return equipment;
	}

}
