package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.dao.ConnectionFactory;
import com.example.dao.EmployeeDao;
import com.example.dao.HRException;
import com.example.pojos.Employee;


@WebServlet("/HrController")
public class HrController extends HttpServlet {
	 
    public HrController() {
       
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					String id=request.getParameter("q");
					EmployeeDao dao=ConnectionFactory.get().getConnection();
					Employee e=null;
					try {
						e=dao.findById(id);
						
					} catch (HRException ex) {
						ex.printStackTrace();
					}
					PrintWriter pw=response.getWriter();
					pw.println("<html>");
					pw.println("<body>");
					pw.println("<p>Emp Id:"+e.getId());
					pw.println("<p>Emp Name:"+e.getName());
					pw.println("<p>Salary:"+e.getSalary());
					pw.println("<p>Dept Id:"+e.getDeptId());
					pw.println("</body>");
					pw.println("</html>");
						
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
			
	}
	
	
}
