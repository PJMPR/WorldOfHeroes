package domain.model;

public class Equipment implements IHaveId {
	
	private int id;
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
