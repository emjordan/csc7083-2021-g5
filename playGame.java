package artlite;

public class playGame {

	public static void main(String[] args) {
		prologue();
		unsuccessfulEnding();
		successfulEnding();

	}
	
	
	public static void prologue() {
		System.out.println("Artemis is the first step in the next era of human exploration. NASA wants to establish a sustainable presence on the Moon to prepare for missions to Mars.");
		System.out.println("You must develop the systems to launch the Orion space craft into space to begin the Artemis mission");
		
	}
	public static void successfulEnding() {
		System.out.println("BLAST OFF!");
		System.out.println("Congratulations- you have completed development as a team and you have launched the Orion Spacecraft");
		
	}
	public static void unsuccessfulEnding() {
		System.out.println("Oh no");
		System.out.println("Despite your valiant efforts you have run out of resources and you have not been successful in launching the Orion");
		
	}
}
