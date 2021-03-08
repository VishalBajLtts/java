package com.ltts.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	public static Connection getconnetion()
	{
		Connection con=null;
		try
		{
			Class.forName(DataBaseDetail.Driver_name);
			 con=DriverManager.getConnection(DataBaseDetail.Driver_url,DataBaseDetail.Driver_user,DataBaseDetail.Driver_pswd);
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		return con;
	}
}
