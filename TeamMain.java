package comparator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc =new Scanner(System.in);
		ArrayList<Team> al=new ArrayList<Team>();
		Team t= new Team();
	    System.out.println("Enter number of teams:");
		int noofteams= sc.nextInt();
  
		 for(int i=0;i<noofteams;i++)
		 {
			 System.out.println("Enter team  detail");
			 System.out.println("Enter Name");
			 String name1 = sc.next();
			 t.setName(name1);
			 System.out.println("Enter number of matches");
			 long noofmatches1 = sc.nextLong();
			 t.setNoofmatches(noofmatches1);
			 al.add(new Team(name1,noofmatches1));
		 }
		 System.out.println("Team list after sort by number of matches");
		 Collections.sort(al,new TeamComparator());
		 for(Team o:al)
		 {
			 System.out.println(o.getName()+" - "+o.getNoofmatches());
		 }
		 
	}
}