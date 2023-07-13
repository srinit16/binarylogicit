package org.abc.bankApp;


import org.abc.bankApp.service.BankingService;

public class Main {
	
		public static void main(String[] args) {
			
					BankingService bs=new BankingService();
				
					int sourceAccount=2;
					int targetAccount=1;
					double amt=700;
				
						String m=bs.transfer(sourceAccount, targetAccount, amt);
					System.out.println(m);
					
					
		}
}
