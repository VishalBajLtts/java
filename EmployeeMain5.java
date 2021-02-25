import java.util.Scanner;

public class EmployeeMain5 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Employee5 e=new Employee5();
		System.out.println("Enter the name :");
		String name2=sc.nextLine();
		e.setName(name2);
		System.out.println("Enter Address :");
		String add=sc.nextLine();
		e.setAddress(add);
		System.out.println("Enter Mobile :");
		String mob=sc.nextLine();
		e.setMobile(mob);
		System.out.println("Employee Details");
		System.out.println("Name :"+e.getName());
		System.out.println("Adress :"+e.getAddress());
		System.out.println("Mobile :"+e.getMobile());
		System.out.println("Menu");
		System.out.println("1. Update Employee name");
		System.out.println("2. Update Employee Address");
		System.out.println("3. Update Employee mobile");
		System.out.println("4. All information correct/Exit");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Current Name is :"+e.getName());
			System.out.println("Enter the new Name :");
			Scanner sc1 =new Scanner(System.in);
			String name3=sc1.nextLine();
			e.setName(name3);
			System.out.println("Employee Details");
			System.out.println("Name :"+e.getName());
			System.out.println("Adress :"+e.getAddress());
			System.out.println("Mobile :"+e.getMobile());
			
		}
		if(choice==2)
		{
			System.out.println("Current address is :"+e.getAddress());
			System.out.println("Enter the new address :");
			Scanner sc1 =new Scanner(System.in);
			String add3=sc1.nextLine();
			e.setAddress(add3);
			System.out.println("Employee Details");
			System.out.println("Name :"+e.getName());
			System.out.println("Adress :"+e.getAddress());
			System.out.println("Mobile :"+e.getMobile());
			
		}
		if(choice==3)
		{
			System.out.println("Current Mobile no :"+e.getMobile());
			System.out.println("Enter new mobile no :");
			Scanner sc1 =new Scanner(System.in);
			String mob3=sc1.nextLine();
			e.setMobile(mob3);
			System.out.println("Employee Details");
			System.out.println("Name :"+e.getName());
			System.out.println("Adress :"+e.getAddress());
			System.out.println("Mobile :"+e.getMobile());
		}
		if(choice==4)
		{
			
			System.out.println("All Information Correct [yes]");
			System.exit(0);
			
		}
		
		
		
	}

}
