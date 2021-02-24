package vishal;

import java.util.Scanner;

public class LeapYear {
       public static void main(String args[])
	    {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a Year !");
    	    int year=sc.nextInt();
    	    leap(year);
    	    
    	    
	       
	    }

	 static void leap(int year) {
		 if(year<0)
 	    {
 	    	System.out.println("Invalid Input");
 	    }
 	    else
 	    {
 	    	 if(year%400==0||year%4==0&&year%100!=0)
 		        {
 		            System.out.println("Yes");
 		        }
 		        else
 		        {
 		            System.out.println("No");
 		        }
 	    }
		
	}
	
}
