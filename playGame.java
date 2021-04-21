/**
 * 
 */
package qub.ac.uk.artemisg5;

import java.util.ArrayList;
import java.util.Scanner;

//test on edit
/**
 * @author team
 *
 */
public class playGame {

	/**
	 * @param args
	 */
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static ArrayList<Element> boardGameElements = new ArrayList<Element>();

	private static final int NUM_SPACES_ON_BOARD = 12;

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
			if (option >= 1 && option <= 4) {
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
			Player any = new Player(name);
			players.add(any);
		}

		System.out.println(players.toString()); // need to tidy this up not to string but a nice printout of starting
												// details
		System.out.println(players.size()); // purely to check the number is correct.

	}

	/**
	 * Work completed by Joanne - then updated with new method by Emily to cover
	 * changes made in the Element class
	 * 
	 * // arrayList to set the squares of the board game based on Elements class //
	 * need to integrate with Systems for cost, rent and ownership/plant flag - //
	 * check with Emily
	 * 
	 * public static void boardGame(ArrayList<Element> squares) {
	 * 
	 * Element cc = new Element("Cape Canaverol", "", "", "", "", 1, 0);
	 * 
	 * Element orion1 = new Element("CrewModule", "Environmental control and life
	 * support system", "Heat Shield", "Parachutes for landing phase", "Assemble all
	 * minor devs", 2, 0);
	 * 
	 * Element orion2 = new Element("Service Module", "Solar Array Wings", "Fairing
	 * Panels", "Spacecraft adapter jettison fairings", "Assemble all minor devs",
	 * 3, 0);
	 * 
	 * Element orion3 = new Element("Launch Abort System", "Jettison Motor",
	 * "Altitude Control Motor", "Abort Motor", "Assemble all minor devs", 4, 0);
	 * Element spacesuits1 = new Element("xEMU - Eploration Extravehicular Activity
	 * Mobility Unit", "xEMU Space Torso", "xEMU Space Pants", "xEMU Injury and
	 * training", "xEMU unit deployment", 5, 0);
	 * 
	 * Element spacesuits2 = new Element("Portable Life Support System", "Oxygen
	 * Pressure Controls", "Thermal Loop and Ventilation", "Water Loop for
	 * hydration", "Avionics Electonics", 6, 0);
	 * 
	 * Element holiday = new Element("Take a Holiday", "", "", "", "", 7, 0);
	 * 
	 * Element sls1 = new Element("Cargo Hold Module", "95 ton capacity ", "105 ton
	 * capacity ", "130 ton capacity", "Deep Space Modules", 8, 0);
	 * 
	 * Element sls2 = new Element("Core Stage Module", "RS-25 Engine ",
	 * "Hydrogen/Oxygen Mixer", "Quad RS-25 engines", "Engine Interface Unit", 9,
	 * 0); Element sls3 = new Element("Boosters", "Solid Rocket Booster", "Interim
	 * Cyrogenic Propulsion Stage", "Expolations Upper stage", "Engine Hellocentric
	 * Orbit achieveable", 10, 0);
	 * 
	 * Element exgs1 = new Element("Launch", "Landing Runway", "Landing Pads",
	 * "Launch 39B", "Launch Control Center Simulations", 11, 0);
	 * 
	 * Element exgs2 = new Element("Ground Equipment", "Mobile Launcher", "Vehicle
	 * Assembly Building", "Crawler-Transporter", "Launch Control Centers
	 * Young-Crippen Firing Room 1", 12, 0);
	 * 
	 * squares.add(new Element("Cape Canaverol", 1)); squares.add(cc);
	 * squares.add(new Element("Orion - Crew Module", 2)); squares.add(orion1);
	 * squares.add(new Element("Orion - Service Module", 3)); squares.add(orion2);
	 * squares.add(new Element("Orion - Launch Abort System", 4));
	 * squares.add(orion3); squares.add(new Element("Spacesuits - xEMU - Eploration
	 * Extravehicular Activity Mobility Unit", 5)); squares.add(spacesuits1);
	 * squares.add(new Element("Spacesuits - Portable Life Support System", 6));
	 * squares.add(spacesuits2); squares.add(new Element("Relax - Take A holiday",
	 * 7)); squares.add(holiday); squares.add(new Element("Space Launch System -
	 * Cargo Hold Module", 8)); squares.add(sls1); squares.add(new Element("Space
	 * Launch System - Core Stage Module", 9)); squares.add(sls2); squares.add(new
	 * Element("Space Launch System - Boosters", 10)); squares.add(sls3);
	 * squares.add(new Element("Exploration Ground Services - Launch", 11));
	 * squares.add(exgs1); squares.add(new Element("Exploration Ground Services -
	 * Ground Equipment", 12)); squares.add(exgs2);
	 * 
	 * }
	 * 
	 * @return
	 * 
	 */

	// EJ work added here method to build the elements objects for each square on
	// the board
	// NW removed the ArrayList<Element> in the method to instead refer to a private
	// static ArrayList<Element> which is more readily accessible by other code in
	// the game

	public static ArrayList<Element> systemsBuild() {
		// building the orion space craft system
		// ArrayList<Element> boardGameElements = new ArrayList<Element>();

		// system 1 'Orion Space craft' elements (3 squares)
		Element e1 = new Element("Crew Module", "Orion Spacecraft", "Environmental Control and Life Support System",
				"Heat Shield", "Parachutes", "Assemble Minor Developments", 2);
		Element e2 = new Element("Service Module", "Orion Spacecraft", "Solar Array Wings", "Fairing Panels",
				"Spacecraft adaptor jettison fairings", "Assemble Minor Developments", 3);
		Element e3 = new Element("Launch Abort Module", "Orion Spacecraft", "Jettison Motor", "Altitude Control",
				"Abort motor", "Assemble Minor Developments", 4);

		// system 2 'Space suits' elements (2 squares)

		Element e4 = new Element("Exploration Extravehicular Activity Mobility Unit", "Spacesuits", "Space Torso",
				"Space Pants", "Space suit training", "Unit Deployment", 5);
		Element e5 = new Element("Portable Life Support System", "Spacesuits", "Oxegen Pressure Controls",
				"Ventilation Therma Loop", "Hydration Water Loop", "Avionics Electronics", 6);

		// system 3 'SLS' elements (3 squares)
		Element e6 = new Element("Cargo Hold Module", "Space Launch System", "95 ton capacity", "105 ton capacity",
				"130 ton capacity", "Superlarge capcity for deep space", 8);
		Element e7 = new Element("Core Stage Module", "Space Launch System", "RS-25 Engine", "Hydrogen Oxegen Mixer",
				"Quad RS-25 engine", "Engine Interface Unit", 9);
		Element e8 = new Element("Boosters", "Space Launch System", "Solid Rocket Booster",
				"Interim Cyrogenic Propulsion Stage", "Exploration Upper Stage", "Heliocentric Orbit", 10);

		// system 4 'Exploration ground systems' elements (2 squares)
		Element e9 = new Element("Launch Module", "Exploration Ground System", "Landing Runway", "Launch Pads",
				"Launch Pad 39B", "Launch Control Center Simulations", 11);
		Element e10 = new Element("Ground Equipment", "Exploration Ground System", "Mobile Launcher",
				"Vehicle Assembly Building", "Crawler-Transporter", "Launch Control Room", 12);

		// other squares on a board not assigned to a system - Cape Canaveral square and
		// holiday square
		// different constructor has been created with just two parameters for these two
		// squares
		Element e11 = new Element("Take A Holiday", 7);
		Element e12 = new Element("Cape Canaveral", 1);

		// adding all the element objects to an array list to be returned upon method
		// call
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

	// EJ Work - method to check and return custodian of and element. If no
		// custodian on a square null is returned
	// NW modified EJ method to use the player's position to perform the check.
	public static String checkCurrentElementCustodian(Player p) {

		Element myElement = null;
		String custodian = null;

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (p.getSpace() == myElement.getSpace()) {
				custodian = myElement.getCustodian();
			}
		}
		return custodian;
	}

	// EJ Work - method to check for the element that a player is currently on
	public static Element currentElement(ArrayList<Element> boardGameElements, int currentSpace) {

		Element myElement = null;
		Element currentElement = null;

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				currentElement = myElement;
			}
		}
		return currentElement;
	}

	// EJ Work- method returning if there is a flag already planted on a square
	public static boolean checkCurrentElementFlag(Player myPlayer) {

		Element myElement = null;
		boolean checkFlagPlanted = false;
		int currentSpace= myPlayer.getSpace();

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				checkFlagPlanted = myElement.isFlagPlanted();
			}
		}
		return checkFlagPlanted;
	}

	// EJ Work - method to check if flags have been planted on all squares of a
	// system
	//removed the String paramater I originally had building this so need to work out how to add in the system name using the player object
	
	public static boolean checkAllFlagsPlantedCustodian(Player myPlayer) {

		Element myElement = null;
		Element checkElement = null;
		boolean flagStatus = false;
		ArrayList<Element> check = new ArrayList<Element>();

		//need to find the elements that have flag Owner of player name and add to array
		
		//then need to check using .getSystemName...
		// checking all the elements and getting the ones in the same system
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			
			/*
			if (myElement.getSystemName() == system) {
				check.add(myElement);
			}*/
			
			if (myElement.getFlagOwner().equals(myPlayer.getName())) {
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

				}
			}
		}

		// if the result of the previous for loop was true then we need to assign a
		// custodian to the system
		// need to get all the elements with the same system name and assign the
		// custodian to each one separately
		if (flagStatus = true) {
			String custodian = myPlayer.getName();
			for (int counter = 0; counter < boardGameElements.size(); counter++) {
				myElement = boardGameElements.get(counter);
				
				if (myElement.getFlagOwner().equals(myPlayer.getName())) {
					check.add(myElement);
				}
				
				/*
				if (myElement.getSystemName() == system) {
					myElement.setCustodian(custodian);
				}*/
			}
		}

		return flagStatus;

	}
	
	//EJ Work- need to check if there are flags on other elements and if so is the flag owner the current players name.
	
	
	public static void checkFlagsOnOtherElements(Player myPlayer) {

		Element myElement = null;
		Element checkElement = null;
		boolean flagOwnerStatus = false;
		ArrayList<Element> check = new ArrayList<Element>();
		String systemName=null;
		

		// checking all the elements and getting the system name that the player is situated in
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			
			if (myElement.getSpace()==myPlayer.getSpace()) {
				systemName=myElement.getSystemName();
			}
		}
			//checking through the elements in the system just found
			for (int a = 0; a < boardGameElements.size(); a++) {
				myElement = boardGameElements.get(a);
				
				if (myElement.getSystemName().equals(systemName)) {
					//if the element is in the system found above then add it to an array
					check.add(myElement);
				}
			}
			
			//now we need to loop through the check array list to see if any of the other players are assigned as flag owner in  any of the elements
			
			for (int i = 0; i < check.size(); i++) {
				checkElement = check.get(i);
				
				//if the flag owner is empty or is the name of the current player than this is fine
				if (checkElement.getFlagOwner().equals(myPlayer.getName()) ||checkElement.getFlagOwner().equals(null)) {
					flagOwnerStatus = false;
				} else {
					//if a flag owner is assigned that is not the current player/ not null then break out of the loop and return true
					flagOwnerStatus = true;
					break;
				}
			}
		
		// if the result of the previous for loop was true then we need to say that there is already someone else owning flags in that system 
			// therefore they cant plant flag and need to stop them
		if (flagOwnerStatus = false) {
			
			//allow the flag to be planted
			plantFlag(myPlayer);
			//once the flag is planted - check to see if there are enough flags planted to be a custodian 
			checkAllFlagsPlantedCustodian(myPlayer);
			} else if (flagOwnerStatus = false) {
				//dont allow the flag to be planted and say someone else owns it
				System.out.println("Sorry someone else already has planted a flag in this system! Your flag is not allowed to be planted!");
			}

	}

	// NW modified EJ method to use the player's position to perform the check.
	public static void plantFlag(Player p) {

		Element myElement = null;
		String elementName = null;

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (p.getSpace() == myElement.getSpace()) {
				myElement.setFlagPlanted(true);
				elementName = myElement.getElementName();
			}
		}
		System.out.println("You have planted a flag on " + elementName);
	}

	// EJ Work- method to check what development level a player is at in the game
	// when they are on a square
	public static String checkDevelopmentLevel(Player p) {

		Element myElement = null;
		String devLevelName = null;
		int currentSpace= p.getSpace();

		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (currentSpace == myElement.getSpace()) {
				int developmentLevel = myElement.getDevelopmentLevel();
				String minorDev1 = myElement.getMinorDev1();
				String minorDev2 = myElement.getMinorDev2();
				String minorDev3 = myElement.getMinorDev3();
				String majorDev = myElement.getMajorDev();

				// if the dev level is 0 no developments have been made so the player is still
				// at minor development 1
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

	// EJ Work- method to make a development on a square- space param is chosen in chooseSquareToMakeDevelopment() method
	public static boolean makeDevelopment(Player p, int space) {
		boolean done=false;

		Element myElement = null;
		int developmentCost =0;
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (space == myElement.getSpace()) {
				int developmentLevel = myElement.getDevelopmentLevel();
				if(developmentLevel==0) {
					developmentCost = myElement.getMinorDev1Cost();
				}else if(developmentLevel==1) {
					developmentCost = myElement.getMinorDev2Cost();
				}else if(developmentLevel==2) {
					developmentCost=myElement.getMinorDev3Cost();
				} else if(developmentLevel==3) {
					developmentCost=myElement.getMajorDevCost();
				}
				
				//method to charge a player the development cost and reduce their NASA credits balance
				boolean successfulDevelopment=chargePlayer(p, developmentCost);
				if(successfulDevelopment) {
				developmentLevel++;
				myElement.setDevelopmentLevel(developmentLevel);
				} else {
					System.out.println("BANKRUPT! Sorry you have now run out of NASA Credits!! GAME OVER");
					//method to exit the game- not sure if this boolean returned will handle that
					done=true;
				}
			}	
		}
		return done;
	}

	// EJ Work- method to choose what square of a system to make development on.
	// method prints out the element names and asks the player to input the space
	// name which is then passed to make development method
	public static void chooseSquareToMakeDevelopment(Player p, Scanner input) {
		int choice = 0;

		Element myElement = null;

		System.out.println("Which square would you like to develop?");
		ArrayList<Element> playersElements = new ArrayList<Element>();
		
		// for loop that gets the elements owned by a player and adds to an array
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			if (myElement.getCustodian().equalsIgnoreCase(p.getName())) {
				playersElements.add(myElement);
			}
		}
		// displays all the players elements to screen and asks them to input the space
		// number of that element
		for (int counter = 0; counter < playersElements.size(); counter++) {
			Element pElement = playersElements.get(counter);
			System.out.println(pElement.getElementName() + " - Type:" + pElement.getSpace());

		}
		choice = input.nextInt();
		input.nextLine();

		makeDevelopment(p, choice);
		
		// need to add in validation to handle if the input is not one of the spaces displayed
	
	}

	// EJ Work- method that returns what the cost of rent is depending on whether
	// the custodian says yes or no
	//EJ note- this isnt right because i havent worked out how to ask the other player if they want to charge the rent or not
	public static int rentChargeable(Player p, String playerInput) {
		int rentChargeable = 0;
		Element myElement = null;
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			// system asks the player and they say no they do not want to charge any rent
			if (playerInput == "N") {
				rentChargeable = 0;
			} else if (playerInput == "Y") {
				rentChargeable = myElement.getRent();

			}
		}
		return rentChargeable;
	}
	
	//EJ work- method to charge a player for making a development
	
	public static boolean chargePlayer(Player p, int developmentCost) {
		boolean bankrupt=false;
		int currentBalance=p.getNASAcredits();
		currentBalance=currentBalance-developmentCost;
		p.setNASAcredits(currentBalance);
		if(p.getNASAcredits()>0) {
			bankrupt=false;
		} else if(p.getNASAcredits()<=0) {
			bankrupt=true;
		}
		return bankrupt;
		
	} 
	
	// EJ Work- method that returns what the cost of development is depending on the
	// level of development
	//EJ Note- not sure this method is needed now as i think i coded it into the other method
	public static int developmentCostChargeable(ArrayList<Element> boardGameElements, int currentSpace) {
		int devCostChargeable = 0;
		Element myElement = null;
		String devLevelName = null;
		for (int counter = 0; counter < boardGameElements.size(); counter++) {
			myElement = boardGameElements.get(counter);
			// system asks the player and they say no they do not want to charge any rent
			if (currentSpace == myElement.getSpace()) {
				int developmentLevel = myElement.getDevelopmentLevel();
				String minorDev1 = myElement.getMinorDev1();
				String minorDev2 = myElement.getMinorDev2();
				String minorDev3 = myElement.getMinorDev3();
				String majorDev = myElement.getMajorDev();

				// if the dev level is 0 no developments have been made so the player is still
				// at minor development 1
				switch (developmentLevel) {
				case 0:
					devLevelName = minorDev1;
					break;
				case 1:
					devLevelName = minorDev2;
					break;
				case 2:
					devLevelName = minorDev3;
					break;
				case 3:
					devLevelName = majorDev;
					break;

				}
			}
			if (devLevelName == myElement.getMinorDev1()) {
				devCostChargeable = myElement.getMinorDev1Cost();
			} else if (devLevelName == myElement.getMinorDev2()) {
				devCostChargeable = myElement.getMinorDev2Cost();
			} else if (devLevelName == myElement.getMinorDev3()) {
				devCostChargeable = myElement.getMinorDev3Cost();
			} else if (devLevelName == myElement.getMajorDev()) {
				devCostChargeable = myElement.getMajorDevCost();
			}
		}
		return devCostChargeable;
	}

	public static void checkInventory(int x) {
		Player p = players.get(x);
		Element e = null;
		String stock = "";
		for (int i = 0; i < boardGameElements.size(); i++) {
			e = boardGameElements.get(i);
			if (e.getFlagOwner() == p.getName()) {
				stock = e.getElementName();
			}
		}
		int credits = p.getNASAcredits();
		String name = p.getName();
		// String name = playerStock.getName();
		// int credits = playerStock.getNASAcredits();

		System.out.println("Player: " + name + " your have: " + credits
				+ " NASA credits and hold the following developments:" + stock);

	}

	// public static void checkInventory(int p) {
	// might need to assign
	// Player playerStock = players.get(p);
	// Systems sysdev = new Systems(); ------- need to work out how to tie into
	// System
	// sysdev.setCustodian(playerStock.getName());
	// String dev = sysdev.getCustodian();
	// String name = playerStock.getName();
	// int credits = playerStock.getNASAcredits();

	// System.out.println(
	// "Player: " + name + " your have: " + credits + " NASA credits and hold the
	// following developments:");
	// }

	public static String playerSpaceOnBoard(Player p) {
		Element myElement;
		String posName = "";
		for (int i = 0; i < boardGameElements.size(); i++) {
			myElement = boardGameElements.get(i);
			if (p.getSpace() == myElement.getSpace()) {
				posName = myElement.getElementName();
			}
		}
		return posName;
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
				System.out.println(activePlayer + " has landed on : " + playerSpaceOnBoard(activePlayer));
			}

			if (activePlayer.getSpace() == 1) { // on Cape Canaveral
				System.out.println("You have arrived" + " at Cape Canaveral!  Collect 30 units");
				System.out.println();
				activePlayer.setNASAcredits(30);
				System.out.println(activePlayer + " has landed on : " + playerSpaceOnBoard(activePlayer));
			}
		} else {
			activePlayer.moveSpace(rollOutcome);
			// System.out.println(activePlayer + " has landed on : " +
			// squares.get(move).getElementName()); // arrayList to get element name
			System.out.println(activePlayer + " has landed on : " + playerSpaceOnBoard(activePlayer));

		}
	}

	public static void takeTurn(int counter, Scanner input) {

		Player activePlayer = players.get(counter);
		// System.out.println(activePlayer + " you are here :
		// "+playerSpaceOnBoard(activePlayer)); unnecessary message.
		/**
		 * is square available? if yes - plant flag? else - is rent due?
		 * 
		 * is square able to be developed? if yes - undertake development let player
		 * know how many devs are complete etc. if no - move on
		 */
		if (checkCurrentElementCustodian(activePlayer) == null) {
			System.out.println("Do you want to claim this square (answer 'y' or 'n'):  "); // needs a try catch for
																							// errors on input - will
																							// come back to that.
			String user = input.nextLine();
			if (user.equalsIgnoreCase("y")) {
				//EJ added in this method to check if there is any flag currently there
				if (checkCurrentElementFlag(activePlayer)==false){
				//EJ updated this method to the first method that checks if the player is allowed to plant a flag based off if there are other flag owners in that system
				checkFlagsOnOtherElements(activePlayer);
				}
			} else {
				// rent
			}

		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// method to register players.
		registerPlayers(input);

		// boardGame(squares); Joanne - replaced by Emily on account of changes to
		// Element Class with:
		// EJ work- passing the result from the systems build method into the squares
		// array list
		ArrayList<Element> squares = systemsBuild();
		// System.out.println(squares);

		// checkInventory(1);
		boolean done = false;
		int counter = 0;

		
		//EJ Note- need to add in here somewhere the checkFlagsOnOtherElements() method to plant flag
		do {

			System.out.println(players.get(counter) + " it is your turn. ");
			int choice = actionMenu(input);
			switch (choice) {
			case 1:
				move(counter);
				takeTurn(counter, input);
				break;
			case 2:
				checkInventory(0);

				break;
			case 3:
				chooseSquareToMakeDevelopment(players.get(counter), input);

				break;
			case 4:
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
