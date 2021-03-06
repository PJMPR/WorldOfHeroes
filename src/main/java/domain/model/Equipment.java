package domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="equipment")
@NamedQueries({
       @NamedQuery(name = "equipment.all", query = "SELECT e FROM Equipment e"),
       @NamedQuery(name = "equipment.id", query = "SELECT e FROM Equipment e WHERE e.id=:id")
})
public class Equipment implements IHaveId {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "head")
    private int headId;
	@Column(name = "shoulder")
    private int shoulderId;
	@Column(name = "back")
    private int backId;
	@Column(name = "chest")
    private int chestId;
	@Column(name = "wrist")
    private int wristId;
	@Column(name = "hands")
    private int handsId;
	@Column(name = "waist")
    private int waistId;
	@Column(name = "legs")
    private int legsId;
	@Column(name = "feet")
    private int feetId;
	@Column(name = "weapon")
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
