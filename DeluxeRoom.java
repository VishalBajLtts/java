package vishal;

public class DeluxeRoom extends HotelRoom {
protected int ratePerSqFeet ;


public DeluxeRoom() {
	super();
}

public DeluxeRoom(int ratePerSqFeet) {
	super();
	this.ratePerSqFeet = 10;
}

public int getRatePerSqFeet() {
	return ratePerSqFeet;
}

public void setRatePerSqFeet(int ratePerSqFeet) {
	this.ratePerSqFeet = ratePerSqFeet;
}
public int getRatePerSqFeet1(boolean hasWifi,int ratePerSqFeet)
{
	if(hasWifi==true)
	{
		
		return (ratePerSqFeet + 2); 
		
	}
	else
	{
		
		return ratePerSqFeet;
	}
	
}
	
}
