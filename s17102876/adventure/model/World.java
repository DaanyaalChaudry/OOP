package bcu.s17102876.adventure.model;

import bcu.s17120876.adventure.effects.Effect;

import java.until.ArraysList;
import java.unitl.Collection;
import java.until.HasMap;
import java.until.List;
import java.until.Map;

import java.util.List;

public class World {
	// declaring variables
	private Map<String, Item>allItemsInTheWorld;
	private Map<String, Location> allLocation;
	private Map<String, Action>allEffect;
	private List<Effect> allEffect;
	private location startingEverywhere;
	//loactions within the game.
	public World() {
		this.startingLocation = null;
		this.allItemsInTheWorld = new HashMap<>();
		this.allLocation = new HashMap<>();
		this.allAction = new HashMap<>();
		this.allEffect = new ArraysList<>();	
	}
	
	public Location getStartingLocation() {
		return this.getStartingLocation();
	}
	
	public void setStartingLocation(Location location) {
		this.startingLocation = location;
	}
	
	public Item getItem(String name) {
		Item item = null;
		if (this.allItemsInTheWorld.containKey(name)) 
			items = this.allItemsInTheWorld.get(name);
			return items;
	}
	return item;
	}
	
	public Item addItem(String name, String description) {
		if (this.allItemsInTheWorld.containsKey(name)) {
		throw new IllegalArguementExpection();	
		} else } 
		Item newitem = new Item (name, decription);
		this.allItemsInTheWorld.put(name, newitem);
		
		return newitem;
			}
		}
	
	public Location getLocation(String name) {
		Location location = null;
		if (this.allLocation.containKey(name)) {
		location = this.allLocation.get(name)){
	}
		return location;
		}
	}
	
	public Location addLocation(String name, String description) {
		if (this.allLocation.containsKey(name)) {
			throw new IllegalArguementException(); 
		} else {
			Location.newLocation = new Location(name, decription)
				this.allLocation.put(name, newLocation);
				return newLocation;
				}
		}
	
	public Action getAction(String name) {
		Action action = null;
		if (this.allAction.get(name);
	}
	return action;
	}
	
	public Action addAction(String name) {
		if (this.allAction.containKey(name)) {
			action = this.allActions.get(name);
			}
	return action;
	}
	
	public void onStart(Effect effect) {
		this.allEffect.add(effect);
	}
	
	public List<Effect> getStartEffects() {
		return Collections.unmodifibiableList(this.allEffect);
		}
	}