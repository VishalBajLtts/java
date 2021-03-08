package com.ltts.Playerdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.ltts.connection.ConnectionProvider;
import com.ltts.model.Player.Player;

public class Playerdao {
	//Player p=new Player();
	Connection con= ConnectionProvider.getconnetion();
	
	
	public void showPlayer() throws SQLException
	{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from player");
			
			while(rs.next())
			{
				Date d1=rs.getDate("DOB");
				System.out.println(rs.getDate("DOB"));
				System.out.println(d1);
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+d1);
			}

			con.close();
	}
	
	public void insertPlayer(Player p) throws SQLException
	{
		
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into player values(?,?,?,?,?)");
			ps.setInt(1,p.getPlayerNo());
			ps.setString(2,p.getPlayerName());
			ps.setString(3,p.getPlayerSkill());
			ps.setInt(4,p.getTeamid());
			ps.setString(5,p.getPlayercountry());
			int i=ps.executeUpdate();
			System.out.println("No of rows effected - "+i);
		
	}
	public void updatePlayer(String sql) throws SQLException
	{
		
		Statement st=con.createStatement();
		int count=st.executeUpdate(sql);
	}
	public void deletePlayer(String sql) throws SQLException
	{
		Statement st=con.createStatement();
		int count=st.executeUpdate(sql);
	}

}
