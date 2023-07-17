package com.example.dao;

public class ConnectionFactory {
		private static ConnectionFactory instance=new ConnectionFactory();
			
		private ConnectionFactory() {
			
		}
		
		public static ConnectionFactory get(){
				return instance;
		}
		public EmployeeDao getConnection() {
				return new EmployeeBL();
		}

}
