package com.example.pojos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBL implements EmployeeDao{

	@Override
	public List<Employee> findAll() throws SQLException{
		String jdbcURL ="jdbc:mysql://localhost:3306/practiceDB";
		List<Employee> empList=new ArrayList<>();
		
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
			
		return empList;
	}

	@Override
	public Employee findById(int id) {
		
		return null;
	}

}
