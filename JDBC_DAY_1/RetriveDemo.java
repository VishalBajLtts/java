package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveDemo {
	public static void main(String args[])throws Exception
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis","root","root");
	Statement st=con.createStatement();

	ResultSet rs=st.executeQuery("select * from kid");
	while(rs.next())
    {
		
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"   "+rs.getInt(3)); 
   }    
   rs.close();
	
	con.close();
	}
}
