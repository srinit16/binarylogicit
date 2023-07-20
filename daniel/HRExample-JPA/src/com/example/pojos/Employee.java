package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;


@Entity @Table(name="EMPLOYEE")

@NamedQuery(name="Employee.findAll", query="select e from Employee e")
	
public class Employee {
		@Id @Column(name="EMP_ID")
		private int id;
		@Column(name="EMP_NAME")
		private String name;
		@Column(name="SALARY")
		private double salary;
		@Column(name="DEPT_ID")
		private int deptId;
		
		
		public Employee(int id, String name, double salary, int deptId) {
		
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.deptId = deptId;
		}
		
		// default constructor
		public Employee() {
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		
		public void print() {
			System.out.println("************************");
			System.out.println("ID : "+this.id);
			System.out.println("NAME : "+this.name);
			System.out.println("SALARY : "+this.salary);
			System.out.println("DEPT ID : "+this.deptId);
		}
		
}
