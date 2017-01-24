package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Character;
import domain.model.Guild;
import domain.model.Player;

@WebServlet("/characterServlet")
public class CharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        HttpSession session = request.getSession();
        Player player = (Player) session.getAttribute("player");
        if(player==null)
        { 
        	response.sendRedirect("/addPlayer.html");
        }
		Guild guild = new Guild();
		guild.setName(request.getParameter("guild_name"));
		guild.setFaction(request.getParameter("faction"));
		session.setAttribute("guild", guild);
		Character character = new Character();
		Integer lvl = new Integer(request.getParameter("lvl"));
		character.setName(request.getParameter("name"));
		character.setFaction(request.getParameter("faction"));
		character.setRace(request.getParameter("race"));
		character.setJob(request.getParameter("job"));
		character.setLvl(lvl);
		character.setHp(100);
		character.setDamage(100);
		character.setStamina(100);
		character.setStrength(100);
		character.setIntellect(100);
		character.setAgility(100);
		character.setGuildId(0);
		character.setPlayerId(0);
		character.setEquipmentId(0);
		session.setAttribute("character", character);
		response.sendRedirect("/addEquipment.html");
	}

}
