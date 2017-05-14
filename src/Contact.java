

import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Contact extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");

		pw.println("<head>");
		pw.println("<title> ProMp3 Website Template | Contact</title>);");
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
		    	    		pw.println("<div class='col span_1_of_3'>");
		    	    		pw.println("<div class='contact_info'>");
		    	    		pw.println("<h3>Find Us Here</h3>");
		    	    	    pw.println("<div class='map'>");
		    	    		pw.println("<iframe width=100% height=175 frameborder=0 scrolling=no marginheight=0 marginwidth=0 src='https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed'></iframe><br><small><a href='https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265' style=color:#666;text-align:left;font-size:12px>View Larger Map</a></small>");
		    	    		pw.println("</div>");
		    	    		pw.println("</div>");
		    	    		pw.println("<div class='company_address'>");
		    	    		pw.println("<h3>Company Information :</h3>");
		    	    	    pw.println("<p>500 Lorem Ipsum Dolor Sit,</p>");
		    	    	    pw.println("<p>22-56-2-9 Sit Amet, Lorem,</p>");
		    	    	    pw.println("<p>USA</p>");
		    	    	    pw.println("<p>Phone:(00) 222 666 444</p>");
		    	    	    pw.println("<p>Fax: (000) 000 00 00 0</p>");
		    	    	    pw.println("<p>Email: <span>info@mycompany.com</span></p>");
		    	    	    pw.println("<p>Follow on: <span>Facebook</span>, <span>Twitter</span></p>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("</div>");				
		    	    	    pw.println("<div class='col span_2_of_3'>");
		    	    	    pw.println("<div class='contact-form'>");
		    	    	    pw.println("<h3>Contact Us</h3>");
		    	    	    pw.println("<form method=post action=contact1>");
		    	    	    pw.println("<div>");
		    	    	    pw.println("<span><label>NAME</label></span>");
		    	    	    pw.println("<span><input name=username type=text class=textbox></span>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("<div>");
		    	    	    pw.println("<span><label>E-MAIL</label></span>");
		    	    	    pw.println("<span><input name=email type=text class=textbox></span>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("<div>");
		    	    	    pw.println("<span><label>MOBILE</label></span>");
		    	    	    pw.println("<span><input name=phone type=text class=textbox></span>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("<div>");
		    	    	    pw.println("<span><label>SUBJECT</label></span>");
		    	    	    pw.println("<span><textarea name=msg> </textarea></span>");
		    	    	    pw.println(" </div>");
		    	    	    pw.println("<div>");
		    	    	    pw.println("<span><input type=submit value=Submit></span>");
		    	    	    pw.println("</div>");
		    	    	    pw.println("</form>");

		    	    	    		pw.println("</div>");
		    	    	    				pw.println("</div>");				
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