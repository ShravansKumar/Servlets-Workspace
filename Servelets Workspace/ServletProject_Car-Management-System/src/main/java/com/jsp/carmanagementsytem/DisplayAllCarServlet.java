package com.jsp.carmanagementsytem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/displayAllcars")
public class DisplayAllCarServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_db","root","root");
			PreparedStatement pst=conn.prepareStatement("SELECT * FROM car");
			ResultSet rs =pst.executeQuery();
	
			req.setAttribute("carList", rs);  //what to forward
			RequestDispatcher rd = req.getRequestDispatcher("DisplayAllCars.jsp");  //where to forward including the address
			
			rd.forward(req, resp);   //forward
					
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
					finally {
						if(conn !=null) {
							try {
								conn.close();
								
							}
							catch(Exception e ) {
								e.printStackTrace();
							}
						}
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
}
}