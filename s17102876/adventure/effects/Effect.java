package bcu.s17102876.adventure.effects;

import bcu.changeme.adventure.model.Player;
import bcu.changeme.adventure.model.World;
// when excuted it prints information or makes change.
public interface Effect {
	public void execute(Player player, World world);
}
