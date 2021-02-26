package vishal;

public class TwoWheeler extends Vehicle {
	
	
//	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
//		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
//		// TODO Auto-generated constructor stub
//	}

	private boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	static void displayDetailInfo()
	{
		
	}
}
