package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pojos.Employee;
import com.example.pojos.EmployeeInsurance;

@Repository
public interface InsuranceDao extends JpaRepository<EmployeeInsurance, Integer> {

}
