package com.example.dao;

import javax.sql.DataSource;

import com.example.pojos.Account;

public interface AccountDao {
		Account find(int id);  // all methods of interfaces are public by default
		boolean update(Account acc);
		//more data logic operation
		boolean create(Account acc);

}
