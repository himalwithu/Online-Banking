package com.onlinebanking.teamf.controller;

import javax.swing.JOptionPane;
import java.util.Date;
import com.onlinebanking.teamf.model.AccountTable;
import com.onlinebanking.teamf.model.TransactionTable;
import com.onlinebanking.teamf.service.Service;
import com.onlinebanking.teamf.service.ServiceImpl;

public class Controller {
	
	public static void main(String[] args) {
		Service s = new ServiceImpl();
		String decision = "";
		
		do {
			String choice = JOptionPane.showInputDialog("Enter choice: create|update");
			
			switch (choice) {
			
			case "create":
				AccountTable accounttable = getAccountTable();
				
				int created = s.createAccount(accounttable);
				if (created >=1) {
					JOptionPane.showInternalMessageDialog(null,  "User infor is saved successfully in db.");
				}else {
					JOptionPane.showInternalMessageDialog(null,  "Error in db.");
				}
				
			break;	
				
			case "update":
			TransactionTable transactiontable = getTransactionTable();
			int updated = s.updateAccount(transactiontable);
			if(updated>=1) {
				JOptionPane.showInternalMessageDialog(null,  "User info is updated successfully in db.");
			}else {
				JOptionPane.showInternalMessageDialog(null,  "Error in db.");
			}
			break;
	
			default:
				JOptionPane.showInternalMessageDialog(null, "wrong choice");

			break;	
		}
		
		decision = JOptionPane.showInputDialog("do you want to perform next operation? Enter Yes|No" );
	   
        }while(decision.equalsIgnoreCase("yes"));
   
        JOptionPane.showInternalMessageDialog(null, "Bye Bye!! Happy Coding...See you.");
	
	}
	public static AccountTable getAccountTable() {
		AccountTable accounttable = new AccountTable();
		String accountName = JOptionPane.showInputDialog("Enter name: ");	
		String email = JOptionPane.showInputDialog("Enter email: ");
		long accountNumber= Long.parseLong(JOptionPane.showInputDialog("Enter account number:"));
		long mobileNumber=  Long.parseLong(JOptionPane.showInputDialog("Enter mobile number:"));
		
		accounttable.setAccountName(accountName);
		accounttable.setEmail(email);
		accounttable.setAccountNumber(accountNumber);
		accounttable.setMobileNumber(mobileNumber);
		return accounttable;
		
	}
	public static TransactionTable getTransactionTable() {
	    TransactionTable transactiontable = new TransactionTable();
		Double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount: "));	
		Double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter withdraw amount: "));
		Date transactionDate =  java.sql.Date.valueOf(JOptionPane.showInputDialog("Enter withdraw amount: "));
		
		transactiontable.setAccountName(depositAmount);
		transactiontable.setEmail(withdrawAmount);
		transactiontable.setTransactionDate(transactionDate);
		return transactiontable;
	
		
	}

}
