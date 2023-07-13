package org.abc.bankApp.service;

import org.abc.bankApp.dao.BankingBL;
import org.abc.bankApp.dao.BankingDao;

public class ConnectionFactory {
		private static ConnectionFactory instance=new ConnectionFactory();
			
		private ConnectionFactory() {
			
		}
		
		public static ConnectionFactory get(){
				return instance;
		}
		public BankingDao getConnection() {
				return new BankingBL("jdbc:mysql://localhost:3306/bankingdb", "root", "admin#123");
		}

}
