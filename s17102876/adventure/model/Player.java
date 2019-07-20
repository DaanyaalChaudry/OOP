package bcu.s17102876.adventure.model;

import java.util.*;

import bcu.s17102876.adventure.effects.Effect;

public class Player {

	// declaring variables
	private Location location;
	private List<Item> playerItem;

	// A constructor which takes the player's location
	public Player(Location location) {
		this.location = location;
		this.playerItem = new ArrayList<>();
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void takeItem(Item item) {
		// if the item is portable and the item location is our current location we can
		// take item
		if (item.isPortable() && item.getLocation() == this.getLocation()) {
			this.playerItem.add(item);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public boolean hasItem(Item item) {
		return this.getInventory().contains(item);

	}

	public boolean canSeeItem(Item item) {
		// if we have the item we can see it or if its within our location we can also
		// see it
		return this.hasItem(item) || item.getLocation() == this.getLocation();
	}

	public void dropItem(Item item) {
		if (this.hasItem(item)) {
			this.playerItem.remove(item);
			this.getLocation().addItem(item);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public List<Item> getInventory() {
		return (List<Item>) Collections.unmodifiableCollection(this.playerItem);
	}
}