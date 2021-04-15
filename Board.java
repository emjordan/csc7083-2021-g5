package artlite;

import java.util.ArrayList;


public class Board {

	public static void main(String[] args) {
		systemsBuild();
		
		
		
		
	}
	
	public static void systemsBuild() {
		
		int currentSpace=1;
		
		//building the orion space craft system

		Element e1 = new Element ("Crew Module", "Environmental Control and Life Support System", "Heat Shield","Parachutes", "Assemble Minor Developments",1);
		Element e2 = new Element ("Service Module", "Solar Array Wings", "Fairing Panels","Spacecraft adaptor jettison fairings", "Assemble Minor Developments", 2);
		Element e3 = new Element ("Launch Abort Module", "Jettison Motor", "Altitude Control","Abort motor", "Assemble Minor Developments", 3);
		
	
			ArrayList<Element> system1= new ArrayList<Element>();
			system1.add(e1);
			system1.add(e2);
			system1.add(e3);
			
			System.out.println(system1);
			
			ArrayList<Integer> system1spaces= new ArrayList<Integer>();
			
		
		Systems orionSpacecraft = new Systems("orionSpacecraft", null, 100,system1, system1spaces );
		
		//some tests to see if the set up works
		System.out.println(orionSpacecraft.toString());
		orionSpacecraft.setCustodian("Emily");
		System.out.println(orionSpacecraft.toString());
		int minordevcost=orionSpacecraft.getMinorDev1Cost();
		System.out.println(minordevcost);
		int majordevcost= orionSpacecraft.getMajorDevCost();
		System.out.println(majordevcost);
		ArrayList<Element> orionElements= orionSpacecraft.getElements();
		
		//trying to access the names of the developments on a certain square
		//maybe some sort of method with a square number parameter
		for (int counter = 0; counter < orionElements.size(); counter++) { 		      
	         Element element= orionElements.get(counter); 
	         if(currentSpace==element.getSpace()) {
	        	 String minorDev1name= element.getMinorDev1();
	        	 String minorDev2name= element.getMinorDev2();
	        	 String minorDev3name= element.getMinorDev3();
	        	 String majorDevname= element.getMajorDev();
	        	 System.out.println("You have landed on " +minorDev1name);
	         }
		}
	
	}

}
