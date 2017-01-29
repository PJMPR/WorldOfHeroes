package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EquipmentDto {

	private int id;
    private int headId;
    private int shoulderId;
    private int backId;
    private int chestId;
    private int wristId;
    private int handsId;
    private int waistId;
    private int legsId;
    private int feetId;
    private int weaponId;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHeadId() {
		return headId;
	}
	public void setHeadId(int headId) {
		this.headId = headId;
	}
	public int getShoulderId() {
		return shoulderId;
	}
	public void setShoulderId(int shoulderId) {
		this.shoulderId = shoulderId;
	}
	public int getBackId() {
		return backId;
	}
	public void setBackId(int backId) {
		this.backId = backId;
	}
	public int getChestId() {
		return chestId;
	}
	public void setChestId(int chestId) {
		this.chestId = chestId;
	}
	public int getWristId() {
		return wristId;
	}
	public void setWristId(int wristId) {
		this.wristId = wristId;
	}
	public int getHandsId() {
		return handsId;
	}
	public void setHandsId(int handsId) {
		this.handsId = handsId;
	}
	public int getWaistId() {
		return waistId;
	}
	public void setWaistId(int waistId) {
		this.waistId = waistId;
	}
	public int getLegsId() {
		return legsId;
	}
	public void setLegsId(int legsId) {
		this.legsId = legsId;
	}
	public int getFeetId() {
		return feetId;
	}
	public void setFeetId(int feetId) {
		this.feetId = feetId;
	}
	public int getWeaponId() {
		return weaponId;
	}
	public void setWeaponId(int weaponId) {
		this.weaponId = weaponId;
	}
	
}
