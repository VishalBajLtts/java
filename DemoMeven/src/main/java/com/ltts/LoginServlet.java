package com.ltts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/hi")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vis", "root", "root");
//      PreparedStatement ps=con.prepareStatement("insert into login values(?,?)");
//      ps.setString(1,user);
//      ps.setString(2,pass);
//      ps.execute();
		String user=request.getParameter("user");
		String pass=request.getParameter("pswd");
		
		PreparedStatement ps=con.prepareStatement("select * from login where username=? and userpass=?");
		ps.setString(1,user);
		ps.setString(2,pass);
      ResultSet rs=ps.executeQuery();
    
      PrintWriter out1=response.getWriter();
     
      if(rs.next())
      {
    	  out1.print("Login Successfull....");
    	  
      }
      else
      {
    	  out1.println("Failed Login");
      }
      
      
    
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
	}
		// TODO Auto-generated catch block
	  
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
