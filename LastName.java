package vishal;

import java.util.Scanner;

public class LastName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3=sc.nextLine();
		
		
		
		String[] s2=s1.split(" ");
		String first=s2[0];
		String Sec=s2[1];
		//System.out.println(Sec);
		//-------------------------------------
		String[] s4=s3.split(" ");
		String first1=s4[0];
		String sec1=s4[1];
		//System.out.println(sec1);
		if(Sec.equals(sec1)) {
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
				

	}

}
