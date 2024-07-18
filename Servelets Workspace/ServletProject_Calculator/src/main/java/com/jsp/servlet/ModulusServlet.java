package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet. *;

public class ModulusServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
			int num1=Integer.parseInt(req.getParameter("n1"));
			int num2=Integer.parseInt(req.getParameter("n2"));
			int mod= num1- num2;
			
		PrintWriter out=res.getWriter();
		out.println("<h1>Mod result </h1>");
		out.println("<h2> Modulus of "+num1 +" and "+num2+" is " + mod + "</h2>");
		
		
		
	}

}
