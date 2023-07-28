package org.abc.bankApp;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.abc.bankApp.service.BankingService;

public class Main {
	
		public static void main(String[] args) {
					Logger logger=Logger.getLogger("");
					try {
						Handler h=new FileHandler("D:\\BinaryDemo\\log\\bank.log");
						h.setFormatter(new SimpleFormatter());
						logger.addHandler(h);
					} catch (SecurityException | IOException e) {
						
						e.printStackTrace();
						logger.log(Level.SEVERE,"Error while adding handler:"+e.getMessage());
					}
			
					BankingService bs=new BankingService();
				
					int sourceAccount=2;
					int targetAccount=1;
					double amt=1;
				
						String m=bs.transfer(sourceAccount, targetAccount, amt);
					System.out.println(m);
					logger.log(Level.INFO, "Exiting from Main");
					
		}
}

