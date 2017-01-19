

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pkservletlogout
 */
@WebServlet("/pkservletlogout")
public class pkservletlogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pkservletlogout() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");  
	      PrintWriter out=response.getWriter();  
	          
	          
	        Cookie ck[]=request.getCookies();
	        if(ck==null)
	        {
	        	out.print("login 1st");  
		        request.getRequestDispatcher("home.html").include(request, response);
	        }
	        else
	        {
	        int n=ck.length-1;
	        Cookie ck1=new Cookie(ck[n].getName(),"");
	        ck1.setMaxAge(0);  
	        response.addCookie(ck1);  
	          
	        out.print("you are successfully logged out!");  
	        request.getRequestDispatcher("home.html").include(request, response);
	        }
	        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");  
	      PrintWriter out=response.getWriter();  
	          
	          
	        Cookie ck[]=request.getCookies();
	        if(ck==null)
	        {
	        	out.print("login 1st");  
		        request.getRequestDispatcher("home.html").include(request, response);
	        }
	        else
	        {
	        int n=ck.length-1;
	        Cookie ck1=new Cookie(ck[n].getName(),"");
	        ck1.setMaxAge(0);  
	        response.addCookie(ck1);  
	          
	        out.print("you are successfully logged out!");  
	        request.getRequestDispatcher("home.html").include(request, response);
	        }
	        out.close();
	}

}
