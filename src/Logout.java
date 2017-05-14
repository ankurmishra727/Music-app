

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Logout extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{

	HttpSession session=req.getSession();
	String s1=(String)(session.getAttribute("id2"));
	session.invalidate();
	res.sendRedirect("Index1");
	}

}
