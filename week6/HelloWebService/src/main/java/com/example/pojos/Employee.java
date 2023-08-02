package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity @Table(name="EMPLOYEE")
public class Employee {
		@Id @Column(name="EMP_ID")
		private int id;
		@Column(name="EMP_NAME")
		private String name;
		//@Column(name="SALARY")
		private double salary; // by default it is mapped with same name column
		@Column(name="DEPT_ID")
		private Integer deptId;
		
}
