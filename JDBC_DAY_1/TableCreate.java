package jdbcDemo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreate
	{
	public static void main(String args[])throws Exception
	{
	// Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis","root","root");
	Statement st=con.createStatement();

	st.execute("create table kid (vno int(10),vname varchar(10),vsal int(10))");
	System.out.println("Table created successfully");
	con.close();
	}
}

