package bcu.s17102876.adventure.model;

import bcu.s17102876.adventure.effects.Effect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Action {

	// declaring variables
	private String name;
	private List<Item> requiredItem;
	private List<Effect> effect;

	public Action(String name) {
		this.name = name;
		this.requiredItem = new ArrayList<>();
		this.effect = new ArrayList<>();
	}

	// implementing the the method name
	public String getName() {
		return this.name;
	}

	public void addRequiredItem(Item item) {
		this.requiredItem.add(item);
	}

	public boolean isAllowed(Player player) {
		boolean condition = true;
		for (Item itemRequired : this.requiredItem) {
			condition = condition && player.canSeeItem(itemRequired);
		}
		return condition;
	}

	public void addEffect(Effect effect) {
		this.effect.add(effect);
	}

	// returns the unmodifiable list of effects executing the return
	public List<Effect> getEffects() {
		return (List<Effect>) Collections.unmodifiableCollection(this.effect);
	}
}
