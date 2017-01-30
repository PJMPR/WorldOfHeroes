<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="dao.RepositoryCatalog" %>
<%@page import="domain.model.Race" %>
<%@page import="domain.model.Faction" %>
<%@page import="domain.model.Classes" %>
<%@page import="domain.App" %>
<%@page import="java.util.Arrays" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Utwórz postać</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <form enctype="text/plain">
                <div>
                    Imie postaci:</br>
                    <input name="name" value="Glonfindel" required/></br>
                    Frakcja:</br>
                    <select name="faction">
                        <%
                        try {
                        	List<Faction> factions = Arrays.asList(Faction.values());
                           for(Faction faction:factions){
                        %><option value="<%=faction%>"><%=faction%></option>
                        <%
                           }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        %>
                    </select> </br>
                    Rasa:</br>
                    <select name="race">
                        <%
                        try {
                        	List<Race> races = Arrays.asList(Race.values());
                           for(Race race:races){
                        %><option value="<%=race%>"><%=race%></option>
                        <%
                           }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        %>
                    </select> </br>
                    Klasa:</br>
                    <select name="job">
                        <%
                        try {
                        	List<Classes> jobs = Arrays.asList(Classes.values());
                           for(Classes job:jobs){
                        %><option value="<%=job%>"><%=job%></option>
                        <%
                           }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        %>
                    </select> </br>
					Poziom:</br>
                    <input name="lvl" value="110" required/></br>
                    
                    Nazwa gildii:</br>
                    <input name="guild_name" value="Sarmatia" required/></br>
                </div>
                <input type="submit" formaction="characterServlet" value="Dodaj postać" />
            </form>              
        </div>
    </body>
</html>
