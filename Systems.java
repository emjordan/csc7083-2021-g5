package artlite;

import java.util.ArrayList;

//Author EmilyJordan

public class Systems {
	
	
	
	private String systemName;
	private String custodian;
	private int minorDev1Cost;
	private int minorDev2Cost;
	private int minorDev3Cost;
	private int majorDevCost;
	private int rent;
	private ArrayList<Integer> spaces= new ArrayList<Integer>();
	private ArrayList <Element> elements = new ArrayList <Element> ();
	
	
	public Systems() {
		//default constructor
	}
	
	public Systems(String systemName, String custodian, int rent,  ArrayList <Element> elements, ArrayList<Integer> spaces) {
		this.systemName = systemName;
		this.custodian = custodian;
		this.minorDev1Cost=1;
		this.minorDev2Cost=2;
		this.minorDev3Cost=3;
		this.majorDevCost=4;
		this.spaces=spaces;
		this.rent = rent;
		this.elements= elements;
		
	}
	
	

	public ArrayList<Integer> getSpaces() {
		return spaces;
	}

	public void setSpaces(ArrayList<Integer> spaces) {
		this.spaces = spaces;
	}

	public int getMinorDev1Cost() {
		return minorDev1Cost;
	}

	public void setMinorDev1Cost(int minorDev1Cost) {
		this.minorDev1Cost = minorDev1Cost;
	}

	public int getMinorDev2Cost() {
		return minorDev2Cost;
	}

	public void setMinorDev2Cost(int minorDev2Cost) {
		this.minorDev2Cost = minorDev2Cost;
	}

	public int getMinorDev3Cost() {
		return minorDev3Cost;
	}

	public void setMinorDev3Cost(int minorDev3Cost) {
		this.minorDev3Cost = minorDev3Cost;
	}

	public int getMajorDevCost() {
		return majorDevCost;
	}

	public void setMajorDevCost(int majorDevCost) {
		this.majorDevCost = majorDevCost;
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public void setElements(ArrayList<Element> elements) {
		this.elements = elements;
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

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}


	
	
	

	@Override
	public String toString() {
		return "Systems [systemName=" + systemName + ", custodian=" + custodian + ", minorDev1Cost=" + minorDev1Cost
				+ ", minorDev2Cost=" + minorDev2Cost + ", minorDev3Cost=" + minorDev3Cost + ", majorDevCost="
				+ majorDevCost + ", rent=" + rent + ", elements=" + elements + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



