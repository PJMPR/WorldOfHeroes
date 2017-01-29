package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;
import domain.model.Player;
import domain.model.Guild;
import domain.model.Item;
import domain.model.Character;
import domain.model.Equipment;

@WebServlet("/dbServlet")
public class DbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DbServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			connection.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
			IUnitOfWork uow = new UnitOfWork(connection);
			IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
			HttpSession session = request.getSession();
			Player player = (Player) session.getAttribute("player");
		    Character character = (Character) session.getAttribute("character");
		    Guild guild = (Guild) session.getAttribute("guild");
		    Equipment equipment = (Equipment) session.getAttribute("equipment");
		    Item head = (Item) session.getAttribute("head");
			Item shoulder = (Item) session.getAttribute("shoulder");
			Item back = (Item) session.getAttribute("back");
			Item chest = (Item) session.getAttribute("chest");
			Item wrist = (Item) session.getAttribute("wrist");
			Item hands = (Item) session.getAttribute("hands");
			Item waist = (Item) session.getAttribute("waist");
			Item legs = (Item) session.getAttribute("legs");
			Item feet = (Item) session.getAttribute("feet");
			Item weapon = (Item) session.getAttribute("weapon");
			catalog.Players().add(player);
			catalog.save();
			int playerId = catalog.Players().getLastId();
			player.setId(playerId);
			catalog.Items().add(head);
			catalog.save();
			catalog.Items().add(shoulder);
			catalog.save();
			catalog.Items().add(back);
			catalog.save();
			catalog.Items().add(chest);
			catalog.save();
			catalog.Items().add(wrist);
			catalog.save();
			catalog.Items().add(hands);
			catalog.save();
			catalog.Items().add(waist);
			catalog.save();
			catalog.Items().add(legs);
			catalog.save();
			catalog.Items().add(feet);
			catalog.save();
			catalog.Items().add(weapon);
			catalog.save();
			catalog.Equipments().add(equipment);
			catalog.save();
			int equipmentId = catalog.Equipments().getLastId();
			equipment.setId(equipmentId);
			catalog.Guilds().add(guild);
			catalog.save();
			int guildId = catalog.Equipments().getLastId();
			guild.setId(guildId);
			character.setPlayer(player);
			character.setGuild(guild);
			character.setEquipment(equipment);
			catalog.Characters().add(character);
			catalog.save();
			session.removeAttribute("player");
		    session.removeAttribute("character");
		    session.removeAttribute("guild");
		    session.removeAttribute("equipment");
		    session.removeAttribute("head");
			session.removeAttribute("shoulder");
			session.removeAttribute("back");
			session.removeAttribute("chest");
			session.removeAttribute("wrist");
			session.removeAttribute("hands");
			session.removeAttribute("waist");
			session.removeAttribute("legs");
			session.removeAttribute("feet");
			session.removeAttribute("weapon");
			response.sendRedirect("index.html");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
