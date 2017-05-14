

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class About extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");

		pw.println("<head>");
		pw.println("<title> ProMp3 Website Template | about</title>);");
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
		    	    		pw.println("<div class=section group>");
		    	    		pw.println("<div class='grid_1_of_3 images_1_of_3'>");
		    	    		pw.println("<h3>Who We are</h3>");
		    	    		pw.println("<img src=images/pic15.jpg alt=/>");
		    	            pw.println("<h4>pro mp3 </h4>");
		    	    		pw.println("<p>Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate.</p>");
		    	    		pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in volupta.</p>");
		    	    		pw.println("</div>");
		    	    		pw.println("<div class='grid_1_of_3 images_1_of_3'>");
		    	    		pw.println("<h3>Our Mission</h3>");
		    	    		pw.println("<h4>Spread music everywhere</h4>");
		    	    		pw.println("<p>Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate.</p>");
		    	    		pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>");
		    	    		pw.println("<h4>Qulity music </h4>");
		    	    		pw.println("<p>Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate.</p>");
		    	    	    pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute.</p>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("<div class='grid_1_of_3 images_1_of_3'>");
		    	    	    pw.println("<h3>Our History</h3>");
		    	    	    pw.println(" <h4>1995</h4>");
		    	    	    pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>");
		    	    	    pw.println("<h4>1997</h4>");
		    	    	    pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>");
		    	    	    pw.println("<h4>2005</h4>");
		    	    	    pw.println("<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Duis aute irure dolor in reprehenderit.adipisicing elit, sed do eiusmod tempor incididunt</p>");
		    	    	    pw.println("</div><div class=clear></div>"); 
		    	    	    pw.println("</div>");
		    	   pw.println("<div class=about-bottom>");
		    	   pw.println("<h3>Testimonials</h3>");
		    	   pw.println("<div class='col_1_of_4 span_1_of_4'>");
		    	   pw.println("<div class=recent-posts>");
		    	   pw.println("<div>");
		    	   pw.println("<div class=expert>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.... </div>");
		    	   pw.println("<div class=caption>Lorem ipsum</div>");
		           pw.println("<div class=clear></div></div>");
		    	   pw.println("</div>");
		    	   pw.println("</div>");
		    	pw.println("<div class='col_1_of_4 span_1_of_4'>");
		    	pw.println("<div class=recent-posts>");
		    	pw.println("<div>");
		    	pw.println("<div class=expert>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.... </div>");
		    	pw.println("<div class=caption>Lorem ipsum</div>");
		        pw.println("<div class=clear></div></div>");
		    	pw.println("</div>");
		        pw.println("</div>");
		    	pw.println("<div class='col_1_of_4 span_1_of_4'>");
		        pw.println("<div class='recent-posts'>");
		        pw.println("<div>");
		        pw.println("<div class=expert>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.... </div>");
		        pw.println("<div class=caption>Lorem ipsum</div>");
		        pw.println("<div class=clear></div></div>");
		        pw.println("</div>");
		        pw.println("</div>");
		        pw.println("<div class='col_1_of_4 span_1_of_4'>");
		        pw.println("<div class='recent-posts'>");
		        pw.println("<div>");
		        pw.println("<div class='expert'>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.... </div>");
		        pw.println("<div class=caption>Lorem ipsum</div>");
		       pw.println("<div class=clear></div></div>");
		       pw.println("</div>");
		       pw.println("</div>");
		       pw.println("<div class=clear></div>");
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
