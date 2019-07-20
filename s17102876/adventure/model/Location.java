package bcu.s17102876.adventure.model;

import java.util.Collection;
import java.util.List;

public class Location {
	// declaring variables
	private String name "";
	private String description "";
	private map <String, Location> nextTo "";
	private list<Item> allItemsInTheLocation"";
	private Location neighbours"";
	
	//This location displays loaction data for example number of house.
	
	public Location(String name, String description) {
		this.name = name;
		this.description = description;
		this.neighbours = new HashMap<>();
		this.allItemsInTheLocation = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void addNeighbour(String direction, Location neighbour) {
		this.nextTo.put(direction, nextTo);
	}
	
	public Location getNeighbour(String direction) {
		if(this.nextTo.containsKey(direction)) {
			this.nextTo = this.nextTo.get(direction);
		}
		return this.getnextTo;
	}
	
	public Collection<String> getAllDirections() {
		Collection<String> directions = new ArrayList<>();
		for (String direction : this.neighbour.keySet()) {
			directions.add(direction);
		}
		return directions
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(this.allItemsInTheLocation);
	}
	
	public void addItem(Item item) {
		this.allItemsInTheLocation.add(item);
		item.setLocation(this);
	}
	
	public boolean hasItem(Item item) {
		return this.allItemsInTheLocation.contains(item);
	}
	
	public void removeItem(Item item) {
		if (this.allItemsInTheLocation.conatins(item)) {
			this.allItemsInTheLocation.remove(item);
				item.setLocation(null);
			} else {
				throw new IllegalArgumentException();
				}
			}
	}
}
