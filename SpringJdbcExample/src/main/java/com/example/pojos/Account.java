package com.example.pojos;

import lombok.Data;

@Data
public class Account {
	 private int id;
	 private double balance;
	 private double overDraftLimit;
	 private String custId;
	 private int typeId;

}
