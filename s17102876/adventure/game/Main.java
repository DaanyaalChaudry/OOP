package bcu.s17102876.adventure.game;

import bcu.s17102876.adventure.effects.Effect;
import bcu.s17102876.adventure.model.Player;
import bcu.s17102876.adventure.model.World;
import java.io.*;

public class Main implements Runnable {

	// declaring the variables
	private World world;
	private Effect effect;

	public Main(World world) {
		this.world = world;
	}

	public void World() {

		Player player = new Player(this.world.getStartingLocation());
		Effect startingeffect = effect;

		startingeffect.execute(player, world);

		while (true) {

			// setup and new input stream and buffered reader to scan for input from the user
			InputStreamReader inputStream = new InputStreamReader(System.in);
			BufferedReader scanKeyboard = new BufferedReader(inputStream);

			String keyboardInput;

			try {

				keyboardInput = scanKeyboard.readLine();
				Effect effectToExecute = CommandParser.parsePlayerCommand(keyboardInput);
				effectToExecute.execute(player, this.world);
			} catch (IOException e) {
				break;
			}
		}
	}

	@Override
	public void run() {
		World();
	}
	// Override tells the compiler the intent of this process.
}
