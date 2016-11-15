package domain.model;

public class Character {

	private int id;
    private String name;
    private Faction faction;
	private Race race;
    private Classes job;
    private int lvl;
    private int strength;
    private int agility;
    private int intellect;
    private int stamina;
    private int guildId;
    private int playerId;
    
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
	
	public Race getRace() {
		return race;
	}
	
	public void setRace(Race race) {
		this.race = race;
	}
	
	public Classes getJob() {
		return job;
	}
	
	public void setJob(Classes job) {
		this.job = job;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getAgility() {
		return agility;
	}
	
	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	public int getIntellect() {
		return intellect;
	}
	
	public void setIntellect(int intellect) {
		this.intellect = intellect;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public int getGuildId() {
		return guildId;
	}
	
	public void setGuildId(int guildId) {
		this.guildId = guildId;
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
    
}
