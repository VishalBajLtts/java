package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	public static void main(String args[])throws Exception
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis","root","root");
	Statement st=con.createStatement();

	st.executeUpdate("insert into kid values(11,'vishal',1000)");
	System.out.println("Data Inserted successfully");
	con.close();
	}
}
