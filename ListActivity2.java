package vishal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class ListActivity2 {



	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Sunrisers Hyderabad");
		ll.add("Delhi Capitals");
		ll.add("Royal Challengers Bangalore");
		ll.add("Kolkata Knight Riders");
		ll.add("Mumbai Indians");
		
		for(String a:ll)
		{
		System.out.println(a);
     	}
		System.out.println("Enter swap positons");
		int pos=sc.nextInt();
		Collections.swap(ll, 0, pos);
		for(Object o:ll)
		{
			 System.out.println(o);	
		}
	   

}
}



