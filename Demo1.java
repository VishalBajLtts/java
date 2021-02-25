	package vishal;
import java.util.Scanner;
public class Demo1 {	
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	String first =sc.next();
	String second=sc.next();
	String sec=first.substring(0,1);
	String rem=first.substring(1,first.length()).toLowerCase();
	sec=sec.toUpperCase();
	
		second=second.toUpperCase();
		System.out.println(sec+rem);
		System.out.println(second);

	
	

}
}
