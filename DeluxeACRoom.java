package vishal;

public class DeluxeACRoom extends DeluxeRoom {
	protected static int ratePerSqFeet; 
	
	
	public DeluxeACRoom() {
		super();
	}
	public DeluxeACRoom(int ratePerSqFeet) {
		super();
		this.ratePerSqFeet = 12;
	}
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int getRatePerSqFeet(int i )
	{
		return 12;
		
		
	}
	

}
