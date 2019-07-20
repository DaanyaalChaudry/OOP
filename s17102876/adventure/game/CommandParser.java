package bcu.s17102876.adventure.game;

import bcu.s17102876.adventure.effects.DoAction;
import bcu.s17102876.adventure.effects.DropItem;
import bcu.s17102876.adventure.effects.Effect;
import bcu.s17102876.adventure.effects.GoDirection;
import bcu.s17102876.adventure.effects.LookItem;
import bcu.s17102876.adventure.effects.LookLocation;
import bcu.s17102876.adventure.effects.Message;
import bcu.s17102876.adventure.effects.Quit;
import bcu.s17102876.adventure.effects.ShowInventory;
import bcu.s17102876.adventure.effects.TakeItem;

public class CommandParser {
	public static final String HELP_MESSAGE = "Commands:\n" + "    look              Look around you.\n"
			+ "    look [item]       Look at an item.\n" + "    inventory         Look at your inventory.\n"
			+ "    go [direction]    Walk in a direction.\n" + "    take [item]       Take an item.\n"
			+ "    drop [item]       Drop an item.\n" + "    help              Show this help message.\n"
			+ "    quit              Exit the game.";
	// parse text-based commands given by the player.

	public static Effect parsePlayerCommand(String command) {

		// convert to a single case so we don't have to compare every type of way a user
		// could enter a command
		command = command.toLowerCase();

		if (command.equals("look"))
			return new LookLocation();

		else if (command.equals("look"))
			return new LookItem(command.substring(4));

		else if (command.equals("go"))
			return new GoDirection(command.substring(3));

		else if (command.equals("take"))
			return new TakeItem(command.substring(5));

		else if (command.equals("drop"))
			return new DropItem(command.substring(5));

		else if (command.equals("inventory"))
			return new ShowInventory();

		else if (command.equals("help"))
			return new Message(HELP_MESSAGE);

		else if (command.equals("quit"))
			return new Quit();

		else
			return new DoAction(command);
	}
}
