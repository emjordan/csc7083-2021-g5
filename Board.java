package artlite;

import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {
		systemBuild();
		
		
		
	}
	
	public static void systemBuild() {

		Element e1 = new Element ("Crew Module", "Environmental Control and Life Support System", "Heat Shield","Parachutes", "Assemble Minor Developments",1);
		Element e2 = new Element ("Service Module", "Solar Array Wings", "Fairing Panels","Spacecraft adaptor jettison fairings", "Assemble Minor Developments", 2);
		Element e3 = new Element ("Launch Abort Module", "Jettison Motor", "Altitude Control","Abort motor", "Assemble Minor Developments", 3);
		
	
			ArrayList<Element> system1= new ArrayList<Element>();
			system1.add(e1);
			system1.add(e2);
			system1.add(e3);
			
			System.out.println(system1);
			
		
		Systems orionSpacecraft = new Systems("orionSpacecraft", null, 100,system1);
		
		System.out.println(orionSpacecraft.toString());
	}

}
