package Artemis;

import java.util.ArrayList;
import java.util.Scanner;

public class playGame {

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
			//Player any = new Player(name);
			//players.add(any);
		}

		System.out.println(players.toString()); // need to tidy this up not to string but a nice printout of starting
												// details
		System.out.println(players.size()); // purely to check the number is correct.

	}


	//EJ work added here method to build the elements objects for each square on the board
	public static ArrayList<Element> systemsBuild() {
		// building the orion space craft system
		ArrayList<Element> boardGameElements = new ArrayList<Element>();

		//system 1 'Orion Space craft' elements (3 squares)
		Element e1 = new Element("Crew Module", "Orion Spacecraft", "Environmental Control and Life Support System", "Heat Shield",
				"Parachutes", "Assemble Minor Developments", 2);
		Element e2 = new Element("Service Module", "Orion Spacecraft",  "Solar Array Wings", "Fairing Panels",
				"Spacecraft adaptor jettison fairings", "Assemble Minor Developments", 3);
		Element e3 = new Element("Launch Abort Module","Orion Spacecraft",  "Jettison Motor", "Altitude Control", "Abort motor",
				"Assemble Minor Developments", 4);
		

		//system 2 'Space suits' elements (2 squares)

		Element e4 = new Element("Exploration Extravehicular Activity Mobility Unit", "Spacesuits", "Space Torso", "Space Pants",
				"Space suit training", "Unit Deployment", 5);
		Element e5 = new Element("Portable Life Support System", "Spacesuits", "Oxegen Pressure Controls", "Ventilation Therma Loop",
				"Hydration Water Loop", "Avionics Electronics", 6);
		

		//system 3 'SLS' elements (3 squares)
		Element e6 = new Element("Cargo Hold Module", "Space Launch System", "95 ton capacity", "105 ton capacity",
				"130 ton capacity", "Superlarge capcity for deep space", 8);
		Element e7 = new Element("Core Stage Module", "Space Launch System", "RS-25 Engine", "Hydrogen Oxegen Mixer",
				"Quad RS-25 engine", "Engine Interface Unit", 9);
		Element e8 = new Element("Boosters", "Space Launch System", "Solid Rocket Booster",
				"Interim Cyrogenic Propulsion Stage", "Exploration Upper Stage", "Heliocentric Orbit", 10);


		//system 4 'Exploration ground systems' elements (2 squares)
		Element e9 = new Element("Launch Module", "Exploration Ground System", "Landing Runway", "Launch Pads",
				"Launch Pad 39B", "Launch Control Center Simulations", 11);
		Element e10 = new Element("Ground Equipment", "Exploration Ground System", "Mobile Launcher",
				"Vehicle Assembly Building", "Crawler-Transporter", "Launch Control Room", 12);
		
		//other squares on a board not assigned to a system - Cape Canaveral square and holiday square 
		//different constructor has been created with just two parameters for these two squares
		Element e11 = new Element("Take A Holiday", 7);
		Element e12 = new Element("Cape Canaveral", 1);
		
		
		//adding all the element objects to an array list to be returned upon method call
		boardGameElements.add(e1);
		boardGameElements.add(e2);
		boardGameElements.add(e3);
		boardGameElements.add(e4);
		boardGameElements.add(e5);
		boardGameElements.add(e6);
		boardGameElements.add(e7);
		boardGameElements.add(e8);
		boardGameElements.add(e9);
		boardGameElements.add(e10);
		boardGameElements.add(e11);
		boardGameElements.add(e12);
		
		return boardGameElements;
	}

	
	//EJ Work - method to check and return custodian of and element. If no custodian on a square null is returned
	public static String checkCurrentElementCustodian (ArrayList<Element>boardGameElements, int currentSpace) {
		
		
		Element myElement = null;
		String custodian=null;
		
		
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				custodian=myElement.getCustodian();
				}
			}
		return custodian;
	}
	
	//EJ Work - method to check for the element that a player is currently on
	public static Element currentElement (ArrayList<Element>boardGameElements, int currentSpace) {
		
		
		Element myElement = null;
		Element currentElement = null;
		
		
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				currentElement=myElement;
				}
			}
		return currentElement;
	}
	
	//EJ Work- method returning if there is a flag already planted on a square
	public static boolean checkCurrentElementFlag (ArrayList<Element>boardGameElements, int currentSpace) {
			
			
			Element myElement = null;
			boolean checkFlagPlanted= true;
			
			
			for (int counter = 0; counter < boardGameElements.size(); counter++) {
				myElement = boardGameElements.get(counter);
				if (currentSpace == myElement.getSpace()) {
					checkFlagPlanted=myElement.isFlagPlanted();
					}
				}
			return checkFlagPlanted;
		}
	
	//EJ Work - method to check if flags have been planted on all squares of a system
	public static boolean checkAllFlagsPlanted(ArrayList<Element> boardGameElements, String system, int currentSpace) {

		Element myElement = null;
		Element checkElement = null;
		boolean flagStatus = false;

		ArrayList<Element> check = new ArrayList<Element>();

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (myElement.getSystemName() == system) {
				check.add(myElement);
			}

			for (int i = 0; i < check.size(); i++) {
				checkElement = check.get(i);
				int flags = 0;
				if (checkElement.isFlagPlanted()) {
					flags++;
				}
				if (flags < check.size()) {
					flagStatus = false;
				} else if (flags == check.size()) {
					flagStatus = true;
					//also need something which assigns the custodian to the element after this method is returned as true
				}

			}
		}

		return flagStatus;

	}
	
	//EJ Work - method to plant a flag on a square
	public static void plantFlag(ArrayList<Element> boardGameElements, int currentSpace) {

		Element myElement = null;
		String elementName = null;

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				myElement.setFlagPlanted(true);
				myElement.getElementName();
			}
		}
		System.out.println("You have planted a flag on " + elementName);
	}
	
	//EJ Work- method to check what development level a player is at in the game when they are on a square
	public static String checkDevelopmentLevel(ArrayList<Element> boardGameElements, int currentSpace) {

			Element myElement = null;
			String devLevelName = null;

			for (int counter = 0; counter < boardGameElements.size(); counter++) {
				myElement = boardGameElements.get(counter);
				if (currentSpace == myElement.getSpace()) {
					int developmentLevel = myElement.getDevelopmentLevel();
					String minorDev1 = myElement.getMinorDev1();
					String minorDev2 = myElement.getMinorDev2();
					String minorDev3 = myElement.getMinorDev3();
					String majorDev = myElement.getMajorDev();

					//if the dev level is 0 no developments have been made so the player is still at minor development 1
					switch (developmentLevel) {
					case 0:
						devLevelName = "Minor Development 1- " + minorDev1;
						break;
					case 1:
						devLevelName = "Minor Development 2- " + minorDev2;
						break;
					case 2:
						devLevelName = "Minor Development 3- " + minorDev3;
						break;
					case 3:
						devLevelName = "Major Development- " + majorDev;
						break;

					}
				}
			}
			return devLevelName;
		}
	
	//EJ Work- method to make a development on a square- incomplete currently 
	public static void makeDevelopment(ArrayList<Element> boardGameElements, int currentSpace, String playerInput) {

			Element myElement = null;
			// not sure how the player input works so that might need updated
			if (playerInput == "Y") {

				for (int counter = 0; counter < boardGameElements.size(); counter++) {
					myElement = boardGameElements.get(counter);
					if (currentSpace == myElement.getSpace()) {
						int developmentLevel = myElement.getDevelopmentLevel();
						developmentLevel++;
						myElement.setDevelopmentLevel(developmentLevel);
					}
					// you might also have something in here about charging the player the cost for
					// development
				}
			}
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
/*
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
	*/

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/**
		 * redundant code String name = getInputName(input);
		 */

		// method to register players.
		registerPlayers(input);
		
		//EJ work- passing the result from the systems build method into the squares array list
		squares=systemsBuild();
	
		
		// checkInventory(1);
		boolean done = false;
		int counter = 0;

		do {

			System.out.println(players.get(counter) + " it is your turn. ");
			int choice = actionMenu(input);
			switch (choice) {
			case 1:
				//move(counter);
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
