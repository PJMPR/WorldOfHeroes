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
	<form action="dbServlet" method="get">
	<input type="submit" value="Zapisz">
	</form>
</body>
</html>