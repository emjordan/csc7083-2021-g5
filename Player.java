/**
 * 
 */
package qub.ac.uk.artemisg5;




/**
 * @author 
 *
 */
public class Player {

	private String name;
	private int space;
	private int NASAcredits;
	
	
	/**
	 * default constructor
	 */
	
	public Player() {
		
	}
	
	/**
	 * constructor with parameters
	 */
	
	//EJ Note:Updated to .setSpace and .setNASAcredits
	public Player(String name) {
		this.name = name; 
		this.setSpace(1);
		this.setNASAcredits(100);
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

	public int getNASAcredits() {
		return NASAcredits;
	}

	public void setNASAcredits(int NASAcredits) {
		// the balance set to += so that it can be added to or a negative value eg from paying rent, will subtract
		this.NASAcredits += NASAcredits;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
	public String printAll() {
		return "Name = " + name + "\nSpace = " + space + "\nNASAcredits = " + NASAcredits + "\n";
	}
	
	public String playerList() {
		return "Player [name=" + name + "]";
	}


}
