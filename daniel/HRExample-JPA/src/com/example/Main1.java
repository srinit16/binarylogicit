package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.example.pojos.Employee;

public class Main1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
										.configure("com/example/config/hibernate.cfg.xml")
										.buildSessionFactory();
		Session s=sessionFactory.openSession();
		
	//	Employee e=s.get(Employee.class, 1); // select emp_id, emp_name, salary, dept_id from employee where emp__id=1
		//Employee e=s.load(Employee.class, 1);
		
		//Employee emp=new Employee(6,"Peter",1200.00,102);
//		Employee emp=s.get(Employee.class, 5); 
//		if(emp!=null) {
//			//emp.setSalary(emp.getSalary()*1.10);
//			try {
//				s.getTransaction().begin();
//				//	s.save(emp);
//					//s.saveOrUpdate(emp);
//				s.remove(emp);
//				s.getTransaction().commit();
//				System.out.println("Record deleted");
//			}catch(Exception ex) {
//				s.getTransaction().rollback();
//				ex.printStackTrace();
//			}
//		//	emp.print();
//		}
		
//			// HQL for custom queries
//			Query<Employee> q=s.createQuery("select e from Employee e where e.deptId=:did", Employee.class);
//			q.setParameter("did", 101);
//			List<Employee> l=q.getResultList();
//			l.forEach(e-> e.print());
		
		Query<Employee> q=s.createNamedQuery("Employee.findAll", Employee.class);
		List<Employee> l=q.getResultList();
		l.forEach(e-> e.print());
		
	}

}
