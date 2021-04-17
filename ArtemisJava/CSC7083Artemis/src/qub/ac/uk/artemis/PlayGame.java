/**
 * 
 */
package qub.ac.uk.artemis;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author NMK
 *
 */
public class PlayGame {

	/**
	 * @param args
	 */
	
	private static ArrayList<Player> players = new ArrayList<Player>();
	private static ArrayList<ArtemisSystems> artemisSystems = new ArrayList<ArtemisSystems>();
	private static final int NUM_SPACES_ON_BOARD = 12;
	
	/**
	 *  redundant code
	public static String getInputName(Scanner input) {
		String name ="";
		System.out.print("Please enter your name:  ");
		name = input.nextLine();
		return name;
	}
	
	public static void registerPlayers(String name) {
		Player any = new Player(name);
		players.add(any);
	}
	
	public static int rollDice() {  // moved to class Dice
		Random dice = new Random();
		int die1 = dice.nextInt(5)+1; //I can never remember if this starts at 0 or 1 so it might be (6).
		int die2 = dice.nextInt(5)+1;
		int sum = die1+die2;
		return sum;
	}

	
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
			if(option >=1 && option <=3) {
				done=true;
			} else {
				System.out.println("please enter a valid menu option");
			}
			
		}while(!done);
		
		return option;
	}
	

	
	public static void createArtemisSystem() {
		ArtemisSystems orion = new ArtemisSystems("Orion", "test", 2000, 500, 2);
		artemisSystems.add(orion);
	}
	
	public static void registerPlayers(Scanner input) {
		//setting player numbers
		int num;
		do {
		System.out.print("Please enter the number of players.  Must be between 2 and 4: ");
		num = input.nextInt();
		input.nextLine();
		} while (num<2 || num>4);
		
		//setting player names based on number of players entered above
		String name ="";
		for(int i = 1; i<=num; i++) {
			System.out.print("Please enter your name:  ");
			name = input.nextLine();
			Player any = new Player(name);
			players.add(any);
		}
		System.out.println(players.toString()); // need to tidy this up not to string but a nice printout of starting details
		System.out.println(players.size()); // purely to check the number is correct.
		
	}
	
	public static void move(int counter) {
		Dice roll = new Dice();
		int rollOutcome = roll.rollDice();
		Player activePlayer = players.get(counter);
		
		System.out.println(activePlayer+" you rolled "+rollOutcome);
		System.out.println();
		
		int move = activePlayer.getSpace() + rollOutcome;
		
		System.out.println(activePlayer+" you are in space "+activePlayer.getSpace()+" and you will move to space "+move);
		
			
		if(move > NUM_SPACES_ON_BOARD) {
			activePlayer.setSpace(move - NUM_SPACES_ON_BOARD); // this effectively resets the start count to 1 to start the count from Cape Canaveral again for that player.
			if(activePlayer.getSpace()!=1) { // in other words they are not on Cape Canaveral
				System.out.println("You have passed Cape Canaveral!  Collect 30 units");
				activePlayer.setBankBalance(30);
			} 
			if(activePlayer.getSpace()==1) { // on Cape Canaveral
				System.out.println("You have arrives at Cape Canaveral!  Collect 30 units");
				System.out.println();
				activePlayer.setBankBalance(30);
			} 
			
		} else { 
				activePlayer.moveSpace(rollOutcome);
				System.out.println(activePlayer+" has landed on : ");  // here you would add a reference to the ArrayList holding the spaces and print out the name.  eg arrayList.get(activePlayer.getSpace())
				System.out.println();
			}
	
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/** redundant code
		*String name = getInputName(input);
		*/
		
		//method to register players.
		registerPlayers(input); 
		
	
		boolean done = false;
		int counter = 0;
		
		do {
			
			System.out.println(players.get(counter)+" it is your turn. ");
			int choice = actionMenu(input);
			switch(choice){
			case 1: move(counter);
				break;
			case 2:
				break;
			case 3: System.out.println("You have chosen to exit game");
				done=true;
				break;
			}
				counter++;
				if(counter > players.size() -1) { // stops exception being thrown b/c counter goes beyond arraylist size and resets the counter to zero - and therefore first person's go.
					counter = 0;
				}
					
					
					
		} while (done==false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
