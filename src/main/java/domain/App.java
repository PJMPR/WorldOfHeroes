package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;

import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.Player;
import domain.model.Race;
import domain.model.Character;
import domain.model.Classes;
import domain.model.Equipment;
import domain.model.Faction;
import domain.model.Guild;
import domain.model.Item;

public class App {
	public static void main(String[] args) {
		
		Item head = new Item();
		Item shoulder = new Item();
		Item back = new Item();
		Item chest = new Item();
		Item wrist = new Item();
		Item hands = new Item();
		Item waist = new Item();
		Item legs = new Item();
		Item feet = new Item();
		Item weapon = new Item();
		
		head.setName("Hełm");
		head.setStat1("Armor");
		head.setValue1(200);
		head.setStat2("Strength");
		head.setValue2(50);
		head.setStat3("Stamina");
		head.setValue3(50);
		head.getId();
		
		shoulder.setName("Naramienniki");
		shoulder.setStat1("Armor");
		shoulder.setValue1(200);
		shoulder.setStat2("Strength");
		shoulder.setValue2(50);
		shoulder.setStat3("Stamina");
		shoulder.setValue3(50);
		
		back.setName("Płaszcz");
		back.setStat1("Armor");
		back.setValue1(200);
		back.setStat2("Strength");
		back.setValue2(50);
		back.setStat3("Stamina");
		back.setValue3(50);
		
		chest.setName("Zbroja");
		chest.setStat1("Armor");
		chest.setValue1(200);
		chest.setStat2("Strength");
		chest.setValue2(50);
		chest.setStat3("Stamina");
		chest.setValue3(50);
		
		wrist.setName("Karwasze");
		wrist.setStat1("Armor");
		wrist.setValue1(200);
		wrist.setStat2("Strength");
		wrist.setValue2(50);
		wrist.setStat3("Stamina");
		wrist.setValue3(50);
		
		hands.setName("Rękawice");
		hands.setStat1("Armor");
		hands.setValue1(200);
		hands.setStat2("Strength");
		hands.setValue2(50);
		hands.setStat3("Stamina");
		hands.setValue3(50);
		
		waist.setName("Pasek");
		waist.setStat1("Armor");
		waist.setValue1(200);
		waist.setStat2("Strength");
		waist.setValue2(50);
		waist.setStat3("Stamina");
		waist.setValue3(50);
		
		legs.setName("Nagolenniki");
		legs.setStat1("Armor");
		legs.setValue1(200);
		legs.setStat2("Strength");
		legs.setValue2(50);
		legs.setStat3("Stamina");
		legs.setValue3(50);
		
		feet.setName("Buty");
		feet.setStat1("Armor");
		feet.setValue1(200);
		feet.setStat2("Strength");
		feet.setValue2(50);
		feet.setStat3("Stamina");
		feet.setValue3(50);
		
		weapon.setName("Broń");
		weapon.setStat1("Damage");
		weapon.setValue1(1000);
		weapon.setStat2("Strength");
		weapon.setValue2(50);
		weapon.setStat3("Stamina");
		weapon.setValue3(50);
		
		Equipment equipment1 = new Equipment();
		
		equipment1.setHead(head);
		equipment1.setShoulder(shoulder);
		equipment1.setBack(back);
		equipment1.setChest(chest);
		equipment1.setWrist(wrist);
		equipment1.setHands(hands);
		equipment1.setWaist(waist);
		equipment1.setLegs(legs);
		equipment1.setFeet(feet);
		equipment1.setWeapon(weapon);
		
		Player player1 = new Player();
		
		player1.setLogin("Karol1995xD");
		player1.setPassword("karolsiejka");
		player1.setName("Karol");
		player1.setSurname("Siejka");
		player1.setEmail("kkaroo@interia.pl");
		player1.setCounty("Polska");
		
		Guild guild1 = new Guild();
		
		guild1.setName("Sarmatia");
		guild1.setFaction(Faction.Alliance);
		
		Character character1 = new Character();
		
		character1.setName("Glonfindel");
		character1.setFaction(Faction.Alliance);
		character1.setRace(Race.Human);
		character1.setJob(Classes.Paladin);
		character1.setLvl(100);
		character1.setHp(126000);
		character1.setDamage(4500);
		character1.setStrength(1000);
		character1.setAgility(0);
		character1.setIntellect(0);
		character1.setStamina(1260);
		character1.setGuild(guild1);
		character1.setPlayer(player1);
		character1.setEquipment(equipment1);

		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			IUnitOfWork uow = new UnitOfWork(connection);
			IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
			catalog.Players().add(player1);
			catalog.Items().add(head);
			catalog.Items().selectId();
			catalog.Items().add(shoulder);
			catalog.Items().add(back);
			catalog.Items().add(chest);
			catalog.Items().add(wrist);
			catalog.Items().add(hands);
			catalog.Items().add(waist);
			catalog.Items().add(legs);
			catalog.Items().add(feet);
			catalog.Items().add(weapon);
			catalog.Equipments().add(equipment1);
			catalog.Guilds().add(guild1);
			catalog.Characters().add(character1);
			catalog.save();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
