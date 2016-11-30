package dao.repositories;

import java.util.List;

import domain.model.Item;

public interface IItemRepository extends IRepository<Item>{

	List<Item> withName(String name);
	List<Item> withStat(String stat);
	
}
