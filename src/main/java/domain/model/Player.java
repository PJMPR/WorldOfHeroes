package domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="player")
@NamedQueries({
       @NamedQuery(name = "player.all", query = "SELECT p FROM Player p"),
       @NamedQuery(name = "player.id", query = "SELECT p FROM Player p WHERE p.id=:id")
})
public class Player implements IHaveId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
    private String name;
    private String surname;
    private String email;
    private String country;
    
    @OneToMany(mappedBy="player", fetch = FetchType.LAZY)
    private List<Character> characters = new ArrayList<Character>();

    public List<Character> getCharacters() {
		return characters;
	}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}