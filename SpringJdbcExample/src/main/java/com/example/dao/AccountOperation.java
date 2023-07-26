package com.example.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.pojos.Account;
import com.example.util.AccountMapper;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class AccountOperation implements AccountDao {
	
	private JdbcTemplate jt;
	
	public Account find(int id) {
		String query="SELECT * FROM account where acc_id=?";
		Account acc=jt.queryForObject(query, new Object[] {id},  new AccountMapper());
		return acc;
	}

	public boolean update(Account acc) {
	
		return false;
	}

}
