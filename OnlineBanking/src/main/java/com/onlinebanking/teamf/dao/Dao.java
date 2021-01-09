package com.onlinebanking.teamf.dao;

import com.onlinebanking.teamf.model.AccountTable;

import com.onlinebanking.teamf.model.TransactionTable;

public interface Dao {
	
	int createAccount(AccountTable accountTable, TransactionTable transactionTable);
	
	int createAccount(TransactionTable transactionTable);
}
