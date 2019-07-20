package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class DropItem implements Effect {

	// declaring variables
	private String itemName;

	// When executed, this effect causes the player to remove that item from their
	// inventory.
	public DropItem(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}