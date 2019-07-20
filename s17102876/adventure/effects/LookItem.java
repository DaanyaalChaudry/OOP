package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class LookItem implements Effect {

	// declaring variables
	private String itemName;

	public LookItem(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}