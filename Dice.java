package artemis;


	import java.util.Random;


	public class Dice {

	    private int val;
	    
	    private Random r = new Random();
	    
	    /**
	     * 	Constructor for a dice object
	     */
	    public Dice() {
	    	
	    }
	    
	    /**
	     * 	Dice rolling method
	     */
	    public void roll() {
	    	int d1,d2;
	    	d1 = r.nextInt(6)+1;
	    	d2 = r.nextInt(6)+1;   		
	    	val = d1 + d2;
	    }
	   
	    public int getRollTot() {
	    	return val;
	    }
	   
	}

