/**
 * 
 */
package qub.ac.uk.artemisg5;

import java.util.Random;

/**
 * @author NMK
 * 
 * needed to add Class Dice because in player the number rolled has to remain consistent which 
 * is achieved by creating an object and then it has a constant value when in play. 

 *
 */
public class Dice {
	
	public int rollDice() {
		Random dice = new Random();
		int die1 = dice.nextInt(6)+1; // 6 for a six sided die plus 1 because when it is bound it starts at 0, so you could get a sum = 1 because it rolls a 1 and a 0.
		int die2 = dice.nextInt(6)+1;
		int sum = die1+die2;
		return sum;
	}

}
