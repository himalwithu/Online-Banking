package com.onlinebanking.teamf.service;

import com.onlinebanking.teamf.model.AccountTable;
import com.onlinebanking.teamf.model.TransactionTable;

public interface Service {

	int insertData(AccountTable account, TransactionTable transaction);

	int createAccount(AccountTable accounttable);
	int updateAccount(TransactionTable transactiontable);
}
