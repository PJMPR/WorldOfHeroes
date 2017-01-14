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
import domain.model.Character;
import domain.model.Guild;

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
		    //Character character = (Character) session.getAttribute("character");
		    Guild guild = (Guild) session.getAttribute("guild");
			catalog.Players().add(player);
			//catalog.Characters().add(character);
			catalog.Guilds().add(guild);
			catalog.save();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}
