package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Player;

@WebServlet("/playerServlet")
public class PlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Player player = new Player();
		player.setLogin(request.getParameter("login"));
		player.setPassword(request.getParameter("password"));
		player.setName(request.getParameter("name"));
		player.setSurname(request.getParameter("surname"));
		player.setEmail(request.getParameter("email"));
		player.setCountry(request.getParameter("country"));
		HttpSession session = request.getSession();
		session.setAttribute("player", player);
		response.sendRedirect("addCharacter.jsp");
	}
}
