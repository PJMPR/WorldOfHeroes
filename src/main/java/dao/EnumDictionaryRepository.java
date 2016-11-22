package dao;

import java.sql.Connection;
import java.sql.SQLException;

import dao.mappers.IMapResultSetIntoEntity;
import domain.model.EnumDictionary;

public class EnumDictionaryRepository extends RepositoryBase<EnumDictionary> {

	public EnumDictionaryRepository(Connection connection, IMapResultSetIntoEntity<EnumDictionary> mapper) {
		super(connection, mapper);
	}

	@Override
	protected String createTableSql() {
		return "CREATE TABLE enumDictionary("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "intKey bigint," 
				+ "stringKey varchar(50),"
				+ "value varchar(50)," 
				+ "enumerationName varchar(50)" 
				+ ")";
	}

	@Override
	protected String tableName() {
		return "enumDictionary";
	}

	protected String insertSql() {
		return "INSERT INTO enumDictionary(intKey, stringKey, value, enumerationName) VALUES (?,?,?,?)";
	}

	protected String updateSql() {
		return "UPDATE enumDictionary SET (intKey, stringKey, value, enumerationName)=(?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setUpdate(EnumDictionary entity) throws SQLException {
		update.setInt(1, entity.getIntKey());
		update.setString(2, entity.getStringKey());
		update.setString(3, entity.getValue());
		update.setString(4, entity.getEnumerationName());	
	}

	@Override
	protected void setInsert(EnumDictionary entity) throws SQLException {
		insert.setInt(1, entity.getIntKey());
		insert.setString(2, entity.getStringKey());
		insert.setString(3, entity.getValue());
		insert.setString(4, entity.getEnumerationName());
	}

}
