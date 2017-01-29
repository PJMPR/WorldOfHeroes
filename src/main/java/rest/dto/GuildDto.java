package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GuildDto {

	private int id;
    private String name;
    private String faction;
    
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
    
}
