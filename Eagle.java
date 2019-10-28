public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
    public void takeOff() {
	  System.out.printf("%s takes off in the sky. %n", this.getName());
	  
    }
    
    /**
     * fly ascend
     * @param meters 
     * @return altitude
     */
    @Override
    
    public int ascend(int meters) {
        this.altitude = meters;
       
        System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
    
        return this.altitude; 
  
    }
  
   
    /**
     * fly descend
     * @param meters 
     * @return altitude
     */
	@Override
	public int descend(int meters) {
		this.altitude = meters;
	       
        System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
    
        return this.altitude; 
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
		  System.out.printf("%s lands on the ground. %n", this.getName());
		  
    
		
	}
    
    	
    
}
