package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.RepositoryCatalog;
import dao.repositories.IPlayerRepository;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.Item;
import domain.model.Player;

public class App {
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setLogin("Karol1995xD");
		player1.setPassword("karolsiejka");
		player1.setName("Karol");
		player1.setSurname("Siejka");
		player1.setEmail("kkaroo@interia.pl");
		player1.setCounty("Polska");
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			IUnitOfWork uow = new UnitOfWork(connection);
			IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		Item item5 = new Item();
		Item item6 = new Item();
		Item item7 = new Item();
		Item item8 = new Item();
		Item item9 = new Item();
		Item item10 = new Item();
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item2.setName("Hełm");
		item2.setStat1("Armor");
		item2.setValue1(200);
		item2.setStat2("Strength");
		item2.setValue2(50);
		item2.setStat3("Stamina");
		item2.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);
		
		item1.setName("Hełm");
		item1.setStat1("Armor");
		item1.setValue1(200);
		item1.setStat2("Strength");
		item1.setValue2(50);
		item1.setStat3("Stamina");
		item1.setValue3(50);*/
	}
}
