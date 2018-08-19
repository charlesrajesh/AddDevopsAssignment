

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addition")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out= response.getWriter(); 
		String num1=(request.getParameter("no1"));
		String num2=(request.getParameter("no2"));
		out.println(printAdd(num1,num2));
		
		
	}
	public String printAdd(String num1, String num2)
	{
		try{
			float num3=Float.parseFloat(num1);
			float num4=Float.parseFloat(num2);
		    float result=num3+num4;
		    return (Float.toString(result));
	}
	catch(Exception e){
		return("please type int or float");
	}
	}
}
