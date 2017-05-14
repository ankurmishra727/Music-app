import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class UploadSong extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{

  PrintWriter pw=res.getWriter();
 
  String s1=req.getParameter("Institute_Code");
  String s2=req.getParameter("Institute_Name");
  String s3=req.getParameter("City_Name");
  String s4=req.getParameter("General_Seat");
  String s4=req.getParameter("OBC_Seat");
  String s4=req.getParameter("SC_Seat");
  String s4=req.getParameter("ST_Seat");
  String s4=req.getParameter("Total_Seat");
  String s4=req.getParameter("Email");
  String s4=req.getParameter("Website");
  
  
  
  
  
  String str="insert into path(Institute_Code, Institute_Name, City_Name, General_Seat,OBC_Seat,SC_Seat,ST_Seat,Total_Seat,Email,Website) values(?,?,?,?,?,?,?,?,?,?)";
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
  ps.setString(7,s7);
  ps.setString(8,s8);
  ps.setString(9,s9);
  ps.setString(10,s10);
  flag=ps.executeUpdate();
  }
  catch(Exception e)
  {
  e.printStackTrace();
  }
  if(flag!=0)
  {
	  res.sendRedirect("AddSong");
   }
  if(flag==0)
   {
	  res.sendRedirect("Admin");
   }
  
  
 }
 }
 	


