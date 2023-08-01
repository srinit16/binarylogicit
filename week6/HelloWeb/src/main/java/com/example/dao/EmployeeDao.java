package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pojos.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
