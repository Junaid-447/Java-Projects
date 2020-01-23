

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_demo1
 */
@WebServlet("/Servlet_demo1")
public class Servlet_demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_demo1() {
        super();
        // TODO Auto-generated constructor stub
    
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String n=request.getParameter("uname");
		String p=request.getParameter("pass");
		
		if(n.equals("admin")&p.equals("pass"))
		{
			//out.println("<h2> Welcome User</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("ServletDemo1");
			rd.forward(request, response);
		}
		
		else
		{
			//out.println("<h2> Invalid Username or password</h2>");
			RequestDispatcher rd=request.getRequestDispatcher("/Servlet.html");
			rd.include(request, response);
						
		}
		doGet(request, response);
	}

}
