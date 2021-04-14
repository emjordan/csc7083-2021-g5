package artemis;

public class Player {
	
	     
	     
	     private String name;
	     private int whichPiece;
	     private int space;
	     private int credits;
	     private boolean onHoliday;
	    
	     
	     public Player() 
	     {
	          name       = new String("UNKNOWN");
	          space      = 0;
	          credits     = 1500;
	        onHoliday   = false;
	          
	     }
	   public Player(String n)
	     {
	          name       = n;
	          whichPiece = 0;
	          space      = 0;
	          onHoliday   = false; 
	     }
	     
	   
	     
	     public String getName()
	     {
	          return name;
	     }
	     
	    
	     public void setName(String n)
	     {
	          name = n;
	     }
	     
	     
	     public int getSpace()
	     {
	          return space;
	     }
	     
	  
	     public void setSpace(int location)
	     {
	          space = location;
	     }
	     
	     
	     public void movePiece(int amt)
	     {
	          space += amt;
	     }
	     
	     
	    
	     public boolean isOnHol()
	     {
	          return onHoliday;
	     }
	     
	    
	     public void setOnHol(boolean status)
	     {
	    	 onHoliday = status;
	          if(!onHoliday)
	               timeInJail = 0;
	     }
	    
	     public int getPiece()
	     {
	          return whichPiece;
	     }
	     
	     
	     public void setPiece(int piece)
	     {
	          whichPiece = piece;
	     }
	     
	     
	     public int getCredit()
	     {
	          return credits;
	     }
	     
	    
	     public void setCredit(int value)
	     {
	          credits += value;
	     }
	     
	     
	     
	     
	     public String toString()
	     {
	          
	     }
	     
	     
	     

	}
	

