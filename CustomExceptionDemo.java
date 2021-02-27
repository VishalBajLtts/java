package vishal;
import java.util.Scanner;

class InvalidAgeRange extends Exception
   {
		InvalidAgeRange()
		  {
			System.out.println("your under age");
		  }
   }
public class CustomExceptionDemo
{
	public static void main(String[] args) throws InvalidAgeRange
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		CustomExceptionDemo cs=new CustomExceptionDemo();
		
		System.out.println("Enter the Player name");
		String name =sc.nextLine();
		
		System.out.println("Enter the player age");
		int age = sc.nextInt();
		
		System.out.println("Player age " +age);
		
		 if(age<=19)
		 {
			 throw new InvalidAgeRange();
		 }
		 else
		 {
			 System.out.println();
		 }
		 
		 }
}



