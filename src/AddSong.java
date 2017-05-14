import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddSong extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");

		pw.println("<head>");
		pw.println("<title> ProMp3 Website Template | AddSong </title>);");
		pw.println("<link href=css/style.css rel=stylesheet type=text/css media=all />");
			pw.println("<meta name=viewport content=width=device-width, initial-scale=1, maximum-scale=1>");
			pw.println("<meta http-equiv=Content-Type content=text/html; charset=utf-8 />");
			pw.println(" <link rel=stylesheet href=css/reset.css>");   
			pw.println(" <link rel=stylesheet href=css/style1.css>");
			pw.println("<link href=css/default.css rel=stylesheet type=text/css media=all />");
			pw.println("<link href=css/nivo-slider.css rel=stylesheet type=text/css media=all />");
			pw.println("<script src=js/jquery-1.9.0.min.js></script>");
			pw.println(" <script src=js/jquery.nivo.slider.js></script>");
			pw.println("    <script type=text/javascript>");
			pw.println("    $(window).load(function() {");
			pw.println("   $('#slider').nivoSlider();");
			pw.println("  });");
			pw.println("   </script>");
		    pw.println("<!--nav-->");
		    pw.println("<script src='js/jquery.color-RGBa-patch.js'></script>");
		    pw.println("<script src='js/example.js'></script>");
		    pw.println("</head>");
		    		pw.println("<body>");
		    	    pw.println("<div class=header-bg>");
		    		pw.println("<div class=wrap>");
		    		pw.println("<div class=h-bg>");
		    		pw.println("<div class=header>");
		    		pw.println("<div class=header-top>");
		    		pw.println("<div class=enter>");
		    		HttpSession session=request.getSession();
							String s1=(String)(session.getAttribute("id2"));
				    		pw.println("<h4>Welcome.."+s1+"</h4>");
		    		pw.println("</div>");
		    		pw.println("<div class=nav-wrap>");
		    				pw.println("<ul class=group id=example-one>");
		    						pw.println(" <li class=current_page_item><a href=Index1>Home</a></li>");
		    						pw.println("  <li><a href=About>About</a></li>");
		    						 pw.println(" <li><a href=Albums>Albums</a></li>");
		    						pw.println("<li><a href=Contact>Contact</a></li>");
		    				pw.println("</ul>");
		    	    pw.println("</div>");
		    	    pw.println("<div class=clear></div>"); 
		    	    pw.println("</div>");
		    	    pw.println("<div class=header-bot>");
		    	    pw.println("<div class=logo>");
		    	    pw.println("<a href=1ndex1><img src=images/logo.png alt=/></a>");
		    	    pw.println("</div>");
		    	    		pw.println("<div class=search-bar>");
		    	    				pw.println("<ul>");
		    	    				pw.println("<li><input type=text></li>");
		    	    				pw.println("<input name=searchsubmit type=image src=images/search-icon.png value=Go id=searchsubmit class=btn>");
		    	    				pw.println("</ul>");
		    	    		pw.println("</div>");
		    	    		pw.println("<div class=clear></div>"); 
		    	    		pw.println("</div>");
		    	    		pw.println("</div>");
		    	    		pw.println("<div class=main style=background-color:#f5f5dc>");
		    	    		pw.println("<div class=content-bottom>");			
			    	    	pw.println("<div class='leftsidebar span_3_of_1'>");
			    	    	pw.println("<h3>Dashboard</h3>");
			    	        pw.println("<div class=sidebar-nav>");
			    	    	pw.println("</br><ul>");
			    	    	pw.println("<li><a href=Admin>User List</a></li>");
			    	    	pw.println("<li><a href=AddSong>Add a new Song</a></li>");
			    	    	pw.println("<li><a href=Update>Update the Library</a></li>");
			    	    	pw.println("<li><a href=UserDetails>User Details</a></li>");
			    	   
	                   
			    	    	pw.println("</ul>");
			    	    	pw.println("</div>");
			    	    	pw.println("</div>");				
			    	    	
			    	    	pw.println("<div class=right-bottom1>");
			    	    	
			    			pw.println("<div>");
                              pw.println("<h2>ADD NEW SONG</h2>");
                            pw.println("<hr>");							  
			    			 pw.println("<form method=post action=UploadSong >");
          
       pw.println("<center>");
                  pw.println("<table  >");
                  
                    pw.println("<thead>");
                     pw.println(" <tr>");
                    pw.println("<p><input type=text name=id Placeholder=Enter_Song_ID></p>");
                    
                                                    pw.println("<br/>");
                    pw.println("<p>   <input type=trxt name=Iaddr Placeholder=Enter_Image_path></p>");
                                                   pw.println("<br/>");
                      pw.println("<p>  <input type=text name=Saddr Placeholder=Enter_Song_Path></p>");
                                                    pw.println("<br/>");
					pw.println(" <p>  <input type=text name=Sname Placeholder=Enter_Song_Name></p>");
                     pw.println("<p><input type=submit value=Upload /></p>");
					 
                     pw.println(" </tr>"); 
                    pw.println("</thead>");


                
                      
                   
                 pw.println("</table></center></form>");
			    	    	 pw.println("</div>");
			    	 pw.println("<div class=clear></div>");		
			    	    	pw.println("</div>");
			    	    			 pw.println("<div class=footer-bottom>");
	    	    					 pw.println("<div class=wrap>");
	    	    					 pw.println("<div class=copy>");
	    	    					pw.println("<p>All rights Reserved | Design by Pankaj,<a href=Logout><u>LOGOUT</u></a></p>");
	    	    						pw.println("</div>");
	    	    								pw.println("<div class=social>");
	    	    										pw.println("<ul class=follow_icon>");
	    	    												pw.println("<li><a href=# style=opacity: 1;><img src=images/facebook.png alt=></a></li>");
	    	    												pw.println("<li><a href=# style=opacity: 1;><img src=images/twitter.png alt=></a></li>");
	    	    												pw.println("<li><a href=# style=opacity: 1;><img src=images/google.png alt=></a></li>");
	    	    												pw.println("<li><a href=# style=opacity: 1;><img src=images/feed.png alt=></a></li>");
	    	    												pw.println("</ul>");
	    	    						pw.println("</div>");
	    	    						pw.println("<div class=clear></div>");	
	    	    						pw.println("</div>");
	    	    						pw.println("</div>");


	    	    						pw.println("</div>");
	    	    						pw.println("</div>");
	    	    						pw.println("</div>");

	    	    						pw.println("</body>");
	    	    						pw.println("</html>");



	}

}
