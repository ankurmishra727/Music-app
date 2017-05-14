import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginDB extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException{
String utype="";
  PrintWriter pw=res.getWriter();
 
  String s1=req.getParameter("user");
  String s2=req.getParameter("password");
  HttpSession session=req.getSession();
  session.setAttribute("id2",s1);
  String str="Select *from login where username=? and password=?";  
  Connection con=new DBInfo().ConnectDB();
  int flag=0;
  try{
  PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
  ps.setString(1,s1);
  ps.setString(2,s2);
  ResultSet rs=ps.executeQuery();
  while(rs.next())
  {
  flag=1;
  utype=rs.getString("usertype");
  break;
  }
  }
  catch(Exception e){
  e.printStackTrace();
}
  
  if(flag==1 && utype.equalsIgnoreCase("user"))
  {
   res.sendRedirect("Index1");
   }
   if(flag==1 && utype.equalsIgnoreCase("Admin"))
  {
   res.sendRedirect("Admin");
   }
  if(flag==0)
   {
   res.sendRedirect("Index");
   }
 
 }
 }
 