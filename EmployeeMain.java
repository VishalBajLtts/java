package vishal;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name : ");
String name2=sc.nextLine();
e.setName(name2);
System.out.println("Enter the Address :");
String addres=sc.nextLine();
e.setAddress(addres);
System.out.println("Enter Mobile :");
String mobile2=sc.nextLine();
e.setMobile(mobile2);
System.out.println("Employee Details");
System.out.println("Name : "+e.getName());
System.out.println("Adress : "+e.getAddress());
System.out.println("Mobile : "+e.getMobile());

	}

}
