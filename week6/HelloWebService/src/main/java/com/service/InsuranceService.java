package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EmployeeDao;
import com.example.dao.InsuranceDao;
import com.example.pojos.Employee;
import com.example.pojos.EmployeeInsurance;

@Service
public class InsuranceService {
	
	@Autowired
	private InsuranceDao dao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void addInsurance(EmployeeInsurance e) {
				dao.save(e);
	}

}
