package com.example;

public class Factory {
		
		public static EmployeeDao get() {
			return new EmployeeBL();
		}
		
		// but Design Factory class as Singleton class. 
//		public sEmployeeDao get() {
//			return new EmployeeBL();
//		}
}
