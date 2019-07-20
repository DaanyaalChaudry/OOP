package bcu.s17102876.adventure.game;

public class TakeItem implements Effect {
	// declaring variables.
	private String itemName;
	//a constructor which takes an item name when executed.
	public TakeItem (String itemName) {
		this.itemName = itemName;
	}	
}