package vishal;

public class HotelRoom {
	protected String hotelName ;
	protected static int numberOfSqFeet ;
	protected boolean hasTV ;
	 protected boolean hasWifi ;
	public HotelRoom() {
		super();
	}
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	
	public  int calculateTariff(int ratePerSqFeet,int numberOfSqFeet)
	{
		return ratePerSqFeet*numberOfSqFeet;
		
	}
	 
	public int getRatePerSqFeet1( boolean hasWifi,int ratePerSqFeet)
	{
		return numberOfSqFeet;
		
		
	}
}
