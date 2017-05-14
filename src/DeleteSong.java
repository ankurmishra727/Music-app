import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DeleteSong extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String s5=request.getParameter("path3");
		
							 String str="delete  from path where path3='"+s5+"'";
							 
                            Connection con=new DBInfo().ConnectDB();

                               try{
                             PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
                              int rs=ps.executeUpdate();
							  if(rs!=0){
							  response.sendRedirect("Update");
							   }}
					 catch(Exception e){
                                        e.printStackTrace();
                                                 }
						     
	}

}
