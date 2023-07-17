package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HrController")
public class HrController extends HttpServlet {
	 
    public HrController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					int id=Integer.parseInt(request.getParameter("q"));
					PrintWriter pw=response.getWriter();
					pw.println("<html>");
					pw.println("<head></head>");
					pw.println("<body bgcolor='yellow'>");
					pw.println("<b> GET METHOD "+id+"<b>");
					pw.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int id=Integer.parseInt(request.getParameter("q"));
//		PrintWriter pw=response.getWriter();
//		pw.println("<html>");
//		pw.println("<head></head>");
//		pw.println("<body bgcolor='cyan'>");
//		pw.println("<b> POST METHOD "+id+"<b>");
//		pw.println("</body></html>");
		doGet(request, response);
			
	}
	
	
}
