

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewservlet
 */
@WebServlet("/viewservlet")
public class viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<a href='addemp.html'>Add Employee</a>");
		List<empmethod> list=empdata.getAllEmployees();
		pw.print("<h1 padding='10px'>Employee details</h1>");
		pw.print("<table border='1' width='100%' ><tr><th>Id:</th><th>Name</th><th>Password</th><th>Phone</th></tr>");
		
		for(empmethod e:list)
		{
			int a=e.getid();
			pw.print("<tr><td>"+e.getid()+"</td><td>"+e.getname()+"</td><td>"+e.getpassword()+"</td><td>"+e.getphone()+"</td><td><a href='updateservlet01?id="+a+"'>edit</a></td><td><a href='deleteservlet?id="+a+"'>delete</a></td></tr>");
			
		}
		pw.print("</table>");
		pw.close();
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
