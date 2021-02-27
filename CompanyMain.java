package vishal;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		int flag=1;
		Scanner sc=new Scanner(System.in);
		Company c=new Company();
		System.out.println("Enter the Company Name :");
		String name2=sc.nextLine();
		c.setName(name2);
		System.out.println("Enter the employees");
		String emp=sc.nextLine();
		c.setEmployees(emp);
		System.out.println("Enter Teamlead");
		String team=sc.nextLine();
		c.setTeamlead(team);
		 String[] s=emp.split("\\.");
		 
		 for(int i=0;i<s.length;i++)
		 {
			 if(s[i].equals(team))
			 {
				 System.out.println(team);
				 flag=0;
			 }
			 
			 
		 }
		if(flag==1)
		{
			System.out.println("invalid input");
		}
	}

}
