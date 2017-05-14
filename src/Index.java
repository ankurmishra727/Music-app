

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Index extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<html>");
pw.println("<head>");
pw.println("<title> ProMp3 Website Template | Home </title>);");
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
    
    		pw.println("</div>");
    		pw.println("<div class=nav-wrap>");
    				pw.println("<ul class=group id=example-one>");
    						pw.println(" <li class=current_page_item><a href=Index>Home</a></li>");
    						pw.println("  <li><a href=SigIN>SignIn</a></li>");
					  	
    						
    				pw.println("</ul>");
    	    pw.println("</div>");
    	    pw.println("<div class=clear></div>"); 
    	    pw.println("</div>");
    	    pw.println("<div class=header-bot>");
    	    pw.println("<div class=logo>");
    	    pw.println("<a href=index.html><img src=images/logo.png alt=/></a>");
    	    pw.println("</div>");
    	    		pw.println("<div class=search-bar>");
    	    				pw.println("<ul>");
    	    				pw.println("<li><input type=text></li>");
    	    				pw.println("<input name=searchsubmit type=image src=images/search-icon.png value=Go id=searchsubmit class=btn>");
    	    				pw.println("</ul>");
    	    		pw.println("</div>");
    	    		pw.println("<div class=clear></div>"); 
    	    		pw.println("</div>");
    	    		pw.println("<div class=banner>");
    	    		pw.println(" <div id=wrapper>");
    	    			pw.println("<div class='slider-wrapper theme-default'>");
    	    			pw.println("<div id=slider class=nivoSlider>");
    	    			pw.println("<img src=images/banner1.jpg  alt= />");
    	    			pw.println("<img src=images/banner2.jpg  alt= />");
    	    			pw.println("<img src=images/banner3.jpg  alt= />");
    	    			pw.println("</div>");
    	    			pw.println("</div>");
    	    			pw.println(" </div>");
    	    			pw.println("</div>");
    	    			pw.println("</div>");
    	    		    pw.println("<div class=main style=background-color:#4682b4;>");
	
    	    			pw.println(" <div class=container>");
    	    			pw.println(" <div class=login>");
  
    	    			pw.println(" </br>");
    	    			pw.println("<h1 class=login-heading><strong>WELCOME.</strong>Please login.</h1>");
	   
     
    	    			pw.println("<form action=LoginDB method=post>");
	  
    	    			pw.println("<input type=text name=user placeholder=Username required=required class=input-txt />");
    	    			pw.println(" <input type=password name=password placeholder=Password required=required class=input-txt />");
       
    	    		    pw.println(" <a href=# class=lnk>");
    	    			pw.println(" <span class='icon icon--min'>ಠ╭╮ಠ</span>"); 
    	    					pw.println("  I've forgotten something");
    	    						pw.println("  </a>");
    	    					pw.println(" <button type=submit class=btn btn--right>Login   </button>");
    
          
    	    					pw.println("  </form> ");
    	    					pw.println("  </br></br>");
    	    					pw.println("<h2><a href='SigIN' class=lnk><center>new user, <u>SIGN IN</u></center></a></h2>");
    	    					pw.println(" </div>");
    	    					pw.println("</div></div>");
    
    	    				     pw.println("  <script src=js/index.js></script>");
    	    				 pw.println("<div class=footer-bottom>");
    	    					 pw.println("<div class=wrap>");
    	    					 pw.println("<div class=copy>");
    	    					pw.println("<p>All rights Reserved | Design by <a href=>Pankaj kumar</a></p>");
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
