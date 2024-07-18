package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name =req.getParameter("n");
		
		req.setAttribute("abc",name);  //what
		
		RequestDispatcher rd=req.getRequestDispatcher("Output.jsp"); //where
		rd.forward(req, res); //forward
		
				
	}


}
