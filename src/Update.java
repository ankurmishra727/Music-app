import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Update extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
			HttpSession session=request.getSession();
							String s1=(String)(session.getAttribute("id2"));
				    		

                            String str="select * from path";
							 Connection con=new DBInfo().ConnectDB();
                             try{
                             PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
                              ResultSet rs=ps.executeQuery();
                               while(rs.next())
                                {
                            	   String s2=rs.getString("id");
                            	   String s3=rs.getString("path1");
                            	   String s4=rs.getString("path2");		                    
                            	   String s5=rs.getString("path3");
                            	  				                  
                            		pw.println("<tr>");
									 pw.println("<td>"+s2+"</td>");
									    pw.println("<td>"+s3+"</td>");
                            			pw.println("<td>"+s4+"</td>");
                            			pw.println("<td>"+s5+"</td>");
                            		    pw.println("<td><a href=DeleteSong?path3="+s5+"><u>DELETE</u></a></td>");
                            		   pw.println("</tr>");
				                 }
                                 }
							catch(Exception e)
                             {
                              e.printStackTrace();
                                 }
								 pw.println("</table></center>");
			    	    	
	    	    						pw.println("</body>");
	    	    						pw.println("</html>");



	}

}
