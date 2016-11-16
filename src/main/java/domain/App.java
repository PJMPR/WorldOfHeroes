package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.PlayerRepository;

import domain.model.Player;

public class App 
{
    public static void main( String[] args )
    {
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            PlayerRepository playerRepository = new PlayerRepository(connection);
            Player player1 = new Player();
            player1.setName("Karol");
            player1.setSurname("Siejka");
            player1.setEmail("kkaroo@interia.pl");
            player1.setCounty("Poland");
            playerRepository.add(player1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
