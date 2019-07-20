package bcu.s17102876.adventure.game;

public class DropItem implements Effect {
	// declaring variables
	private String itemName;
	//When executed, this effect causes the player to remove that item from their inventory.
	public DropItem (String itemName) {
		this.name = itemName;
	}
}