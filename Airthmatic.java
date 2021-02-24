package vishal;

import java.util.Scanner;

public class Airthmatic {
	 static int first;
	 static int  second;
     static int operation;


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number - ");
		first=sc.nextInt();
		System.out.println("Enter the second number - ");
		second=sc.nextInt();
		System.out.println("Enter 1 for Addition ");
		System.out.println("Enter 2 for Substraction ");
		System.out.println("Enter 3 for Product ");
		System.out.println("Enter 4 for Division ");
		System.out.println("Enter Operation you want - ");
		operation=sc.nextInt();
		
		performAithmaticOp(first,second,operation);

	}

	 static void performAithmaticOp(int first,int second ,int opertaion) {
		 
		if(first<0 || second<0 || first>32767 || second>32767)
		{
			System.out.println("Invalid Input");
			 if(operation >4)
			{
				System.out.println("Invalid Operation input between (1-4)");
			}
		}
		else
		{
			 if(operation==1)
			 {
	System.out.println(first+second); 
			 }
			 if(operation==2)
			 {
				  System.out.println(first-second); 
			 }
			 if(operation==3)
			 {
				System.out.println(first*second);
			 }
			 if(operation==4)
			 {
				 System.out.println( first/second);
			 }
			
		}
	
		
	}

}
