package com.example.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.pojos.Employee;

public interface EmployeeDao {
			public List<Employee> findAll() throws HRException;
			public Employee findById(String id) throws HRException;

}
