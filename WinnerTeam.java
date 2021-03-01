package vishal;

import java.util.Scanner;

class InvalidATeamNameNotFound extends Exception
{
	InvalidATeamNameNotFound()
		  {
			System.out.println("Invalid Teamn");
		  }
}
public class WinnerTeam {

	public static void main(String[] args) throws InvalidATeamNameNotFound {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the expected winner team of IPL Season 13");
		String winner=sc.nextLine();
		System.out.println("Enter the expected runner Team of IPL Season 13");
		String runner=sc.nextLine();
	    boolean flag=false;
		String[] s= {"Chennai Super Kings", "Sun Risers Hyderabad" ,"Delhi Capitals", "Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals"};
		for( String s1:s)
		{
			if(winner.equals(s1)||runner.equals(s1))
			{
				
				flag=true;
				
			}
			
		}
		if(flag==true)
		{
			System.out.println("Expected IPL Season 13 winner:"+winner);
			System.out.println("Expected IPL Season 13 runner:"+runner);
		}
		if(flag==false)
		{
			throw new InvalidATeamNameNotFound();
		}
		

	}

}
