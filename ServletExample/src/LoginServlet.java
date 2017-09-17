

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("service method started");
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		if(name =="" && password ==""){
			
		pw.print("plz! enter the name and password");
		}
		else{
		
		pw.print("\nentered name is : " +name+ " and entered password is :" +password);
		pw.print("\nlogined successfully");
		
		}
		
	}

}
