package vishal;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Vehicle v=new Vehicle();
		
	System.out.println("1.Four Wheeler");
	System.out.println("2.Two Wheeler");
	int choice=sc.nextInt();
	if(choice==1) {
		Scanner sc1=new Scanner(System.in);
		Vehicle v=new Vehicle();
		FourWheeler fw=new FourWheeler();
		TwoWheeler tw=new TwoWheeler();
		System.out.println("Vehicle Make:");
		String mk=sc1.nextLine();
		v.setMake(mk);
		
		System.out.println("Vehicle Number:");
	    String vnum=sc1.nextLine();
	    v.setVehicleNumber(vnum);
	    
	    System.out.println("Fuel Type");
	    System.out.println("1.Petrol");
	    System.out.println("2.Diesel");
	    String  ftype=sc1.nextLine();
	    v.setFuelType(ftype);
	    
	    System.out.println("Fuel Capacity:");
	    int fcap=sc1.nextInt();
	    v.setFuelCapacity(fcap);
	    
	    System.out.println("Engine CC:");
	    int cc=sc1.nextInt();
	    v.setCc(cc);
	    
	    System.out.println("Audio System:");
	    String snd=sc1.next();
	    fw.setAudioSystem(snd);
	    
	    System.out.println("Number of Doors");
	    String doors=sc1.next();
	    fw.setNumberOfDoors(doors);
	    //--------------------------------------
	    System.out.println("************"+v.getMake()+"************");
	    System.out.println("Vehicle Number :"+v.getVehicleNumber());
	    System.out.println("Fuel Capacity :"+v.getFuelCapacity());
	    System.out.println("Fuel Type :"+v.getFuelType());
	    System.out.println("CC :"+v.getCc());
	    System.out.println("------Detail Information-----");
	    System.out.println("Audio System :"+fw.getAudioSystem());
	    System.out.println("Number Of Door :"+fw.getNumberOfDoors());
	}
	if(choice==2)
	{
		Scanner sc2=new Scanner(System.in);
		Vehicle v=new Vehicle();
		FourWheeler fw=new FourWheeler();
		TwoWheeler tw=new TwoWheeler();
		System.out.println("Vehicle Make:");
		String mk=sc2.nextLine();
		v.setMake(mk);
		
		System.out.println("Vehicle Number:");
	    String vnum=sc2.nextLine();
	    v.setVehicleNumber(vnum);
	    
	    System.out.println("Fuel Type");
	    System.out.println("1.Petrol");
	    System.out.println("2.Diesel");
	    String ftype=sc2.nextLine();
	    v.setFuelType(ftype);
	    
	    System.out.println("Fuel Capacity:");
	    int fcap=sc2.nextInt();
	    v.setFuelCapacity(fcap);
	    
	    System.out.println("Engine CC:");
	    int cc=sc2.nextInt();
	    v.setCc(cc);
	    
	    System.out.println("Kick Start Available[yes/no]:");
	    String kick=sc2.next();
	    
	    //-------------------------------------
	    System.out.println("********"+v.getMake()+"********");
	    System.out.println("------Basic Information--------");
	   System.out.println("Vehicle Number :"+v.getVehicleNumber());
	   System.out.println("Fuel Capacity :"+v.getFuelCapacity());
	   System.out.println("Fuel Type :"+v.getFuelType());
	   System.out.println("CC :"+v.getCc());
	   System.out.println("-----Detail Information-----");
	   System.out.println("Kick Start Available :"+kick);
	}
	
	
	
    
	}

}
