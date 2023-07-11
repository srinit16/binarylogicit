package com.example.pojos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class Main {
			public static void main(String[] args) {
				String jdbcURL ="jdbc:mysql://localhost:3306/practiceDB";
				try{
					Connection con=DriverManager.getConnection(jdbcURL, "root", "admin#123");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from employee");
					List<Employee> empList=new ArrayList<>();
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
					
				//	empList.forEach(Employee::print);
				//	empList.forEach(e-> e.print());
					
					for(Employee e:empList) {
						e.print();
					}
					
				}catch(SQLException se) {
					System.out.println(se.toString());
					//se.printStackTrace();
					
				}

			}
}
