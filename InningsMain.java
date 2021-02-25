package vishal;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		String choice=" ";
		do {
			Innings i=new Innings();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the team name :");
		String name2=sc.nextLine();
		i.setTeamname(name2);
		System.out.println("Enter Session :");
		String ses=sc.nextLine();
		i.setInningsname(ses);
		System.out.println("Enters Runs :");
		int run2=sc.nextInt();
		i.setRuns(run2);
		System.out.println("Name : "+i.getTeamname());
		System.out.println("Scored : "+i.getRuns());
		i.displayInningsDetails(run2,ses);
		System.out.println("want to Enter Second Innings [y/Y]");
		 choice=sc.next();
		}
		
	while(choice.equalsIgnoreCase("y"));
	{
		
	}

	}

}
