package com.onlinebanking.teamf.model;

import java.util.Date;

public class TransactionTable {
	
	private int id;
	private double depositAmount;
	private double withdrawAmount;
	private double totalBalance;
	private Date transactionDate;
	private int accountId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public void setAccountName(Double depositAmount2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Double withdrawAmount2) {
		// TODO Auto-generated method stub
		
	}
	public Date getDepositDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
}