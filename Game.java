import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static int Dice() {
		Random roll = new Random();
		int dice1 = roll.nextInt(6) + 1; // get random number for dice 1
		int dice2 = roll.nextInt(6) + 1; // get random number for dice2

		System.out.println("You have thrown a " + dice1 + " and " + dice2); // print out dice 1 and dice 2 numbers
		// int rollDice = dice1 + dice2;

		return dice1 + dice2; // return roll
	}

	public static void setPlayerNames(ArrayList<Player> players, ArrayList<String> player_name) {
		// iterates through all of the players and asks for their names from the user(s)
		for (Player p : players) {
			System.out.print("Enter a name for " + p.getNames() + ": ");
			p.setNames(player_name);
		}

		// my best solution for dealing with the in.nextLine() and in.next() functions
		System.out.println("\nPress <Enter> to begin the game");
	}

	public static void mainMenu(Scanner in) {
		System.out.print("+-------------------+\n" + "|     Main Menu     |\n" + "+-------------------+\n"
				+ "'s turn: What do you want to do?\n" + " (1) Roll Die\n" + "(2) viewInventory" + " (3) Exit\n>");

		switch (in.nextInt()) {
		case 1:
			Move();
			break;
		case 2:
			viewInventory();
			break;
		case 3:
			System.out.println("You have decided to quit the game Are you Sure (Y/N");
			in.nextLine();
			if (in.nextLine() == "Y") {
				break;
			} else {
				break;
			}
		default:
			break;
		}

	}

	private static void viewInventory() {
		// TODO Auto-generated method stub

	}

	public static int Move() {
		Scanner in = new Scanner(System.in);
		Player p = new Player();
		int option = in.nextInt();

		System.out.println("To roll the Dice press 1 /n to view inventory press 2 /n to quit press 3");

		switch (option) {
		case 1:
			System.out.println(p.getNames());
			System.out.println("Player: " + p.getPlayerName());
			System.out.println("You are currently on square: " + p.getPlayerLocation());
			System.out.println("You can move: " + Dice() + " spaces");
			p.setNewPlayerLocation(p.getPlayerLocation() + Dice());
			System.out.println("Player new Location is:" + p.getNewPlayerLocation());

			break;
		case 2:
			System.out.println("View Inventory");
			break;
		case 3:
		default:
			break;
		}
		return p.getNewPlayerLocation();
	}

	public static int Board(int position) {
		int boardposition = 0;
		Player np = new Player();
		AretemisSystem sys = new AretemisSystem();
		SpaceSystem dev = new SpaceSystem();
		
		// AretemisSystem sys = new AretemisSystem(500, 1000, 200);

		switch (boardposition) {

		case 1:
			np.setNASAcredits(500);
			sys.getCapeCanaverol();
			taketurn();
			break;

		case 2:
			sys.getCapeCanaverol();
			taketurn();
			sys.development("orionSpacecraft", "Environmental control and life support system.", 1, "Crew Module");
		
		case 3: 
			if (dev.getOwner() == null) {
				dev.getCost();
				boardOption(null);
			}
		case 4:
			
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		default:
			break;

		}
		return boardposition;
	}

	private static void boardOption(Scanner option) {
		
		switch(option.nextInt()){
		case 1: 
			System.out.println("Do you want to plant flag");
			if (option.nextLine() != "Y"){
					break;
			} else {
				///getCost setOwner updateBalance .....
			}
		case 2:
			System.out.println("You have choose to do nothing");
			break;
			
			default: break;
		}
		
	}

	private static void taketurn() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you ready to play!");
		System.out.println("Please enter the number of players up to a maximum of 4!");
		Scanner scanner = new Scanner(System.in);
		int numPlayers = Integer.parseInt(scanner.nextLine());
		System.out.println();

		// Scanner in = new Scanner(System.in);

		// create an ArrayList of players and add one for now:
		ArrayList<Player> players = new ArrayList<Player>();
		String[] player_name = new String[numPlayers];// Array to store player names
		for (int i = 0; i < numPlayers; i++)// Loop to ask players their name
		{
			System.out.print("Player " + (i + 1) + " please enter your name:\n");// Asks player names one by one
			player_name[i] = scanner.nextLine();// Saves the player names to the array

		}

		ArrayList<String> names = new ArrayList<String>();
		Player newPlayer = new Player();
		for (String a : player_name) {
			names.add(a);
			System.out.println("Welcome player: " + a);
			newPlayer.setPlayerName(a);
		}

		// welcome();
		setPlayerNames(players, names);
		Move();
		System.out.println(Board(1));

	}
	// create an ArrayList of properties and then store all of the properties in it:

}// end main
