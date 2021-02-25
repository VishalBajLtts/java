package vishal;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Details :");
	String st=sc.nextLine();
	String[] s2=st.split("\\.");
	
	String name1=s2[0];
	String add=s2[1];
	String mob=s2[2];
     System.out.println("Name :"+name1);
     System.out.println("Address :"+add);
     System.out.println("Mobile :"+mob);

	}

}
