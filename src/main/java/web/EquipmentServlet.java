package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.model.Character;
import domain.model.Equipment;
import domain.model.Item;

@WebServlet("/equipmentServlet")
public class EquipmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Character character = (Character) session.getAttribute("character");
        if(character==null)
        { 
        	response.sendRedirect("addCharacter.html");
        }
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
		head.setName(request.getParameter("head_name"));
		head.setStat1(request.getParameter("head_stat1"));
		head.setValue1(Integer.parseInt(request.getParameter("head_value1")));
		head.setStat2(request.getParameter("head_stat2"));
		head.setValue2(Integer.parseInt(request.getParameter("head_value2")));
		head.setStat3(request.getParameter("head_stat3"));
		head.setValue3(Integer.parseInt(request.getParameter("head_value3")));
		session.setAttribute("head", head);
		shoulder.setName(request.getParameter("shoulder_name"));
		shoulder.setStat1(request.getParameter("shoulder_stat1"));
		shoulder.setValue1(Integer.parseInt(request.getParameter("shoulder_value1")));
		shoulder.setStat2(request.getParameter("shoulder_stat2"));
		shoulder.setValue2(Integer.parseInt(request.getParameter("shoulder_value2")));
		shoulder.setStat3(request.getParameter("shoulder_stat3"));
		shoulder.setValue3(Integer.parseInt(request.getParameter("shoulder_value3")));
		session.setAttribute("shoulder", shoulder);
		back.setName(request.getParameter("back_name"));
		back.setStat1(request.getParameter("back_stat1"));
		back.setValue1(Integer.parseInt(request.getParameter("back_value1")));
		back.setStat2(request.getParameter("back_stat2"));
		back.setValue2(Integer.parseInt(request.getParameter("back_value2")));
		back.setStat3(request.getParameter("back_stat3"));
		back.setValue3(Integer.parseInt(request.getParameter("back_value3")));
		session.setAttribute("back", back);
		chest.setName(request.getParameter("chest_name"));
		chest.setStat1(request.getParameter("chest_stat1"));
		chest.setValue1(Integer.parseInt(request.getParameter("chest_value1")));
		chest.setStat2(request.getParameter("chest_stat2"));
		chest.setValue2(Integer.parseInt(request.getParameter("chest_value2")));
		chest.setStat3(request.getParameter("chest_stat3"));
		chest.setValue3(Integer.parseInt(request.getParameter("chest_value3")));
		session.setAttribute("chest", chest);
		wrist.setName(request.getParameter("wrist_name"));
		wrist.setStat1(request.getParameter("wrist_stat1"));
		wrist.setValue1(Integer.parseInt(request.getParameter("wrist_value1")));
		wrist.setStat2(request.getParameter("wrist_stat2"));
		wrist.setValue2(Integer.parseInt(request.getParameter("wrist_value2")));
		wrist.setStat3(request.getParameter("wrist_stat3"));
		wrist.setValue3(Integer.parseInt(request.getParameter("wrist_value3")));
		session.setAttribute("wrist", wrist);
		hands.setName(request.getParameter("hands_name"));
		hands.setStat1(request.getParameter("hands_stat1"));
		hands.setValue1(Integer.parseInt(request.getParameter("hands_value1")));
		hands.setStat2(request.getParameter("hands_stat2"));
		hands.setValue2(Integer.parseInt(request.getParameter("hands_value2")));
		hands.setStat3(request.getParameter("hands_stat3"));
		hands.setValue3(Integer.parseInt(request.getParameter("hands_value3")));
		session.setAttribute("hands", hands);
		waist.setName(request.getParameter("waist_name"));
		waist.setStat1(request.getParameter("waist_stat1"));
		waist.setValue1(Integer.parseInt(request.getParameter("waist_value1")));
		waist.setStat2(request.getParameter("waist_stat2"));
		waist.setValue2(Integer.parseInt(request.getParameter("waist_value2")));
		waist.setStat3(request.getParameter("waist_stat3"));
		waist.setValue3(Integer.parseInt(request.getParameter("waist_value3")));
		session.setAttribute("waist", waist);
		legs.setName(request.getParameter("legs_name"));
		legs.setStat1(request.getParameter("legs_stat1"));
		legs.setValue1(Integer.parseInt(request.getParameter("legs_value1")));
		legs.setStat2(request.getParameter("legs_stat2"));
		legs.setValue2(Integer.parseInt(request.getParameter("legs_value2")));
		legs.setStat3(request.getParameter("legs_stat3"));
		legs.setValue3(Integer.parseInt(request.getParameter("legs_value3")));
		session.setAttribute("legs", legs);
		feet.setName(request.getParameter("feet_name"));
		feet.setStat1(request.getParameter("feet_stat1"));
		feet.setValue1(Integer.parseInt(request.getParameter("feet_value1")));
		feet.setStat2(request.getParameter("feet_stat2"));
		feet.setValue2(Integer.parseInt(request.getParameter("feet_value2")));
		feet.setStat3(request.getParameter("feet_stat3"));
		feet.setValue3(Integer.parseInt(request.getParameter("feet_value3")));
		session.setAttribute("feet", feet);
		weapon.setName(request.getParameter("weapon_name"));
		weapon.setStat1(request.getParameter("weapon_stat1"));
		weapon.setValue1(Integer.parseInt(request.getParameter("weapon_value1")));
		weapon.setStat2(request.getParameter("weapon_stat2"));
		weapon.setValue2(Integer.parseInt(request.getParameter("weapon_value2")));
		weapon.setStat3(request.getParameter("weapon_stat3"));
		weapon.setValue3(Integer.parseInt(request.getParameter("weapon_value3")));
		session.setAttribute("weapon", weapon);
		Equipment equipment = new Equipment();
		equipment.setHeadId(0);
		equipment.setShoulderId(1);
		equipment.setBackId(2);
		equipment.setChestId(3);
		equipment.setWristId(4);
		equipment.setHandsId(5);
		equipment.setWaistId(6);
		equipment.setLegsId(7);
		equipment.setFeetId(8);
		equipment.setWeaponId(9);
		session.setAttribute("equipment", equipment);
		response.sendRedirect("final.jsp");
	}

}
