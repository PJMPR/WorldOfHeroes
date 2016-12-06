package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IEquipmentRepository;
import dao.uow.IUnitOfWork;
import domain.model.Equipment;

public class EquipmentRepository extends RepositoryBase<Equipment> implements IEquipmentRepository {

	private PreparedStatement isEquiped;

	public EquipmentRepository(Connection connection, IMapResultSetIntoEntity<Equipment> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);
		try {
			isEquiped = connection.prepareStatement(isEquipedSql());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private String isEquipedSql() {
		return "SELECT * FROM equipment WHERE head IS NOT NULL AND shoulder IS NOT NULL AND back IS NOT NULL AND chest IS NOT NULL AND wrist IS NOT NULL AND hands IS NOT NULL AND waist IS NOT NULL AND legs IS NOT NULL AND feet IS NOT NULL AND weapon IS NOT NULL";
	}

	@Override
	protected String createTableSql() {
		return "" + "CREATE TABLE equipment(" + "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY," + "head int,"
				+ "shoulder int," + "back int," + "chest int," + "wrist int," + "hands int," + "waist int,"
				+ "legs int," + "feet int," + "weapon int" + ")";
	}

	@Override
	protected String tableName() {
		return "equipment";
	}

	@Override
	protected String insertSql() {
		return "INSERT INTO equipment(head, shoulder, back, chest, wrist, hands, waist, legs, feet, weapon) VALUES (?,?,?,?,?,?,?,?,?,?)";
	}

	@Override
	protected String updateSql() {
		return "UPDATE equipment SET (head, shoulder, back, chest, wrist, hands, waist, legs, feet, weapon)=(?,?,?,?,?,?,?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setUpdate(Equipment entity) throws SQLException {
		update.setInt(1, entity.getHeadId());
		update.setInt(2, entity.getShoulderId());
		update.setInt(3, entity.getBackId());
		update.setInt(4, entity.getChestId());
		update.setInt(5, entity.getWristId());
		update.setInt(6, entity.getHandsId());
		update.setInt(7, entity.getWaistId());
		update.setInt(8, entity.getLegsId());
		update.setInt(9, entity.getFeetId());
		update.setInt(10, entity.getWeaponId());
	}

	@Override
	protected void setInsert(Equipment entity) throws SQLException {
		insert.setInt(1, entity.getHeadId());
		insert.setInt(2, entity.getShoulderId());
		insert.setInt(3, entity.getBackId());
		insert.setInt(4, entity.getChestId());
		insert.setInt(5, entity.getWristId());
		insert.setInt(6, entity.getHandsId());
		insert.setInt(7, entity.getWaistId());
		insert.setInt(8, entity.getLegsId());
		insert.setInt(9, entity.getFeetId());
		insert.setInt(10, entity.getWeaponId());
	}

	public List<Equipment> withAllItemsEquiped() {
        List<Equipment> equipments = new ArrayList<Equipment>();
        try{
            ResultSet resultSet = isEquiped.executeQuery();
            while(resultSet.next()){
            	equipments.add(mapper.map(resultSet));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return equipments;
	}

}