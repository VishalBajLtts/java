package vishal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.util.Date; 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class ComparablematchMain {

	static String date;
	private static String t1;
	private static String t2;

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<ComparableMatch> l=new ArrayList<ComparableMatch>();
		System.out.println("Enter the number of matches :");
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
        	System.out.println("Enter  match date in (dd-MM-yy) ");
        	 date=sc.next();
        	Date dt = new Date();
        	//ArrayList l1=new ArrayList();
            //DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
        	
        	 
        	
        	 System.out.println("Enter Team 1 ");
        	 t1=sc.next();
        	
        	 System.out.println("Enter Team 2 ");
        	  t2=sc.next();
        	 l.add(new ComparableMatch(date,t1,t2));
        	 
        }
        
        System.out.println("Match Detail");
       // System.out.println(l);
        Collections.sort(l);
//       for(int i=0;i<no;i++)
//       {
//    	   ComparableMatch cm=new ComparableMatch(date, t1, t2);
//    	   System.out.println("Team 1 -"+cm.getTeamOne());
//    	   System.out.println("Team 2 - "+cm.getTeamTwo());
//    	   
//    	   System.out.println("Match held on "+cm.getMatchDate());
//       }
       
       for(ComparableMatch m:l) {
    	   System.out.println("Team 1 - "+m.getTeamOne());
    	   System.out.println("Team 2 - "+m.getTeamTwo());
    	   System.out.println("Match held on "+m.getMatchDate());
    	   
       }
	}

}
