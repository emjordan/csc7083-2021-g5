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
	
	public Player(String name, int space, int bankBalance) {
		this.name = name; 
		this.space = space;
		this.setBankBalance(bankBalance);
	}

	public Player (String name) {
		this.name = name;
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

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		// the balance set to += so that it can be added to or a negative value eg from paying rent, will subtract
		this.bankBalance += bankBalance;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", space=" + space + ", bankBalance=" + bankBalance + "]";
	}
	
	
	
	
	

}
