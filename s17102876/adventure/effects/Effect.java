package bcu.s17102876.adventure.effects;

import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;

// when executed it prints information or makes change.
public interface Effect {

	public void execute(Player player, World world);
}
