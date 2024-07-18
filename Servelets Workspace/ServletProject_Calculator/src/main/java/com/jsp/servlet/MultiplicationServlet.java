package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet. *;

public class MultiplicationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
			int num1=Integer.parseInt(req.getParameter("n1"));
			int num2=Integer.parseInt(req.getParameter("n2"));
			int mul= num1 * num2;
			
		PrintWriter out=res.getWriter();
		out.println("<h1>Multiplication result </h1>");
		out.println("<h2> Product of "+num1 +" and "+num2+" is " + mul + "</h2>");
		
		
		
	}

}