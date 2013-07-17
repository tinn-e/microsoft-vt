import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	 throws IOException, ServletException
	 {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uname= request.getParameter("login");
		String psw= request.getParameter("password");
		
		if(uname.equals("admin") && psw.equals("admin"))
		{
			out.println("You have successfully logged in");
		}
		else		
			out.println("either user name or password is invalid");
	 }
}