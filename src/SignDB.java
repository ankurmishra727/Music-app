import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class SignDB extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{

  PrintWriter pw=res.getWriter();
  System.out.println("helloo");
  String s1=req.getParameter("fname");
  String s2=req.getParameter("lname");
  String s3=req.getParameter("email");
  String s4=req.getParameter("username");
  String s5=req.getParameter("pass");
  String s6="user"; 
  String str="insert into login(firstname, lastname, email, username, password,usertype) values(?,?,?,?,?,?)";
  Connection con=new DBInfo().ConnectDB();
  int flag=0;
  try{
  PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
  ps.setString(1,s1);
  ps.setString(2,s2);
  ps.setString(3,s3);
  ps.setString(4,s4);
  ps.setString(5,s5);
  ps.setString(6,s6);
  flag=ps.executeUpdate();
  }
  catch(Exception e)
  {
  e.printStackTrace();
  }
  if(flag!=0)
  {
	  res.sendRedirect("Index");
   }
  if(flag==0)
   {
	  res.sendRedirect("SigIN");
   }
  
  
 }
 }
 