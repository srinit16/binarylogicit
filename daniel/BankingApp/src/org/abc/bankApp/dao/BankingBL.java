package org.abc.bankApp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	    try (Connection con=getConnection();
	         PreparedStatement st=con.prepareStatement("Select * from Account where ACC_ID = ?");)
	    {
	        st.setInt(1, accId);
	        ResultSet rs=st.executeQuery();
	        if(rs.next()) {
	            int id=rs.getInt("ACC_ID");
	            double bal=rs.getDouble("BALANCE");
	            int odl =rs.getInt("OVERDRAFT_LIMIT");
	            String cust=rs.getString("CUST_ID");
	            int type=rs.getInt("TYPE_ID");

	            acc=new Account();
	            acc.setId(id);
	            acc.setBalance(bal);
	            acc.setOverdraftLimit(odl);
	            acc.setCustId(cust);
	            acc.setAccType(type);
	        }

	    }
	    return acc;

	}

	@Override
	public boolean updateAccount(Account acc) throws SQLException {
				int n=0;
	    try (Connection con=getConnection();
	         PreparedStatement st=con.prepareStatement("update account set balance=? where ACC_ID = ?"))
	    {
	    	con.setAutoCommit(false);
	    	st.setDouble(1, acc.getBalance());
	    	st.setInt(2, acc.getId());
	    	n=st.executeUpdate();
	    }
	    if(n==1) {
	    	return true;
	    }else {
	    	return false;
	    }
		
	}

	@Override
	public void save() {
		
		 try (Connection con=getConnection()){
			 con.commit();
		 }catch(SQLException se) {
			 
		 }
	}
	@Override
	public void rollback() {
		
		 try (Connection con=getConnection()){
			 con.rollback();
		 }catch(SQLException se) {
			 
		 }
	}
	

}
