package dao.repositories;

import java.util.List;

import domain.model.Equipment;

public interface IEquipmentRepository extends IRepository<Equipment>{

	List<Equipment> withAllItemsEquiped();
	
}
