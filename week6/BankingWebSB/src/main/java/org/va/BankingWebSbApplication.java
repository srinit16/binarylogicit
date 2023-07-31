package org.va;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.SystemPropertyUtils;
import org.va.pojos.Employee;
import org.va.repo.EmployeeDao;

@SpringBootApplication
public class BankingWebSbApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BankingWebSbApplication.class, args);
		EmployeeDao dao1=(EmployeeDao) ctx.getBean(EmployeeDao.class);
		Employee e1=dao1.find();
		Employee e2=dao1.get();
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}
