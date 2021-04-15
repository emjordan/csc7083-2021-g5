import java.util.ArrayList;

public class Player {
	
	public String playerName;
	public int playerLocation;
	private int playerOrder;
	private int NASAcredits;
	private int newPlayerLocation;
	private ArrayList<String> names;
	
	
    /**
	 * @return the names
	 */
	public ArrayList<String> getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(ArrayList<String> names) {
		this.names = names;
	}

	public Player() 
    {
         playerName = new String("UNKNOWN");
         playerLocation = 0;
         playerOrder     = 0;
         NASAcredits     = 1500;
         newPlayerLocation = 0;

         
    }
    
    public Player(String name, int order)
    {
         playerName = name;
         playerLocation = 0;
         playerOrder     = 0;
         NASAcredits     = 1500;
         newPlayerLocation = 0;
    }
	
	
	/**
	 * @return the playerName
	 */
	
	
	
	
	public String getPlayerName() {
		return playerName;
	}
	/**
	 * @param names the playerName to set
	 */
	public void setPlayerName(String names) {
		this.playerName = names;
	}
	/**
	 * @return the playerLocation
	 */
	public int getPlayerLocation() {
		return playerLocation;
	}
	/**
	 * @param playerLocation the playerLocation to set
	 */
	public void setPlayerLocation(int playerLocation) {
		this.playerLocation = playerLocation;
	}
	/**
	 * @return the playerOrder
	 */
	public int getPlayerOrder() {
		return playerOrder;
	}
	/**
	 * @param playerOrder the playerOrder to set
	 */
	public void setPlayerOrder(int playerOrder) {
		this.playerOrder = playerOrder;
	}
	/**
	 * @return the nASAcredits
	 */
	public int getNASAcredits() {
		return NASAcredits;
	}
	/**
	 * @param nASAcredits the nASAcredits to set
	 */
	public void setNASAcredits(int nASAcredits) {
		NASAcredits = nASAcredits;
	}


	/**
	 * @return the newPlayerLocation
	 */
	public int getNewPlayerLocation() {
		return newPlayerLocation;
	}

	/**
	 * @param newPlayerLocation the newPlayerLocation to set
	 */
	public void setNewPlayerLocation(int newPlayerLocation) {
		this.newPlayerLocation = newPlayerLocation;
	}


	


}
