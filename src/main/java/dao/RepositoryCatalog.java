package dao;

import dao.mappers.*;
import dao.repositories.*;
import dao.uow.IUnitOfWork;

import java.sql.Connection;
import java.sql.SQLException;

public class RepositoryCatalog implements IRepositoryCatalog {

    private Connection connection;
    private IUnitOfWork uow;
    private EnumDictionaryMapper enumDictionaryMapper;

    public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
        super();
        this.connection = connection;
        this.uow = uow;
    }

	public IEnumDictionariesRepository dictionaries() {
		return new EnumDictionaryRepository(connection, enumDictionaryMapper, uow);
	}

	public void save() throws SQLException {
        uow.commit();
        connection.close();
	}

}