

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Contact1 extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{

  PrintWriter pw=res.getWriter();
  System.out.println("helloo");
  
  String s1=req.getParameter("username");
  String s2=req.getParameter("email");
  String s3=req.getParameter("phone");
  String s4=req.getParameter("msg");
 
  String str="insert into Contact1(username, email, phone, message) values(?,?,?,?)";
  Connection con=new DBInfo().ConnectDB();
  int flag=0;
  try{
  PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
  ps.setString(1,s1);
  ps.setString(2,s2);
  ps.setString(3,s3);
  ps.setString(4,s4);

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
	  res.sendRedirect("Contact");
   }
  
  
 }
 }
 