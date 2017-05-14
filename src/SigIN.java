

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SigIN extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		pw.println("<html >");
				pw.println("<head>");
				pw.println("<meta charset=UTF-8>");
				pw.println ("<title>Simple sign in form</title>");
    
    
				pw.println ("<link rel=stylesheet href=css/reset.css>");

    
				pw.println ("<link rel=stylesheet href=css/style1.css>");

    
    
    
				pw.println ("</head>");

				pw.println ("<body>");

				pw.println ("<div class=container>");
				pw.println("<div class=login>");
				pw.println("<h1 class=login-heading>");
				pw.println("<strong>Welcome.</strong> Please <u>Sign in</u></h1>");
				pw.println("<form  action=SignDB method=post>");
				pw.println(" <input type=text name=fname placeholder=First Name required=required class=input-txt />");
				pw.println("<input type=text name=lname placeholder=Last Name required=required class=input-txt />");
				pw.println(" <input type=email name=email placeholder=E-mail required=required class=input-txt />");
				pw.println("<input type=text name=username placeholder=Username required=required class=input-txt />");
				pw.println(" <input type=password name=pass placeholder=Password required=required class=input-txt />");
				pw.println("<div class=login-footer>");
				pw.println(" <a href=# class=lnk>");
              
			    pw.println("Change details, <u>Refresh</u>");
				pw.println("</a>");
				pw.println("<button type=submit class=btn btn--right>Sign in  </button>");
    
				pw.println(" </div>");
				pw.println("</form>");
				pw.println(" </div>");
				pw.println("</div>");
    
				pw.println("<script src=js/index.js></script>");

    
    
    
				pw.println("</body>");
						pw.println("</html>");
	}

	
}
