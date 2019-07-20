package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class TakeItem implements Effect {

	// declaring variables.
	private String itemName;

	// a constructor which takes an item name when executed.
	public TakeItem(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}