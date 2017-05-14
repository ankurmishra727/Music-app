import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Albums extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		pw.println("<html>");

		pw.println("<head>");
		pw.println("<title> ProMp3 Website Template | Albums</title>);");
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
		    	    pw.println("<a href=Index1><img src=images/logo.png alt=/></a>");
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
		    	    		pw.println("<div class=main>");
		    	    		pw.println("<div class=content-bottom>");			
			    	    	pw.println("<div class=leftsidebar span_3_of_1>");
			    	    	pw.println("<h3>Categories</h3>");
			    	        pw.println("<div class=sidebar-nav>");
			    	    	pw.println("</br><ul>");
			    	    	pw.println("<li><a href=Albums>Folk</a></li>");
			    	    	pw.println("<li><a href=Albums>Hip Hop</a></li>");
			    	    	pw.println("<li><a href=Albums>Pop</a></li>");
			    	    	pw.println("<li><a href=Albums>Rock</a></li>");
			    	    	pw.println("<li><a href=Albums>Jazz</a></li>");
	                   
			    	    	pw.println("</ul>");
			    	    	pw.println("</div>");
			    	    	pw.println("</div>");				
			    	    	pw.println("<div class=content span_1_of_2>");
			    	    	pw.println("<div class=right-bottom1>");
							
							 String str="select * from path";
							 
                            Connection con=new DBInfo().ConnectDB();

                               try{
                             PreparedStatement ps=(PreparedStatement)con.prepareStatement(str);
                              ResultSet rs=ps.executeQuery();
                               while(rs.next())
                                {
                             
                             String s2=rs.getString("path1");
                             String s3=rs.getString("path2");
							 String s4=rs.getString("path3");
			    	    	pw.println("<div class=grid_1_of_4 images_1_of_5>");
			    	    	pw.println("<div class=grid1-img>");
			    	    	pw.println("<a href=Single?path1="+s2+"&path2="+s3+"&path3="+s4+"><img src="+s2+" alt=/></a>");
			    	    	pw.println("<div class=price-list>");
			    	    	pw.println("<h3><a href=Single?path1="+s2+"&path2="+s3+"&path3="+s4+">"+s4+" </h3></a>");
			    	    	pw.println("<div class=price>");
			    	    	 
			    	    	pw.println("</div>");
			    	    	pw.println("<div class=cart>");
			    	    	pw.println("<a  href=Single?path1="+s2+"&path2="+s3+"&path3="+s4+" class=button addToCart><span>play</span></a>");
			    	    	
			    	    	pw.println("</div>");
			    	    	pw.println("<div class=clear></div>");
			    	    	pw.println("</div> ");
			    	    	pw.println(" </div>");
			    	        pw.println("</div>");
                            }
                            }
                           catch(Exception e)
                             {
                              e.printStackTrace();
                                 }
			    	    	pw.println("<div class=clear></div>"); 
			    	    	pw.println("</div>");
			    	    	pw.println("</div>");	
			    	    	pw.println("<div class=clear></div>");		
			    	    	pw.println(" </div>");
			    	    	pw.println("</div>");
			    	    	pw.println("</div>");
			    	    			 pw.println("<div class=footer-bottom>");
	    	    					 pw.println("<div class=wrap>");
	    	    					 pw.println("<div class=copy>");
	    	    					pw.println("<p>All rights Reserved | Design by <a href=Logout><u>LOGOUT</u></a></p>");
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
