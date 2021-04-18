package Artemis;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {

	/**
	 * @param args
	 */

	private static ArrayList<Player> players = new ArrayList<Player>();
	private static ArrayList<Element> squares = new ArrayList<Element>();
	// private static ArrayList<Systems> artimisSystem = new ArrayList<Systems>();
	// private static ArrayList<ArtemisSystems> artemisSystems = new
	// ArrayList<ArtemisSystems>();
	private static ArrayList<Systems> artemisSystems = new ArrayList<Systems>();
	private static final int NUM_SPACES_ON_BOARD = 12;

	/**
	 * redundant code public static String getInputName(Scanner input) { String name
	 * =""; System.out.print("Please enter your name: "); name = input.nextLine();
	 * return name; }
	 * 
	 * public static void registerPlayers(String name) { Player any = new
	 * Player(name); players.add(any); }
	 * 
	 * public static int rollDice() { // moved to class Dice Random dice = new
	 * Random(); int die1 = dice.nextInt(5)+1; //I can never remember if this starts
	 * at 0 or 1 so it might be (6). int die2 = dice.nextInt(5)+1; int sum =
	 * die1+die2; return sum; }
	 * 
	 * 
	 */

	public static void mainMenu() {
		System.out.println();
		System.out.println("Please choose from the following options:");
		System.out.println("1: Roll dice");
		System.out.println("2: Check inventory");
		System.out.println("3: Exit game");

	}

	public static int actionMenu(Scanner input) {
		mainMenu();
		String user = "";
		int option = 1;
		boolean done = false;
		do {
			user = input.nextLine();
			option = Integer.valueOf(user);
			if (option >= 1 && option <= 3) {
				done = true;
			} else {
				System.out.println("please enter a valid menu option");
			}

		} while (!done);

		return option;
	}

	public static void createArtemisSystem() {
		// ArtemisSystems orion = new Systems("Orion", "test", 2000, 500, 2);
		Systems orion = new Systems();
		artemisSystems.add(orion);
	}

	public static void registerPlayers(Scanner input) {
		// setting player numbers
		int num;
		do {
			System.out.print("Please enter the number of players.  Must be between 2 and 4: ");
			num = input.nextInt();
			input.nextLine();
		} while (num < 2 || num > 4);

		// setting player names based on number of players entered above
		String name = "";
		for (int i = 1; i <= num; i++) {
			System.out.print("Please enter your name:  ");
			name = input.nextLine();
			Player any = new Player(name);
			players.add(any);
		}

		System.out.println(players.toString()); // need to tidy this up not to string but a nice printout of starting
												// details
		System.out.println(players.size()); // purely to check the number is correct.

	}

	// arrayList to set the squares of the board game based on Elements class
	// need to integrate with Systems for cost, rent and ownership/plant flag -
	// check with Emily

	public static void boardGame(ArrayList<Element> squares) {

		Element cc = new Element("Cape Canaverol", "", "", "", "", 1, 0);

		Element orion1 = new Element("CrewModule", "Environmental control and life support system", "Heat Shield",
				"Parachutes for landing phase", "Assemble all minor devs", 2, 0);

		Element orion2 = new Element("Service Module", "Solar Array Wings", "Fairing Panels",
				"Spacecraft adapter jettison fairings", "Assemble all minor devs", 3, 0);

		Element orion3 = new Element("Launch Abort System", "Jettison Motor", "Altitude Control Motor", "Abort Motor",
				"Assemble all minor devs", 4, 0);
		Element spacesuits1 = new Element("xEMU - Eploration Extravehicular Activity Mobility Unit", "xEMU Space Torso",
				"xEMU Space Pants", "xEMU Injury and training", "xEMU unit deployment", 5, 0);

		Element spacesuits2 = new Element("Portable Life Support System", "Oxygen Pressure Controls",
				"Thermal Loop and Ventilation", "Water Loop for hydration", "Avionics Electonics", 6, 0);

		Element holiday = new Element("Take a Holiday", "", "", "", "", 7, 0);

		Element sls1 = new Element("Cargo Hold Module", "95 ton capacity ", "105 ton capacity ", "130 ton capacity",
				"Deep Space Modules", 8, 0);

		Element sls2 = new Element("Core Stage Module", "RS-25 Engine ", "Hydrogen/Oxygen Mixer", "Quad RS-25 engines",
				"Engine Interface Unit", 9, 0);
		Element sls3 = new Element("Boosters", "Solid Rocket Booster", "Interim Cyrogenic Propulsion Stage",
				"Expolations Upper stage", "Engine Hellocentric Orbit achieveable", 10, 0);

		Element exgs1 = new Element("Launch", "Landing Runway", "Landing Pads", "Launch 39B",
				"Launch Control Center Simulations", 11, 0);

		Element exgs2 = new Element("Ground Equipment", "Mobile Launcher", "Vehicle Assembly Building",
				"Crawler-Transporter", "Launch Control Centers Young-Crippen Firing Room 1", 12, 0);

		squares.add(new Element("Cape Canaverol", 1));
		squares.add(cc);
		squares.add(new Element("Orion - Crew Module", 2));
		squares.add(orion1);
		squares.add(new Element("Orion - Service Module", 3));
		squares.add(orion2);
		squares.add(new Element("Orion - Launch Abort System", 4));
		squares.add(orion3);
		squares.add(new Element("Spacesuits - xEMU - Eploration Extravehicular Activity Mobility Unit", 5));
		squares.add(spacesuits1);
		squares.add(new Element("Spacesuits - Portable Life Support System", 6));
		squares.add(spacesuits2);
		squares.add(new Element("Relax - Take A holiday", 7));
		squares.add(holiday);
		squares.add(new Element("Space Launch System - Cargo Hold Module", 8));
		squares.add(sls1);
		squares.add(new Element("Space Launch System - Core Stage Module", 9));
		squares.add(sls2);
		squares.add(new Element("Space Launch System - Boosters", 10));
		squares.add(sls3);
		squares.add(new Element("Exploration Ground Services - Launch", 11));
		squares.add(exgs1);
		squares.add(new Element("Exploration Ground Services - Ground Equipment", 12));
		squares.add(exgs2);

	}

	public static void checkInventory(int p) {
		// might need to assign
		Player playerStock = players.get(p);
		// Systems sysdev = new Systems(); ------- need to work out how to tie into
		// System
		// sysdev.setCustodian(playerStock.getName());
		// String dev = sysdev.getCustodian();
		String name = playerStock.getName();
		int credits = playerStock.getNASAcredits();

		System.out.println(
				"Player: " + name + " your have: " + credits + " NASA credits and hold the following developments:");
	}

	public static void move(int counter) {
		Dice roll = new Dice();
		int rollOutcome = roll.rollDice();
		Player activePlayer = players.get(counter);
		System.out.println(activePlayer + " you rolled " + rollOutcome);

		System.out.println();

		System.out.println(activePlayer.getSpace());
		int move = activePlayer.getSpace() + rollOutcome;
		System.out.println(
				activePlayer + " you are in space " + activePlayer.getSpace() + " and you will move to space " + move);

		if (move > NUM_SPACES_ON_BOARD) {
			activePlayer.setSpace(move - NUM_SPACES_ON_BOARD); // this effectively resets the start count to 1 to start
																// the count from Cape Canaveral again for that player.

			if (activePlayer.getSpace() != 1) { // in other words they are not on Cape Canaveral
				System.out.println("You have passed Cape Canaveral!  Collect 30 units");
				activePlayer.setNASAcredits(30);
			}

			if (activePlayer.getSpace() == 1) { // on Cape Canaveral
				System.out.println("You have arrived1" + " at Cape Canaveral!  Collect 30 units");
				System.out.println();
				activePlayer.setNASAcredits(30);
			}
		} else {
			activePlayer.moveSpace(rollOutcome);
			// System.out.println(squares.toString());

			System.out.println(activePlayer + "has landed on : " + squares.get(move).getElementName()); // arrayList to
																										// get element
																										// name
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/**
		 * redundant code String name = getInputName(input);
		 */

		// method to register players.
		registerPlayers(input);
		boardGame(squares);
		// checkInventory(1);
		boolean done = false;
		int counter = 0;

		do {

			System.out.println(players.get(counter) + " it is your turn. ");
			int choice = actionMenu(input);
			switch (choice) {
			case 1:
				move(counter);
				break;
			case 2:
				checkInventory(0);

				break;
			case 3:
				System.out.println("You have chosen to exit game");
				done = true;
				break;
			}
			counter++;
			if (counter > players.size() - 1) { // stops exception being thrown b/c counter goes beyond arraylist size
												// and resets the counter to zero - and therefore first person's go.
				counter = 0;
			}

		} while (done == false);

	}

}
