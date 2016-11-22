package domain.model;

public class Character implements IHaveId {

	private int id;
    private String name;
    private Faction faction;
	private Race race;
    private Classes job;
    private int lvl;
    private int damage;
    private int strength;
    private int agility;
    private int intellect;
    private int stamina;
    private Guild guildId;
    private Player playerId;
    private Item head;
    private Item shoulder;
    private Item back;
    private Item chest;
    private Item wrist;
    private Item hands;
    private Item waist;
    private Item legs;
    private Item feet;
    private Item weapon1;
    private Item weapon2;
    
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
	public Guild getGuildId() {
		return guildId;
	}
	public void setGuildId(Guild guildId) {
		this.guildId = guildId;
	}
	public Player getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Player playerId) {
		this.playerId = playerId;
	}
	public Item getHead() {
		return head;
	}
	public void setHead(Item head) {
		this.head = head;
	}
	public Item getShoulder() {
		return shoulder;
	}
	public void setShoulder(Item shoulder) {
		this.shoulder = shoulder;
	}
	public Item getBack() {
		return back;
	}
	public void setBack(Item back) {
		this.back = back;
	}
	public Item getChest() {
		return chest;
	}
	public void setChest(Item chest) {
		this.chest = chest;
	}
	public Item getWrist() {
		return wrist;
	}
	public void setWrist(Item wrist) {
		this.wrist = wrist;
	}
	public Item getHands() {
		return hands;
	}
	public void setHands(Item hands) {
		this.hands = hands;
	}
	public Item getWaist() {
		return waist;
	}
	public void setWaist(Item waist) {
		this.waist = waist;
	}
	public Item getLegs() {
		return legs;
	}
	public void setLegs(Item legs) {
		this.legs = legs;
	}
	public Item getFeet() {
		return feet;
	}
	public void setFeet(Item feet) {
		this.feet = feet;
	}
	public Item getWeapon1() {
		return weapon1;
	}
	public void setWeapon1(Item weapon1) {
		this.weapon1 = weapon1;
	}
	public Item getWeapon2() {
		return weapon2;
	}
	public void setWeapon2(Item weapon2) {
		this.weapon2 = weapon2;
	}
    
}
