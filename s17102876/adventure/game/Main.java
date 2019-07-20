package bcu.s17102876.adventure.game;

import bcu.s17102876.adventure.effects.Effect;
import bcu.s17102876.adventure.effects.player;
import bcu.s17102876.adventure.effects.world;
import bcu.s17102876.adventure.effects.location;

import java.io.BufferedReader;
import java.io.IOEException;
import java.io.inputStreamReader;

public class Main {
	// declaring the variables
	private World world;
	
	public Main (World world) {
		this.world = world;
	}
	//Process of return when process is not succeeded. Override tells the compiler the intent of this process.
	@override
	public world run ()	{
		player player =  new player (this world.getStaringLocation));
		Effect startingeffect = new locationlocation();
		startingEffect.execute(player, world);
		BufferedReader keyboard = new BufferReadder (new InputStreamReadder) (system.in));
		while (true) {
			try {
				string keybaordInput = keyboard.readLine ();
				Effect effectToExecute = CommandParser.parsePlayerCommand(keyboardinput);
				effectToExecute.execute(player, this.world);
				catch (IQEexception e) {
				catch (QuitException e) {
				break;
				}
			}
		}
	}
}