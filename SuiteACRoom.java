package vishal;

public class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet ;
	

	public SuiteACRoom() {
		super();
	}

	public SuiteACRoom(int ratePerSqFeet) {
		super();
		this.ratePerSqFeet = 15;
	}

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet(boolean hasWifi,int ratePerSqFeet )
	{
		if(hasWifi==true)
		{
			return (ratePerSqFeet + 2) ;
		}
		else
		{
			return ratePerSqFeet;
		}
	
		
		
	}
	

}
