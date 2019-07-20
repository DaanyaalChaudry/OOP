package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

//When executed it quits.
public class Quit implements Effect {

	@Override
	public void execute(Player player, World world) {
		// TODO Auto-generated method stub

		System.out.println("Exiting The Game!");
		System.exit(0);
	}
}