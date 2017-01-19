

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterdemoFilter
 */
@WebFilter(servletNames = { "filterdemo" })
public class FilterdemoFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FilterdemoFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String n=request.getParameter("name");
		String p=request.getParameter("password");
		
		if(p.equals("pat"))
		{
			pw.print("filter invoked b4");
			chain.doFilter(request, response);
		}
		else
		{
			pw.print("Invalid username or password");
		}
		pw.print("filter invoked after");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
