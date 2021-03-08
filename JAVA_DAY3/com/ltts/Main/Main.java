package com.ltts.Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import com.ltts.Playerdao.Playerdao;
import com.ltts.Teamdao.Teamdao;
import com.ltts.model.Player.Player;
import com.ltts.model.Team.Team;


public class Main {
	public static void main(String args[]) throws Exception
	{
		
		
		
		
		
		System.out.println("----- USER MENU -----");
		System.out.println("1.Show Table");
		System.out.println("2.Insert to Table");
		System.out.println("3.Update to Table");
		System.out.println("4.Delete to Table ");
		Scanner sc=new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(r);
		int ch1=sc.nextInt();
		
		Teamdao td=new Teamdao();
		Playerdao pd=new Playerdao();
		
		if(ch1==1)
		{
			System.out.println("-- Which Table you want to see --");
			System.out.println("1.Show Team Table");
			System.out.println("2.Show Player Table");
			int ch2=sc.nextInt();
						if(ch2==1)
						{
							
							td.showTeam();
							
						}
						if(ch2==2)
						{
							
							pd.showPlayer();
						}
		}
		if(ch1==2)
		{
			System.out.println("-- Which Table you want to Insert");
			System.out.println("1.Insert into Team");
			System.out.println("2.Insert into Player");
			int ch3=sc.nextInt();
					if(ch3==1)
					{
						
						System.out.println("Enter the Name of Your Team - ");
						String tname=br.readLine();
						System.out.println("Enter the TeamOwner - ");
						String towner=br.readLine();
						System.out.println("Enter the TeamID - ");
						int tid=Integer.parseInt(br.readLine());
						System.out.println("Enter the TeamCaptain - ");
						String tcap=br.readLine();
						Team t=new Team(tname,towner,tid,tcap);
						td.insertTeam(t);
						System.out.println("============================================================================");
						td.showTeam();
					}
					if(ch3==2)
					{
						System.out.println("Enter the Player No  - ");
						int pno=Integer.parseInt(br.readLine()); 
						System.out.println("Enter the Player Name - ");
						String pname=br.readLine();
						System.out.println("Enter the Player Skill - ");
						String pskill=br.readLine();
						System.out.println("Enter the Team ID - ");
						int pid=Integer.parseInt(br.readLine()); 
						System.out.println("Enter the Player Country - ");
						String pcn=br.readLine();
						System.out.println("Enter the Player DOB - ");
						String dob=br.readLine();
						Player p=new Player(pno,pname,pskill,pid,pcn,dob);
						pd.insertPlayer(p);
						System.out.println("============================================================================");
						pd.showPlayer();
					}
		}
			if(ch1==3) //update
			{
				System.out.println("--Which Team you Want to Update");
				System.out.println("1.Update Team Table");
				System.out.println("2.Update Player Table");
				int ch4=Integer.parseInt(br.readLine());
				if(ch4==1) //update Team
				{
					System.out.println("-- Select to Update --");
					System.out.println("1.TeamName");
					System.out.println("2.TeamOwner");
					System.out.println("3.TeamID");
					System.out.println("4.TeamCaptain");
					int up=Integer.parseInt(br.readLine());
						     if(up==1)
						     {
						    	// Team t=new Team();
						    	 System.out.println("Enter the TeamID you want to update - ");
						    	 int oteam=Integer.parseInt(br.readLine()); 
						    	System.out.println("Enter new Team Name - ");
						    	String tname=br.readLine();
						    	String sql=String.format("update team set teamname='%s' where teamid='%s'",tname,oteam);
						    	td.updateTeam(sql);
						    	System.out.println("Update Succesfully");
								System.out.println("============================================================================");
								td.showTeam();
						     }
						     if(up==2)
						     {
						    	 System.out.println("Enter the TeamID you want to update - ");
						    	 int oteam=Integer.parseInt(br.readLine()); 
						    	System.out.println("Enter new Team Owner - ");
						    	String toname=br.readLine();
						    	String sql=String.format("update team set teamowner='%s' where teamid='%s'",toname,oteam);
						    	td.updateTeam(sql);
						    	System.out.println("Update Succesfully");
								System.out.println("============================================================================");
								td.showTeam();
						     }
						     if(up==3)
						     {
						    	 System.out.println("Enter the TeamID you want to update - ");
						    	 int oteam=Integer.parseInt(br.readLine()); 
						    	System.out.println("Enter new Team ID - ");
						    	String tid=br.readLine();
						    	String sql=String.format("update team set teamid='%s' where teamid='%s'",tid,oteam);
						    	td.updateTeam(sql); 
						    	System.out.println("Update Succesfully");
								System.out.println("============================================================================");
								td.showTeam();
						     }
						     if(up==4)
						     {
						    	 System.out.println("Enter the TeamID you want to update - ");
						    	 int oteam=Integer.parseInt(br.readLine()); 
						    	System.out.println("Enter new Team Captain - ");
						    	String tcapt=br.readLine();
						    	String sql=String.format("update team set teamcaptain='%s' where teamid='%s'",tcapt,oteam);
						    	td.updateTeam(sql);
						    	System.out.println("Update Succesfully");
								System.out.println("============================================================================");
								td.showTeam();
						     }
					
				}
				if(ch4==2) //update Player
				{
					System.out.println("-- Select to Update --");
					System.out.println("1.PlayerNo");
					System.out.println("2.PlayerName");
					System.out.println("3.PlayerSkill");
					System.out.println("4.TeamID");	
					System.out.println("5.PlayerCountry");
					int up=Integer.parseInt(br.readLine());
					if(up==1)//update player no
					{
						 System.out.println("Enter the PlayerName you want to update - ");
				    	 String pname=br.readLine();
				    	System.out.println("Enter new Player No - ");
				    	String pno=br.readLine();
				    	String sql=String.format("update player set playerno='%s' where playername='%s'",pno,pname);
				    	pd.updatePlayer(sql);
				    	System.out.println("Update Succesfully");
						System.out.println("============================================================================");
						pd.showPlayer();
					}
					if(up==2)//update pname
					{
						System.out.println("Enter the PlayerName you want to update - ");
				    	 String pname=br.readLine();
				    	System.out.println("Enter new Player Name - ");
				    	String pname1=br.readLine();
				    	String sql=String.format("update player set playername='%s' where playername='%s'",pname1,pname);
				    	pd.updatePlayer(sql);
				    	System.out.println("Update Succesfully");
						System.out.println("============================================================================");
						pd.showPlayer();
					}
					if(up==3)//update pskill
					{
						System.out.println("Enter the PlayerName you want to update - ");
				    	 String pname=br.readLine();
				    	System.out.println("Enter new Player Skill - ");
				    	String pskill=br.readLine();
				    	String sql=String.format("update player set playerskill='%s' where playername='%s'",pskill,pname);
				    	pd.updatePlayer(sql);
				    	System.out.println("Update Succesfully");
						System.out.println("============================================================================");
						pd.showPlayer();
					}
					if(up==4)//update teamid
					{
						System.out.println("Enter the PlayerName you want to update - ");
				    	 String pname=br.readLine();
				    	System.out.println("Enter new TeamID - ");
				    	String pid=br.readLine();
				    	String sql=String.format("update player set teamid='%s' where playername='%s'",pid,pname);
				    	pd.updatePlayer(sql);
				    	System.out.println("Update Succesfully");
						System.out.println("============================================================================");
						pd.showPlayer();
					}
					if(up==5)//update pcountry
					{
						System.out.println("Enter the PlayerName you want to update - ");
				    	 String pname=br.readLine();
				    	System.out.println("Enter new Player Country - ");
				    	String pcon=br.readLine();
				    	String sql=String.format("update player set playercountry='%s' where playername='%s'",pcon,pname);
				    	pd.updatePlayer(sql);
				    	System.out.println("Update Succesfully");
						System.out.println("============================================================================");
						pd.showPlayer();
					}
				}
				
			}
			if(ch1==4)
			{
			//System.out.println("Delete");
				System.out.println("--which Team you want to Operate Delete--");
				System.out.println("1.Delete in Team Table");
				System.out.println("2.Delete in Team Player");
				int chd=Integer.parseInt(br.readLine());
				if(chd==1)//delete in Team
				{
					System.out.println("Enter Team you want Delete");
					String tname=br.readLine();
					String sql=String.format("delete from team where teamname='%s'",tname);
			    	td.deleteTeam(sql);
					System.out.println("============================================================================");
					td.showTeam();
					
				}
				if(chd==2)//delete in Player
				{
					System.out.println("Enter Player Name you want Delete");
					String tname=br.readLine();
					String sql=String.format("delete from player where playername='%s'",tname);
			    	pd.deletePlayer(sql);
					System.out.println("============================================================================");
					pd.showPlayer();
				}
				
			}
		}
	}


