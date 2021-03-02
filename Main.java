package comparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner(System.in);
	ArrayList<Player> l=new ArrayList<Player>();
	 InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);   
	    Player p=new Player();
	System.out.println("Please provide the number of players to be registered");
    int no=sc.nextInt();
    for(int i=0;i<no;i++)
    {
    	System.out.println("Please enter player name");
    	String name=br.readLine();
    	p.setName(name);
    	System.out.println("Please select the skill of the player");
    	System.out.println("1.All Rounder");
    	System.out.println("2.Batsman");
    	System.out.println("3.Bowler");
    	int sk=sc.nextInt();
    	String skill1="";
    	if(sk==1)
    	{
    		skill1="All Rounder";
    		p.setSkill(skill1);
    	}
    	if(sk==2)
    	{
    		skill1="Batsman";
    		p.setSkill(skill1);
    	}
    	if(sk==3)
    	{
    		skill1="Bowler";
    		p.setSkill(skill1);
    	}
    	l.add(new Player(name,skill1));
    	
    	
    	
    }
    Collections.sort(l,new PlayerComparator());
	//-----------------------------------------
	System.out.println("Player Details");
	
	for(Player p1:l)
	{
		System.out.println("Player : "+p1.getName()+" : Skills :"+p1.getSkill());
	}
	}

}
