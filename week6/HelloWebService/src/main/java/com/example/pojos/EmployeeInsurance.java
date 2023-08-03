package com.example.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
@Entity @Table(name="EMPLOYEEINSURANCE")
public class EmployeeInsurance {
	@Id @Column(name="EMP_ID")
	private int id;
	@Column(name="INS_TYPE")
	private String insType;
	private String premium;

}
