

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pkservlet1
 */
@WebServlet("/pkservlet1")
public class pkservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pkservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String n="";
		String p="";
		int x=0;
		
		Cookie ck[]=request.getCookies();
		if(ck==null)
		{
			pw.print("invalid username or password...");  
	        request.getRequestDispatcher("login.html").include(request, response);
		}
		else
		{
		for(int i=0;i<ck.length;i++)
		{
			if(name.equals(ck[i].getName()) && password.equals(ck[i].getValue()))
			{
				n=ck[i].getName();
				p=ck[i].getValue();
				x=i;
				break;
				
			}
		}

		if(name.equals(n) && password.equals(p))
		{
			pw.print("welcome" + n + "successfull login..");
			response.addCookie(ck[x]);
			request.getRequestDispatcher("home.html").include(request, response);
		}
		else
		{
			pw.print("invalid username or password...");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		}
		
		pw.close();
	}

}
