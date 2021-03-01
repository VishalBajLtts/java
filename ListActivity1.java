package vishal;

import java.util.ArrayList;

import java.util.Scanner;

public class ListActivity1 {
	public static void main(String[] args)
	{
		ArrayList l=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details ");
	    System.out.println("Enter player name :");
	     String Pname=sc.nextLine();
	     System.out.println("Enter age :");
	     int age=sc.nextInt();
	     System.out.println("Enter Country :");
	     String country=sc.next();
	     
	     l.add(Pname);
	     l.add(age);
	     l.add(country);
	     
	     
	     
	     //------------------------------------------
	     System.out.println("Player Details ");
	   
	     for(Object o:l)
	     {
	    	System.out.println(o); 
	     }
	     System.out.println("Enter Skill :");
	     String skill=sc.next();
	     l.add(skill);
	     System.out.println("Enter the position to add the skill ");
	     int pos=sc.nextInt();
	     l.add(pos);
	     System.out.println("Player Details ");
	     for(Object o:l)
	     {
	    	System.out.println(o); 
	     }
 
	}
	

}
