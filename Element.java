package qub.ac.uk.artemisg5;


/**
 * @author  Emily Jordan
 *
 */
public class Element {

	//an element refers to the square on the board game. The board game has 4 systems. 2 systems have 3 elements(or squares) and 2 systems have 2 elements( or squares) 
	//each elements has 4 development levels that must be achieved to be completed, a cost is associated with each development level
	// if a non custodian player lands on the element, and it has a custodian assigned to it, then a player must pay rent.

	private String elementName;
	private String systemName;
	private String minorDev1;
	private String minorDev2;
	private String minorDev3;
	private String majorDev;
	private int minorDev1Cost;
	private int minorDev2Cost;
	private int minorDev3Cost;
	private int majorDevCost;
	private int rent;
	private int developmentLevel;
	private int space;
	private boolean flagPlanted;
	private String custodian;
	private String flagOwner;


	public Element() {
		//default constructor
	}
	
	//constructor for elements that are in one of the four systems
	public Element(String elementName, String systemName, String minorDev1, String minorDev2, String minorDev3, String majorDev, int space) {
		super();
		this.elementName = elementName;
		this.minorDev1 = minorDev1;
		this.minorDev2 = minorDev2;
		this.minorDev3 = minorDev3;
		this.majorDev = majorDev;
		this.space = space;
		this.systemName=systemName;
		this.setDevelopmentLevel(0);
		this.setMinorDev1Cost(10);
		this.setMinorDev2Cost(20);
		this.setMinorDev3Cost(30);
		this.setMajorDevCost(40);
		this.setRent(10);
		this.setFlagPlanted(false);
		this.setFlagOwner(null);
		this.setCustodian(null);
	}
	
	//constructor for Cape Canaveral (go square) and take a holiday squares
	public Element(String elementName, int space) {
		super();
		this.elementName = elementName;
		this.space = space;
	}
	
	public String getFlagOwner() {
		return flagOwner;
	}

	public void setFlagOwner(String flagOwner) {
		this.flagOwner = flagOwner;
	}
	
	/**
	 * @return the elementName
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * @param elementName the elementName to set
	 */
	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	/**
	 * @return the systemName
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * @param systemName the systemName to set
	 */
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	/**
	 * @return the minorDev1
	 */
	public String getMinorDev1() {
		return minorDev1;
	}

	/**
	 * @param minorDev1 the minorDev1 to set
	 */
	public void setMinorDev1(String minorDev1) {
		this.minorDev1 = minorDev1;
	}

	/**
	 * @return the minorDev2
	 */
	public String getMinorDev2() {
		return minorDev2;
	}

	/**
	 * @param minorDev2 the minorDev2 to set
	 */
	public void setMinorDev2(String minorDev2) {
		this.minorDev2 = minorDev2;
	}

	/**
	 * @return the minorDev3
	 */
	public String getMinorDev3() {
		return minorDev3;
	}

	/**
	 * @param minorDev3 the minorDev3 to set
	 */
	public void setMinorDev3(String minorDev3) {
		this.minorDev3 = minorDev3;
	}

	/**
	 * @return the majorDev
	 */
	public String getMajorDev() {
		return majorDev;
	}

	/**
	 * @param majorDev the majorDev to set
	 */
	public void setMajorDev(String majorDev) {
		this.majorDev = majorDev;
	}

	/**
	 * @return the minorDev1Cost
	 */
	public int getMinorDev1Cost() {
		return minorDev1Cost;
	}

	/**
	 * @param minorDev1Cost the minorDev1Cost to set
	 */
	public void setMinorDev1Cost(int minorDev1Cost) {
		this.minorDev1Cost = minorDev1Cost;
	}

	/**
	 * @return the minorDev2Cost
	 */
	public int getMinorDev2Cost() {
		return minorDev2Cost;
	}

	/**
	 * @param minorDev2Cost the minorDev2Cost to set
	 */
	public void setMinorDev2Cost(int minorDev2Cost) {
		this.minorDev2Cost = minorDev2Cost;
	}

	/**
	 * @return the minorDev3Cost
	 */
	public int getMinorDev3Cost() {
		return minorDev3Cost;
	}

	/**
	 * @param minorDev3Cost the minorDev3Cost to set
	 */
	public void setMinorDev3Cost(int minorDev3Cost) {
		this.minorDev3Cost = minorDev3Cost;
	}

	/**
	 * @return the majorDevCost
	 */
	public int getMajorDevCost() {
		return majorDevCost;
	}

	/**
	 * @param majorDevCost the majorDevCost to set
	 */
	public void setMajorDevCost(int majorDevCost) {
		this.majorDevCost = majorDevCost;
	}

	/**
	 * @return the rent
	 */
	public int getRent() {
		return rent;
	}

	/**
	 * @param rent the rent to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}

	/**
	 * @return the developmentLevel
	 */
	public int getDevelopmentLevel() {
		return developmentLevel;
	}

	/**
	 * @param developmentLevel the developmentLevel to set
	 */
	public void setDevelopmentLevel(int developmentLevel) {
		this.developmentLevel = developmentLevel;
	}

	/**
	 * @return the space
	 */
	public int getSpace() {
		return space;
	}

	/**
	 * @param space the space to set
	 * @return 
	 * @return 
	 */
	public void setSpace(int space) {
		this.space = space;
	}

	/**
	 * @return the flagPlanted
	 */
	public boolean isFlagPlanted() {
		return flagPlanted;
	}

	/**
	 * @param flagPlanted the flagPlanted to set
	 */
	public void setFlagPlanted(boolean flagPlanted) {
		this.flagPlanted = flagPlanted;
	}

	/**
	 * @return the custodian
	 */
	public String getCustodian() {
		return custodian;
	}

	/**
	 * @param custodian the custodian to set
	 */
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}

	@Override
	public String toString() {
		return "Element [elementName=" + elementName + ", systemName=" + systemName + ", minorDev1=" + minorDev1
				+ ", minorDev2=" + minorDev2 + ", minorDev3=" + minorDev3 + ", majorDev=" + majorDev + ", rent=" + rent
				+ ", developmentLevel=" + developmentLevel + ", space=" + space + ", flagPlanted=" + flagPlanted
				+ ", custodian=" + custodian + "]";
	}


}
