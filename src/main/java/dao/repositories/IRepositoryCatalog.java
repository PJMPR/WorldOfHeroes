package dao.repositories;

import java.sql.SQLException;

public interface IRepositoryCatalog {
	IEnumDictionariesRepository dictionaries();
	void save() throws SQLException;
}
