package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.connection.*;
import com.ltts.model.*;

public class Auctiondao {
	
	public boolean insertAuction(Auction p) throws Exception {
		//fill your code
		Connection mc=DatabaseConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?)");
		ps.setInt(1, p. getAuc_id());
		ps.setInt(2, p. getPlayer_id());
		ps.setInt(3, p.getTeam_id());
		ps.setInt(4, p.getAmount());
		
		
		return ps.execute();
	}
	public List<Auction> showAuction() throws Exception
	{
		List<Auction> li=new ArrayList<Auction>();
		
		Connection con= DatabaseConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Auction");
			
			while(rs.next())
			{
				li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)));
			}

			return li;
	}
}

