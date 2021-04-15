package artlite;

public class Element {

	private String elementName;
	private String minorDev1;
	private String minorDev2;
	private String minorDev3;
	private String majorDev;
	private int space;

	
	public Element() {
		//default constructor
	}
	
	public Element(String elementName, String minorDev1, String minorDev2, String minorDev3, String majorDev, int space) {
		super();
		this.elementName = elementName;
		this.minorDev1 = minorDev1;
		this.minorDev2 = minorDev2;
		this.minorDev3 = minorDev3;
		this.majorDev = majorDev;
		this.space = space;
		
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
	 * @return the space
	 */
	public int getSpace() {
		return space;
	}

	/**
	 * @param space the space to set
	 */
	public void setSpace(int space) {
		this.space = space;
	}


	@Override
	public String toString() {
		return "Element [elementName=" + elementName + ", minorDev1=" + minorDev1 + ", minorDev2=" + minorDev2
				+ ", minorDev3=" + minorDev3 + ", majorDev=" + majorDev + ", space=" + space + "]";
	}
	
	
	

}
