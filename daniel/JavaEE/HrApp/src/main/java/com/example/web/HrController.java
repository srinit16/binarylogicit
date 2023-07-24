package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.dao.ConnectionFactory;
import com.example.dao.EmployeeBL;
import com.example.dao.EmployeeDao;
import com.example.dao.HRException;
import com.example.pojos.Employee;


@WebServlet("/HrController")
public class HrController extends HttpServlet {
	 
//    @EJB
//	private EmployeeBL dao;
    
	public HrController() {
       
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					String id=request.getParameter("q");
					String blabel=request.getParameter("b1");
					if(blabel.equals("Find")) {
						EmployeeDao dao=ConnectionFactory.get().getConnection(); //new EmployeeBL();
						Employee e=null;
						try {
							e=dao.findById(id);
							
						} catch (HRException ex) {
							ex.printStackTrace();
						}
					
					//request.setAttribute("emp", e);
					HttpSession session=request.getSession();
					session.setAttribute("emp", e);
			//		RequestDispatcher reqDispatcher=request.getRequestDispatcher("EmployeeUI");
			//		reqDispatcher.forward(request, response);	
					request.getRequestDispatcher("empdetails.jsp").forward(request, response);
					}else {
						//other logic to insert
					}
						
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
			
	}
	
	
}
