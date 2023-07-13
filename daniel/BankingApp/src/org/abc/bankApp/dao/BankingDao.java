package org.abc.bankApp.dao;

import java.sql.SQLException;

import org.abc.bankApp.models.Account;

public interface BankingDao {
			public Account findAccount(int accId) throws SQLException;  // CustomException BankingException
			public boolean updateAccount(Account acc) throws SQLException;  // CustomException BankingException
			public void save();
			public void rollback();
}
