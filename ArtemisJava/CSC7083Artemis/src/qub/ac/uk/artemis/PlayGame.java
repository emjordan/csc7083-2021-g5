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
	
	public static int rollDice() {
		Random dice = new Random();
		int die1 = dice.nextInt(5)+1; //I can never remember if this starts at 0 or 1 so it might be (6).
		int die2 = dice.nextInt(5)+1;
		int sum = die1+die2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name = getInputName(input);
		
		boolean done = false;
		int counter = 0; //to keep track of turns need to set a max of 0-3 (4 players)
		
		do {
			int choice = actionMenu(input);
			switch(choice){
			case 1: System.out.println("You rolled "+rollDice());
				break;
			case 2:
				break;
			case 3: System.out.println("You have choosen to exit game");
				done=true;
				break;
			}
					
					
					
					
		} while (done==false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
