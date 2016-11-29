package dao.repositories;

import java.sql.SQLException;

public interface IRepositoryCatalog {
	
	public IPlayerRepository Players();

	public IEnumDictionariesRepository Dictionaries();

	public ICharacterRepository Characters();

	public IGuildRepository Guilds();

	public IItemRepository Items();

	public IEquipmentRepository Equipments();

	public void save() throws SQLException;
	
}
