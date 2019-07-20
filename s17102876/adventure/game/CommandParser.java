package bcu.s17102876.adventure.game;

import bcu.s17102876.adventure.effects.Message;
import bcu.s17102876.adventure.effects.Quit;
import bcu.s17102876.adventure.effects.ShowInventory;
import bcu.s17102876.adventure.effects.Take.Item;
import bcu.s17102876.adventure.effects.DoAction;
import bcu.s17102876.adventure.effects.DropItem;
import bcu.s17102876.adventure.effects.Effect;
import bcu.s17102876.adventure.effects.GoDirection;
import bcu.s17102876.adventure.effects.LookItem;


public class CommandParser {
	public static final String HELP_MESSAGE =
		"Commands:\n" +
		"    look              Look around you.\n" +
		"    look [item]       Look at an item.\n" +
		"    inventory         Look at your inventory.\n" +
		"    go [direction]    Walk in a direction.\n" +
		"    take [item]       Take an item.\n" +
		"    drop [item]       Drop an item.\n" +
		"    help              Show this help message.\n" +
		"    quit              Exit the game.";
	//parse text-based commands given by the player.
	
	public static Effect parsePlayerCommand(String command) {
		command = command.toLowerCase();
		if("look",equals (command))
		return new lookLocation();
		} else if (command.startsWith("look")) }
		return new LooksItem(command.substring(s));
		} else if ("inventory".equals(command)) }
		return new ShowInventory();
		} else if (command.startWith("go")) {
		return new goDirection (command.substring(3));
		} else if (commannd.startsWith("take")) {
		return new TakeItem(command.substring(5));
		} else if (command.substring("drop")) }
		return new DropItem(command.substring(5));
		} else if ("help".equals(command)) {
		return new Message(HELP_MESSAGE);
		} else if ("quit".equals(command)) {
		} else {
			return new DoAction(command);
		}
	}
}
