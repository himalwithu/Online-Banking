package com.onlinebanking.teamf.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.onlinebanking.teamf.model.AccountTable;
import com.onlinebanking.teamf.model.TransactionTable;
import com.onlinebanking.teamf.util.BankDbUtil;

public class DaoImpl implements Dao{
	
	public static final String ACCOUNT_CREATE_SQL= "insert into account_table (account_name, email,  account_number, mobile_number, address) values (?,?,?,?,?)"; 
    public static final String TRANSACTION_SQL= "insert into transation_table (deposit_amount, withdraw_amount, total_balance, deposit_date, account_id) values (?,?,?,?,?) ";
    public static final String TRANSACTION_UPDATE_SQL= "update  transation_table set deposit_amount=?, withdraw_amount=?, total_balance =?, deposit_date =?, where account_id = ?";
   
    

    @Override
	public int createAccount(AccountTable accountTable, TransactionTable transactionTable) {
		int inserted = 0;
		try(PreparedStatement ps =  BankDbUtil.getConnection().prepareStatement (ACCOUNT_CREATE_SQL);
				PreparedStatement ps2=BankDbUtil.getConnection().prepareStatement(TRANSACTION_SQL);){
		ps.setString(1, accountTable.getAccountName());
		ps.setString(2, accountTable.getEmail());
		ps.setString(3, accountTable.getAddress());
		ps.setLong(4, accountTable.getAccountNumber());
		ps.setLong(5, accountTable.getMobileNumber());
	    ps.executeUpdate();
		
	    ResultSet rs = ps.getGeneratedKeys();
		ps2.setDouble(1, transactionTable.getDepositAmount());
		ps2.setDouble(2, transactionTable.getWithdrawAmount());
		ps2.setDouble(3, transactionTable.getTotalBalance());
		ps2.setDate(4, new Date(transactionTable.getDepositDate().getTime()));
		ps2.setInt(5, rs.getInt(1));
		inserted = ps2.executeUpdate();
		
		}
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		
		return inserted;
    }
		
		@Override
		public int createAccount(TransactionTable transactionTable) {
			// TODO Auto-generated method stub
			int updated = 0;
			try(PreparedStatement ps2 = BankDbUtil.getConnection().prepareStatement(TRANSACTION_UPDATE_SQL);){
		
			ps2.setDouble(1, transactionTable.getDepositAmount());
			ps2.setDouble(2, transactionTable.getWithdrawAmount());
			ps2.setDouble(3, transactionTable.getTotalBalance());
			ps2.setDate(4, new Date(transactionTable.getDepositDate().getTime()));
			
			updated = ps2.executeUpdate();
			
			}
			
			catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
			}
			
			return updated;
	
		}
}
	
