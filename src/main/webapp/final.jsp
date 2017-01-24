<%@page import="domain.model.Item"%>
<%@page import="domain.model.Equipment"%>
<%@page import="java.util.List"%>
<%@page import="domain.model.Player"%>
<%@page import="domain.model.Character"%>
<%@page import="domain.model.Guild"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<%
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
	%>
	<h1>Gracz</h1>
	<h2>Login: <%=player.getLogin() %></h2>
	<h2>Hasło: <%=player.getPassword() %></h2>
	<h2>Imie: <%=player.getName() %></h2>
	<h2>Nazwisko: <%=player.getSurname() %></h2>
	<h2>Email: <%=player.getEmail() %></h2>
	<h2>Kraj: <%=player.getCounty() %></h2>
	<h1>Postać</h1>
	<h2>Imie postaci: <%=character.getName() %></h2>
	<h2>Frakcja: <%=character.getFaction() %></h2>
	<h2>Rasa: <%=character.getRace() %></h2>
	<h2>Klasa: <%=character.getJob() %></h2>
	<h2>Poziom: <%=character.getLvl() %></h2>
	<h1>Gildia</h1>
	<h2>Nazwa gildii: <%=guild.getName() %></h2>
	<h1>Ekwipunek</h1>
	<h2>Głowa: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Ramiona: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Plecy: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Klata: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Nadgarstek: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Ręce: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Pasek: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Nogi: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Stopy: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<h2>Broń: <%=head.getName() %></h2>
	<h2><%=head.getStat1() %>:<%=head.getValue1() %></h2>
	<h2><%=head.getStat2() %>:<%=head.getValue2() %></h2>
	<h2><%=head.getStat3() %>:<%=head.getValue3() %></h2>
	<form action="dbServlet" method="get">
	<input type="submit" value="Zapisz">
	</form>
</body>
</html>