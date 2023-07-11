package com.example.pojos;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
			public List<Employee> findAll() throws SQLException;
			public Employee findById(int id);

}
