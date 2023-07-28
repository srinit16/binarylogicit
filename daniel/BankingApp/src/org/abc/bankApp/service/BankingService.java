package org.abc.bankApp.service;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.abc.bankApp.dao.BankingDao;
import org.abc.bankApp.models.Account;

public class BankingService {
		private BankingDao dao;
		private Logger logger;
		
		public BankingService() {
			dao=ConnectionFactory.get().getConnection();
			logger=Logger.getLogger("BankingService");
		}
		
		public String transfer(int sourceAcc, int targetAcc, double amt) {
			String message="";
			try {
				logger.log(Level.INFO, "Begining of transfer");
				Account acc1=dao.findAccount(sourceAcc);
				Account acc2=dao.findAccount(targetAcc);
				if((acc1.getBalance()+acc1.getOverdraftLimit()) >= amt) {
					logger.log(Level.INFO, "Successfully verified account");
					acc1.setBalance(acc1.getBalance()-amt);
					// update overdraft limit balance well
					dao.updateAccount(acc1);
					acc2.setBalance(acc2.getBalance()+amt);
					dao.updateAccount(acc2);
					message="Success : Amount Transferred";
					dao.save();
				}else {
					message="Transaction Failed : Insufficient Money in Account Balance";
					logger.log(Level.INFO, "Insufficient Balance");
					
				}
				
			}catch(Exception se) {
				dao.rollback();
			//	se.printStackTrace();
			
				message="Transaction Failed Server Error: Pls check your account or contact bank";
				logger.log(Level.WARNING, se.getMessage());
			}
			logger.log(Level.INFO, "Exiting from  tranfer");
			return message;
			
		}

}
