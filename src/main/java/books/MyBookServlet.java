package books;

import java.io.IOException;

import jakarta.servlet.AsyncEvent;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyBookServlet extends HttpServlet {
	
	

	@Override
	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("Init called");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Service called");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Destroy Called");
	}
	
	
	

}
