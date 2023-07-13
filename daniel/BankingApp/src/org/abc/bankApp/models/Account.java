package org.abc.bankApp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter  @ToString
public class Account  {
		private int id;
		private double balance;
		private double overdraftLimit;
		private String custId;
		private int accType;
		public Account(int id, double balance, double overdraftLimit, String custId, int accType) {
			this.id = id;
			this.balance = balance;
			this.overdraftLimit = overdraftLimit;
			this.custId = custId;
			this.accType = accType;
		}
		public Account() {
		
		}
		
}
