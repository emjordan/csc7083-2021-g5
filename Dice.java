import java.util.Random;

public class Dice {
	public int rollDice() {
		Random dice = new Random();
		int die1 = dice.nextInt(6)+1; // 6 for a six sided die plus 1 because when it is bound it starts at 0, so you could get a sum = 1 because it rolls a 1 and a 0.
		int die2 = dice.nextInt(6)+1;
		int sum = die1+die2;
		return sum;
	}


