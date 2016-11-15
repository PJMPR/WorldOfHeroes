package domain.model;

public class Guild {

	private int id;
    private String name;
    private Faction faction;
    
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Faction getFaction() {
		return faction;
	}
	
	public void setFaction(Faction faction) {
		this.faction = faction;
	}
    
}
