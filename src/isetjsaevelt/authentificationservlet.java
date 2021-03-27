package isetjsaevelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class authentificationservlet
 */
@WebServlet("/authentificationservlet")
public class authentificationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentificationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String lo = request.getParameter("a");
		String pas = request.getParameter("b");
		
		request.setAttribute("a",lo);
		request.setAttribute("b",pas);
		
		 if (lo == null || lo.isEmpty()) {
			 out.println("<p>entre votre login </p>");
	        }
		 else {
			 out.println("<b>"+lo+"</b>");
		 }
			 
		 

	        if (pas == null || pas.isEmpty()) {
	        	 out.println("<p>entre votre password  </p>");
	        }
	        else {
				 out.println("<b>"+pas+"</b>") ;
			 }
	}	        
	  /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
