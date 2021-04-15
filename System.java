public class SpaceSystem {
	
	private String System;
	private String element;
	private int rent;
	private int reward;
	private int cost;
	private int minorDev;
	private int majorDev;
	private String owner;
	boolean complete;
	
	/**
	 * @return the system
	 */
	public String getSystem() {
		return System;
	}

	/**
	 * @param system the system to set
	 */
	public void setSystem(String system) {
		System = system;
	}

	/**
	 * @return the element
	 */
	public String getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(String element ) {
		this.element = element;
	}

	/**
	 * @return the rent
	 */
	public int getRent() {
		return rent;
	}

	@Override
	public String toString() {
		return "SpaceSystem [System=" + System + ", element=" + element + ", rent=" + rent + ", reward=" + reward
				+ ", cost=" + cost + ", minorDev=" + minorDev + ", majorDev=" + majorDev + ", owner=" + owner
				+ ", complete=" + complete + "]";
	}

	/**
	 * @param rent the rent to set
	 */
	public void setRent(int rent) {
		this.rent = rent;
	}

	/**
	 * @return the reward
	 */
	public int getReward() {
		return reward;
	}

	/**
	 * @param reward the reward to set
	 */
	public void setReward(int reward) {
		this.reward = reward;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the complete
	 */
	public boolean isComplete() {
		return complete;
	}

	/**
	 * @param complete the complete to set
	 */
	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public SpaceSystem() {
		
	}

}
