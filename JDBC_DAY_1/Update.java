package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
	public static void main(String args[])throws Exception
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis","root","root");
	Statement st=con.createStatement();

	int i=st.executeUpdate("update kid set vsal='1010' where vno=11" );
	System.out.println("Number of rows effected"+i);
	
	con.close();
	}
}
