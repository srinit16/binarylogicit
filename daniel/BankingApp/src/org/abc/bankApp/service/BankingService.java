package org.abc.bankApp.service;

import java.sql.SQLException;

import org.abc.bankApp.dao.BankingDao;
import org.abc.bankApp.models.Account;

public class BankingService {
		private BankingDao dao;
		
		public BankingService() {
			dao=ConnectionFactory.get().getConnection();
		}
		
		public String transfer(int sourceAcc, int targetAcc, double amt) {
			String message="";
			try {
				Account acc1=dao.findAccount(sourceAcc);
				Account acc2=dao.findAccount(targetAcc);
				if((acc1.getBalance()+acc1.getOverdraftLimit()) >= amt) {
					acc1.setBalance(acc1.getBalance()-amt);
					// update overdraft limit balance well
					dao.updateAccount(acc1);
					acc2.setBalance(acc2.getBalance()+amt);
					dao.updateAccount(acc2);
					message="Success : Amount Transferred";
					dao.save();
				}else {
					message="Transaction Failed : Insufficient Money in Account Balance";
					
				}
				
			}catch(Exception se) {
				dao.rollback();
			//	se.printStackTrace();
				message="Transaction Failed Server Error: Pls check your account or contact bank";
			}
			
			return message;
			
		}

}
