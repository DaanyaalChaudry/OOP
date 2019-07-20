package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class DoAction implements Effect {
	// declaring variables
	private String moveName;

	public DoAction(String moveName) {
		this.moveName = moveName;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}