package artlite;

import java.util.ArrayList;

public class Board {

	public static void main(String[] args) {

		Systems orionSpacecraft = systemsBuild();

		// some tests just to see if the set up works
		System.out.println(orionSpacecraft.toString());
		orionSpacecraft.setCustodian("Emily");
		System.out.println(orionSpacecraft.toString());
		int minordevcost = orionSpacecraft.getMinorDev1Cost();
		System.out.println(minordevcost);
		int majordevcost = orionSpacecraft.getMajorDevCost();
		System.out.println(majordevcost);

		String moduleName = checkElement(orionSpacecraft, 2);
		System.out.println(moduleName);

		int developmentLevel = checkDevelopmentLevel(orionSpacecraft, 1, "Y");
		System.out.println(developmentLevel);

	}

	public static Systems systemsBuild() {
		ArrayList<Element> system1 = new ArrayList<Element>();

		// building the orion space craft system

		Element e1 = new Element("Crew Module", "Environmental Control and Life Support System", "Heat Shield",
				"Parachutes", "Assemble Minor Developments", 1, 0);
		Element e2 = new Element("Service Module", "Solar Array Wings", "Fairing Panels",
				"Spacecraft adaptor jettison fairings", "Assemble Minor Developments", 2, 0);
		Element e3 = new Element("Launch Abort Module", "Jettison Motor", "Altitude Control", "Abort motor",
				"Assemble Minor Developments", 3, 0);

		system1.add(e1);
		system1.add(e2);
		system1.add(e3);

		System.out.println(system1);

		ArrayList<Integer> system1spaces = new ArrayList<Integer>();

		Systems orionSpacecraft = new Systems("orionSpacecraft", null, 100, system1, system1spaces);
		return orionSpacecraft;
	}

	public static String checkElement(Systems orionSpacecraft, int currentSpace) {
		ArrayList<Element> orionElements = orionSpacecraft.getElements();
		String modulename = null;
		Element element;
		for (int counter = 0; counter < orionElements.size(); counter++) {
			element = orionElements.get(counter);

			if (currentSpace == element.getSpace()) {
				modulename = element.getElementName();
			}
		}

		return modulename;
	}

	
	//
	public static int checkDevelopmentLevel(Systems orionSpacecraft, int currentSpace, String makeDev) {
		ArrayList<Element> orionElements = orionSpacecraft.getElements();
		String modulename;
		Element element;
		for (int counter = 0; counter < orionElements.size(); counter++) {
			element = orionElements.get(counter);

			if (currentSpace == element.getSpace()) {
				modulename = element.getElementName();
				int developmentLevel = element.getDevelopmentLevel();

				if (makeDev == "Y") {
					developmentLevel++;
					element.setDevelopmentLevel(developmentLevel);
				}
			}
		}

		int devReturn = element.getDevelopmentLevel();
		return devReturn;
	}
}
