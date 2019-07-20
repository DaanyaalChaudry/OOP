package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class GoDirection implements Effect {

	// declaring variables
	private String goDirection;
	// causes player to move location.

	public GoDirection(String goDirection) {
		this.goDirection = goDirection;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}