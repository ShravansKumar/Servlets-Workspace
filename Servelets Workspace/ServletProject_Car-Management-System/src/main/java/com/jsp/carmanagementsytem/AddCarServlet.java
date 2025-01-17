package com.jsp.carmanagementsytem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addcar")
public class AddCarServlet extends HttpServlet{
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
		int CarId=Integer.parseInt(req.getParameter("CarId"));
		String CarModel=req.getParameter("CarModel");
		String CarBrand=req.getParameter("CarBrand");
		int CarPrice=Integer.parseInt(req.getParameter("CarPrice"));
		
		Connection conn =null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/car_db","root","root");
			PreparedStatement pst=conn.prepareStatement("INSERT INTO car VALUES(?,?,?,?)");
			
			
			pst.setInt(1,CarId);
			pst.setString(2,CarModel);
			pst.setString(3, CarBrand);
			pst.setInt(4, CarPrice);
			
			pst.execute();
			
			resp.sendRedirect("index.jsp");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			if (conn !=null) {
				
				try {
					conn.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		

			
			
			
		}
		
		}

	
	
	
}


