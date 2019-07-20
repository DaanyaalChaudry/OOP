package bcu.s17102876.adventure.game;

public class GoDirection implements Effect {
	// declaring variables
	private String goDirection;
	//causes player to move location.
	public GoDirection (String goDirection) {
		this.goDirection = goDirection;
	}
}