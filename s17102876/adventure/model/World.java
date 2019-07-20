package bcu.s17102876.adventure.model;

import bcu.s17102876.adventure.effects.*;
import bcu.s17102876.adventure.test.*;
import bcu.s17102876.adventure.model.*;
import java.util.*;

public class World {

	// declaring variables
	private Map<String, Item> allItemsInTheWorld;
	private Map<String, Location> allLocation;
	private Map<String, Action> allAction;
	private List<Effect> allEffect;
	private Location startingLocation;
	Action action = null;

	// locations within the game.
	public World() {
		this.startingLocation = null;
		this.allItemsInTheWorld = new HashMap<>();
		this.allLocation = new HashMap<>();
		this.allAction = new HashMap<>();
		this.allEffect = new ArrayList<>();
	}

	/* getters and setters */

	public Location getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(Location location) {
		this.startingLocation = location;
	}

	public Item getItem(String name) {
		Item item = null;
		if (this.allItemsInTheWorld.containsKey(name))
			item = this.allItemsInTheWorld.get(name);
		return item;
	}

	public Item addItem(String name, String description) {
		Item newitem = new Item(name, description);

		if (this.allItemsInTheWorld.containsKey(name)) {
			throw new IllegalArgumentException();
		} else {
			this.allItemsInTheWorld.put(name, newitem);
		}
		return newitem;
	}

	public Location getLocation(String name) {
		Location location = null;
		if (this.allLocation.containsKey(name)) {
			location = this.allLocation.get(name);
		}
		return location;
	}

	public Location addLocation(String name, String description) {
		if (this.allLocation.containsKey(name)) {
			throw new IllegalArgumentException();
		} else {
			Location newLocation = new Location(name, description);
			this.allLocation.put(name, newLocation);
			return newLocation;
		}
	}

	public Action getAction(String name) {

		if (this.allAction.get(name) != null) {
			return action;
		} else
			return null;
	}

	public Action addAction(String name) {
		if (this.allAction.containsKey(name)) {
			action = this.allAction.get(name);
		}
		return action;
	}

	public void onStart(Effect effect) {
		this.allEffect.add(effect);
	}

	public List<Effect> getStartEffects() {
		return Collections.unmodifiableList(this.allEffect);
	}
}