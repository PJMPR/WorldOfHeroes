package domain.model;

public class Item implements IHaveId {
	
	private int id;
    private String name;
    private String stat1;
    private int value1;
    private String stat2;
    private int value2;
    private String stat3;
    private int value3;
    
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
	public String getStat1() {
		return stat1;
	}
	public void setStat1(String stat1) {
		this.stat1 = stat1;
	}
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public String getStat2() {
		return stat2;
	}
	public void setStat2(String stat2) {
		this.stat2 = stat2;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public String getStat3() {
		return stat3;
	}
	public void setStat3(String stat3) {
		this.stat3 = stat3;
	}
	public int getValue3() {
		return value3;
	}
	public void setValue3(int value3) {
		this.value3 = value3;
	}

}
