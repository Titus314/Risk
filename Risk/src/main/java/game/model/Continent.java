package game.model;

public enum Continent {
	EUROPE("Europe"), 
	NORTHAMERICA("North America"), 
	SOUTHAMERICA("South America"), 
	ASIA("Asia"), 
	AUSTRALIA("Australia"), 
	AFRICA("Africa");
	private String name;

	private Continent(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
