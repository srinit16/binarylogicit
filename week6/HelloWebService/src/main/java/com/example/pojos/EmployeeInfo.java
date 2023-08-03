package com.example.pojos;


import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class EmployeeInfo {
	private int id;
	private String name;
	private double salary; 
	private Integer deptId;
	private String insType;
	private String premium;
}
