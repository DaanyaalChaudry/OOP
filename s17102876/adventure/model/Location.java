package bcu.s17102876.adventure.model;

import java.util.*;
import java.util.Map;

public class Location {
	// declaring variables
	private String name;
	private String description;
	private Map<String, Location> nextTo;
	private Map<String, Location> neighbours;
	private List<Item> allItemsInTheLocation;
	private Location loc;

	// This location displays location data for example number of house.
	public Location(String name, String description) {
		this.name = name;
		this.description = description;
		this.neighbours = new HashMap<>();
		this.allItemsInTheLocation = new ArrayList<>();
	}

	/* getters */
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void addNeighbour(String direction, Location neighbour) {
		this.nextTo.put(direction, neighbour);
	}

	public Location getNeighbour(String direction) {

		if (this.nextTo.containsKey(direction)) {
			loc = this.neighbours.get(direction);
			return loc;
		}
		return null;
	}

	public Collection<String> getAllDirections() {
		Collection<String> directions = new ArrayList<>();
		for (String direction : this.neighbours.keySet()) {
			directions.add(direction);
		}
		return directions;
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
		if (this.allItemsInTheLocation.contains(item)) {
			this.allItemsInTheLocation.remove(item);
			item.setLocation(null);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
