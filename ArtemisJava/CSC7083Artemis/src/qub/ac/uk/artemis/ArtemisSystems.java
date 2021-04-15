/**
 * 
 */
package qub.ac.uk.artemis;

/**
 * @author NMK
 *
 */
public class ArtemisSystems {
	
	private String systemName;
	private String custodian;
	private int cost;
	private int rent;
	private int space;
	
	
	public ArtemisSystems() {
		//default constructor
	}
	
	public ArtemisSystems(String systemName, String custodian, int cost, int rent, int space ) {
		this.systemName = systemName;
		this.custodian = custodian;
		this.cost = cost;
		this.rent = rent;
		this.space = space;
		
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getCustodian() {
		return custodian;
	}

	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getSpace() {
		return space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	@Override
	public String toString() {
		return "ArtemisSystems [systemName=" + systemName + ", custodian=" + custodian + ", cost=" + cost + ", rent="
				+ rent + ", space=" + space + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
