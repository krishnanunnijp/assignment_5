package com.javatraining.service;
import java.util.List;

import com.javatraining.entity.Account;
import com.javatraining.entity.Customer;

public interface AccountService {
	public Account createAccount(int choice,String accountCode);
	public void depositAmount(Account savingsAccount,double amount);
	public void withdrawAmount(Account savingsAccount,double amount);
	Customer createCustomer(String customerCode, String customerName, List<Account> accounts);
}
