package com.example.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.pojos.Account;

public class AccountMapper implements RowMapper<Account> {

	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account acc=new Account();
		acc.setId(rs.getInt("ACC_ID"));
		acc.setBalance(rs.getDouble("BALANCE"));
		acc.setCustId(rs.getString("CUST_ID"));
		acc.setOverDraftLimit(rs.getDouble("OVERDRAFT_LIMIT"));
		acc.setTypeId(rs.getInt("TYPE_ID"));
		return acc;
	}
	

}
