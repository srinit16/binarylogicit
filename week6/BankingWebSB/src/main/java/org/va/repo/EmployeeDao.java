package org.va.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.va.pojos.Employee;

@Component
public class EmployeeDao {
	
	@Autowired
	private Employee emp1;
	
	@Autowired
	private Employee emp2;
	
	public Employee find() {
		emp1.setId(10);
		emp1.setName("Nitin");
		return emp1;
		
	}
	
	public Employee get() {
		emp2.setId(11);
		emp2.setName("Nick");
		return emp2;
		
	}

}
