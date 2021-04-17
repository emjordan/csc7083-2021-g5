/**
 * 
 */
package qub.ac.uk.artemis;

/**
 * @author NMK
 *
 */
public class Player {
	
	private String name;
	private int space;
	private int bankBalance;
	
	
	/**
	 * default constructor
	 */
	
	public Player() {
		
	}
	
	/**
	 * constructor with parameters
	 */
	
	public Player(String name) {
		this.name = name; 
		this.space = 1;
		this.bankBalance = 100;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}
	
	public void moveSpace(int numOnDice) {
		space+=numOnDice;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		// the balance set to += so that it can be added to or a negative value eg from paying rent, will subtract
		this.bankBalance += bankBalance;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	public String printAll() {
		return "Name = " + name + "\nSpace = " + space + "\nBank Balance = " + bankBalance + "\n";
	}
	
	public String playerList() {
		return "Player [name=" + name + "]";
	}
	
	
	

}
