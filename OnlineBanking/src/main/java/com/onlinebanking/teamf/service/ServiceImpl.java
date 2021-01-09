package com.onlinebanking.teamf.service;

import com.onlinebanking.teamf.dao.Dao;
import com.onlinebanking.teamf.dao.DaoImpl;
import com.onlinebanking.teamf.model.AccountTable;
import com.onlinebanking.teamf.model.TransactionTable;

public class ServiceImpl implements Service {

	Dao userDao = new DaoImpl();
	
	@Override
	public int insertData(AccountTable account, TransactionTable transaction) {
		// TODO Auto-generated method stub
		return userDao.createAccount(account, transaction);
	}

	
	
	//Can someone write a logic for total balance. For example: 
	//when deposit is done: total balance = tatal balance +deposit amount
	//When withdrawn is done: total balance = total balnce - withdrwn amount.
	

	
	
	
	@Override
	public int createAccount(AccountTable accounttable) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAccount(TransactionTable transactiontable) {
		// TODO Auto-generated method stub
		return 0;
	}
}
