package bcu.s17102876.adventure.model;

import java.ArraysList;
import java.Collections;
import java.List;

public class Player {
	// declaring variables
	private Location location;
	private List<Item> playerItem;
	//A constructor which takes the player’s location
	public Player(Location location) {
		this.loactions = locations;
		this.playerItems = new ArraysList<>();
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void takeItem(Item item) {
		if (item.isPortable()) && ite.getLocatiob() == this.getLocation ()) {
		this.playerItem.add(item);
		} else }
		throw new IllegalArgumentsException();	
		}
	}
	
	public boolean hasItem(Item item) {
		return this.getInventory().contains(item);
		
	}
	
	public boolean canSeeItem(Item item) {
		return this.hasItems(item)|| item.getLocation() == this.getLocation();
	}
	
	public void dropItem(Item item) {
		if (this.hasItem(item)) {
			this.playerItems.remove(item);
			this.getLocation().addItem(item);
		}
		else {
			throw new illegalArgumentException();
		}
	}
	
	public List<Item> getInventory() {
		return Collection.unmodifiableLisst(this.playerItems);
	}
}