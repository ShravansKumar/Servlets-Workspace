package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet. *;

public class DivisionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
			int num1=Integer.parseInt(req.getParameter("n1"));
			int num2=Integer.parseInt(req.getParameter("n2"));
			int div= num1 / num2;
			
		PrintWriter out=res.getWriter();
		out.println("<h1>Division result </h1>");
		out.println("<h2> Division between  "+num1 +" and "+num2+" is " + div + "</h2>");
		
		
		
	}

}
