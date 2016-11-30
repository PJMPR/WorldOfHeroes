package dao;

import dao.mappers.*;
import dao.repositories.*;
import dao.uow.IUnitOfWork;

import java.sql.Connection;
import java.sql.SQLException;

public class RepositoryCatalog implements IRepositoryCatalog {

	private Connection connection;
	private IUnitOfWork uow;
	private EnumDictionaryMapper enumDictionaryMapper = new EnumDictionaryMapper();
	private PlayerMapper playerMapper = new PlayerMapper();
	private CharacterMapper characterMapper = new CharacterMapper();
	private GuildMapper guildMapper = new GuildMapper();
	private ItemMapper itemMapper = new ItemMapper();
	private EquipmentMapper equipmentMapper = new EquipmentMapper();

	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	public IPlayerRepository Players() {
		return new PlayerRepository(connection, playerMapper, uow);
	}

	public IEnumDictionariesRepository Dictionaries() {
		return new EnumDictionaryRepository(connection, enumDictionaryMapper, uow);
	}

	public ICharacterRepository Characters() {
		return new CharacterRepository(connection, characterMapper, uow);
	}

	public IGuildRepository Guilds() {
		return new GuildRepository(connection, guildMapper, uow);
	}

	public IItemRepository Items() {
		return new ItemRepository(connection, itemMapper, uow);
	}

	public IEquipmentRepository Equipments() {
		return new EquipmentRepository(connection, equipmentMapper, uow);
	}

	public void save() throws SQLException {
		uow.commit();
	}

}