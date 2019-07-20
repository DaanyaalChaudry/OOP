package bcu.s17102876.adventure.model;

public class Item {
	///
	// declaring variables
	String name;
	String description;
	Location location;
	Boolean portable;

	// Class constructor
	public Item(String name, String description) {
		this.name = name;
		this.description = description;
		this.location = null;
		this.portable = false;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isPortable() {
		return portable;
	}

	public void setPortable(boolean portable) {
		this.portable = portable;
	}
}
