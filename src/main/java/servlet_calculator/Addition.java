package servlet_calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Add")
public class Addition implements Servlet
{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		int num1=Integer.parseInt(arg0.getParameter("num1"));
		int num2=Integer.parseInt(arg0.getParameter("num2"));
		
		arg1.getWriter().print(" <html><body><h1 style='color:red'>the sum of "+num1+" and "+num2+" is "+(num1+num2 )+" </h1></body></html>");
	}
   
}
