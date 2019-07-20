package bcu.S17102876.adventure.model;

public class Item {
	// declaring variables
	this.name = name;
	this.description = description;
	//Item class
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public Location getLocation() {
		return null;
	}
	
	public void setLocation(Location location) {
	}
	
	public boolean isPortable() {
		return false;
	}
	
	public void setPortable(boolean portable) {
	}
}
