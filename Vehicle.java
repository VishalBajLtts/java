package vishal;

public class Vehicle {
protected String	make;
protected	String vehicleNumber; 
protected String fuelType; 
protected   int	fuelCapacity;
protected int Cc;

public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getVehicleNumber() {
	return vehicleNumber;
}
public void setVehicleNumber(String vehicleNumber) {
	this.vehicleNumber = vehicleNumber;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getFuelCapacity() {
	return fuelCapacity;
}
public void setFuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}
public int getCc() {
	return Cc;
}
public void setCc(int Cc) {
	this.Cc = Cc;
}





//public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc)
//{
// this.make=make;
// this.vehicleNumber=vehicleNumber;
// this.fuelType=fuelType;
// this.fuelCapacity=fuelCapacity;
// this.cc=cc;
//}
static void displayMake(String make)
{
	System.out.println(make);
}
static void displayBasicInfo()
{
	
}
static void displayDetailInfo()
{
	
}
}
