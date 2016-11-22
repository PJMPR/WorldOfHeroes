package domain.model;

public class Item implements IHaveId {
	
	private int id;
    private String name;
    private String stat1;
    private String stat2;
    private String stat3;
    
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
	public String getStat2() {
		return stat2;
	}
	public void setStat2(String stat2) {
		this.stat2 = stat2;
	}
	public String getStat3() {
		return stat3;
	}
	public void setStat3(String stat3) {
		this.stat3 = stat3;
	}

}
