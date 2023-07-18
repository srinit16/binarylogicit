package com.example.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.pojos.Employee;


@WebServlet("/EmployeeUI")
public class EmployeeUI extends HttpServlet {
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee d1=(Employee) request.getAttribute("emp");
		PrintWriter pw=response.getWriter();
		pw.println("<html><head><title>Emoloyee UI </title></head>");
		pw.println("<body>");
		pw.println("<h2> Employee Details </h2");
		pw.println("<p>Emp Id:"+d1.getId());
		pw.println("<p>Emp Name:"+d1.getName());
		pw.println("<p>Salary:"+d1.getSalary());
		pw.println("<p>Dept Id:"+d1.getDeptId());
		pw.println("</body>");
		pw.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
