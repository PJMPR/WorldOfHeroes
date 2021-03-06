package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CharacterDto {

	private int id;
    private String name;
    private String faction;
	private String race;
    private String job;
    private int lvl;
    private int hp;
    private int damage;
    private int strength;
    private int agility;
    private int intellect;
    private int stamina;
    
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
	public String getFaction() {
		return faction;
	}
	public void setFaction(String faction) {
		this.faction = faction;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
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
	
}
