package com.example.pojos;



import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Employee {
		private String name;
		
		public void createError() {
				throw new RuntimeException();
		}

}
