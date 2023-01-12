package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	static {
		System.out.println("Loading....");
	}
	public SecondServlet() {
		System.out.println("instantiation....");
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		ServletConfig config = getServletConfig();
		System.out.println("Config obj is available: "+config);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>doGet method is getting called</title></head>");
		out.println("<body>");
		out.println("<h1>Getting the response for GET request type</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		System.out.println("get request is executing....");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>doPost method is getting called</title></head>");
		out.println("<body>");
		out.println("<h1>Getting the response for POST request type</h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		System.out.println("post request is executing....");
	}
	
	

}
