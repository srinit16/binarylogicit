package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.example.pojos.Employee;

@Stateless
public class EmployeeBL implements EmployeeDao{

	@Override
	public List<Employee> findAll() throws HRException{
		String jdbcURL ="jdbc:mysql://localhost:3306/practiceDB";
		List<Employee> empList=new ArrayList<>();
		try {
			Connection con=DriverManager.getConnection(jdbcURL, "root", "admin#123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			
			while(rs.next()) {
						int id=rs.getInt("EMP_ID");
						String name=rs.getString("EMP_NAME");
						double salary =rs.getDouble("SALARY");
						int deptId=rs.getInt("DEPT_ID");
						Employee e=new Employee();
						e.setId(id);
						e.setName(name);
						e.setSalary(salary);
						e.setDeptId(deptId);
						empList.add(e);
			}
		}catch(SQLException se) {
			throw new HRException(se.getMessage(),se);
		}
			
		return empList;
	}

	@Override
	public Employee findById(String id1) throws HRException {
		
		String jdbcURL ="jdbc:mysql://localhost:3306/practiceDB";
		Employee e=null;
		
		try(Connection con=DriverManager.getConnection(jdbcURL, "root", "admin#123");
		    PreparedStatement st=con.prepareStatement("select * from employee where emp_id=?"))
		{
					
			st.setString(1, id1);
			ResultSet rs=st.executeQuery();
			
			while(rs.next()) {
						int id=rs.getInt("EMP_ID");
						String name=rs.getString("EMP_NAME");
						double salary =rs.getDouble("SALARY");
						int deptId=rs.getInt("DEPT_ID");
						e=new Employee();
						e.setId(id);
						e.setName(name);
						e.setSalary(salary);
						e.setDeptId(deptId);
						
			}
		}catch(SQLException se) {
			throw new HRException(se.getMessage(),se);
		}
		
		return e;
	}

}
