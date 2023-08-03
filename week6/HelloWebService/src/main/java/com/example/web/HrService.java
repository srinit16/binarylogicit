package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.pojos.Employee;
import com.example.pojos.EmployeeInfo;
import com.example.pojos.EmployeeInsurance;
import com.service.EmployeeService;
import com.service.InsuranceService;
import com.service.Message;

@Service
public class HrService {
	@Autowired
	private EmployeeService esrv;
	@Autowired
	private InsuranceService insv;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Message RegisterEmployee(EmployeeInfo eif) {
		Message m=new Message();
			Employee e=new Employee();
				e.setId(eif.getId());
				e.setName(eif.getName());
				e.setSalary(eif.getSalary());
				e.setDeptId(eif.getDeptId());
			esrv.addEmployee(e);
			EmployeeInsurance eis=new EmployeeInsurance();
				eis.setId(1);
				eis.setInsType(eif.getInsType());
				eis.setPremium(eif.getPremium());
			insv.addInsurance(eis);
			
		m.setInfo("Employee Registered Successfully");
		return m;

	}
		

}
