package org.abc.bankApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.abc.bankApp.models.Account;

public class BankingBL implements BankingDao {
	
	private String jdbcURL;
	private String username;
	private String password;
	
	public BankingBL(String jdbcURL, String username, String password) {
		this.jdbcURL = jdbcURL;
		this.username = username;
		this.password = password;
	}

	private Connection getConnection() throws SQLException  {
		
		Connection con=DriverManager.getConnection(jdbcURL, username, password);
		return con;
		
	}
	
	@Override
	public Account findAccount(int accId) throws SQLException {
		Account acc=null;
		try(Connection con=getConnection()){
				/// to find account object and return
		}
		return acc;
	}

	@Override
	public boolean updateAccount(Account acc) {
		
		return false;
	}

}
