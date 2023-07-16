package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.beans.Employee;

public class EmployeeBL implements EmployeeDao {

	@Override
	public List<Employee> findAll() {
		List<Employee> empList=new ArrayList<>();
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deandemo", "root","admin#123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee")
		){
			while(rs.next()) {
				int id=rs.getInt("EMP_ID");
				String name=rs.getString("NAME");
				double sal=rs.getDouble("SALARY");
				int deptId=rs.getInt("DEPT_ID");
				Employee e=new Employee(id, name, sal, deptId);
				empList.add(e);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return empList;
	}

}
