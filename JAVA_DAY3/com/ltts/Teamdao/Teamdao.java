package com.ltts.Teamdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ltts.connection.ConnectionProvider;
import com.ltts.model.Team.Team;

public class Teamdao {
	Connection con= ConnectionProvider.getconnetion();
	
	public void showTeam() throws SQLException
	{
		

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from team");
		System.out.println("TeamName\tTeamOwner\tTeamID\tTeamCaptain");

		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
con.close();
		
	}
	
	public void insertTeam(Team t) throws SQLException
	{
		Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?)");
		ps.setString(1,t.getTeamName());
		ps.setString(2,t.getTeamOwner());
		ps.setInt(3,t.getTeamId());
		ps.setString(4,t.getTeamCaption());
		int i=ps.executeUpdate();
		System.out.println("No of rows effected - "+i);
	}
	public void updateTeam(String sql) throws SQLException
	{
		
		Statement st=con.createStatement();
		int count=st.executeUpdate(sql);
	}
	public void deleteTeam(String sql) throws SQLException
	{
		Statement st=con.createStatement();
		int count=st.executeUpdate(sql);
		System.out.println("no of rows deleted - "+count);
	}

}
