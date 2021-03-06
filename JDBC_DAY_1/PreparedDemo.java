package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedDemo {
	public static void main(String args[])throws Exception
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis","root","root");
	PreparedStatement ps=con.prepareStatement("select * from kid");

	ResultSet rs=ps.executeQuery();
	while(rs.next())
    {
		
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3));
	
   }  
	System.out.println("");
	System.out.println("Using prepared statement");
   rs.close();
	
	con.close();
	}
}
