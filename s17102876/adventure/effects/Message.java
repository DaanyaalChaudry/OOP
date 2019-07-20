package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

public class Message implements Effect {

	// declaring variables.
	private String message;

	// Prints message when executed.
	public Message(String message) {
		this.message = message;
	}

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

	}
}