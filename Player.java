package artemis;

public class Player {
	
	     
	     
	     private String name;
	     private int space;
	     private int credits;
	     private int minCredits;
	     private int orderPosition;
	     private boolean onHoliday;
	     private boolean custodian;
	    
	  
	   public Player(String n)
	     {
	          name       = n;
	          space      = 0;
	          credits     = 1500; //JUST CHOSE THIS NUMBER TBC
	          onHoliday   = false; 
	          custodian = false;
	          orderPosition= 0;
	          minCredits=0;
	          
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
	     }
	    
	   
	     
	     public int getCredit()
	     {
	          return credits;
	     }
	     
	    
	     public void setCredit(int value)
	     {
	          credits += value;
	     }



		@Override
		public String toString() {
			return "Player [name=" + name + ", space=" + space + ", credits=" + credits + ", minCredits=" + minCredits
					+ ", orderPosition=" + orderPosition + ", onHoliday=" + onHoliday + ", custodian=" + custodian
					+ "]";
		}
	     
	     
	     
	    
	     
	     
	     

	}
	

