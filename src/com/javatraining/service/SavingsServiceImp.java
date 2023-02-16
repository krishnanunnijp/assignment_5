package com.javatraining.service;
import java.util.List;

import com.javatraining.entity.Account;
import com.javatraining.entity.ActiveCurrentAccount;
import com.javatraining.entity.CurrentAccount;
import com.javatraining.entity.Customer;
import com.javatraining.entity.MaxAdvantageAccount;
import com.javatraining.entity.SavingsAccount;
import com.javatraining.entity.SavingsMaxAccount;
import com.javatraining.entity.WomenSavingsAccount;

public  class SavingsServiceImp implements AccountService {

	@Override
	public Account createAccount(int choice,String accountCode) {
		Account savingsAccount = null;
		if(choice == 2) {
			savingsAccount = new WomenSavingsAccount(accountCode);
			} else if(choice == 3) {
				savingsAccount = new SavingsMaxAccount(accountCode);
			} else if(choice == 5) {
				savingsAccount = new MaxAdvantageAccount(accountCode);
			} else if(choice == 4) {
				savingsAccount = new ActiveCurrentAccount(accountCode);
				}
		return savingsAccount;

	}

	@Override
	public void depositAmount(Account account,double amount) {
		// TODO Auto-generated method stub
		if(account.getAccountName()=="Women Savings Account" || account.getAccountName()=="Savings Max Account") {
		((SavingsAccount) account).setAccountBalance(((SavingsAccount) account).getAccountBalance()+amount);
		System.out.println(((SavingsAccount) account).getAccountBalance());
		}else if(account.getAccountName()=="Active Current Account" || account.getAccountName()=="Max Advantage Account") {
				((CurrentAccount) account).setAccountBalance(((CurrentAccount) account).getAccountBalance()+amount);
				System.out.println(((CurrentAccount) account).getAccountBalance());
			
		}
	}

	@Override
	public void withdrawAmount(Account account,double amount) {
		// TODO Auto-generated method stub
		if(account.getAccountName()=="Women Savings Account" || account.getAccountName()=="Savings Max Account") {
		if((((SavingsAccount) account).getAccountBalance()-amount)>0) {
		((SavingsAccount) account).setAccountBalance(((SavingsAccount) account).getAccountBalance()-amount);
		System.out.println(((SavingsAccount) account).getAccountBalance());
		}
		else {
			System.out.println("insufficient fund");
		}}else if(account.getAccountName()=="Active Current Account" || account.getAccountName()=="Max Advantage Account") {
			if((((CurrentAccount) account).getAccountBalance()-amount)>0) {
			((CurrentAccount) account).setAccountBalance(((CurrentAccount) account).getAccountBalance()-amount);
			System.out.println(((CurrentAccount) account).getAccountBalance());
			}
			else {
				System.out.println("insufficient fund");
			}
			
		}
	}
	@Override
	public Customer createCustomer(String customerCode,String customerName, List<Account> accounts ) {
		Customer customer = new Customer(customerCode,customerName,accounts);
		return customer;
	}

	public static Account searchWithAccountCode(List<Account> accounts, String key){ 
		Account account1=null;
	    for (Account account:accounts) {
	    	if (account.getAccountCode().equals(key)) {
	    		account1 = account;
	    	}
	    }
		return account1;
	}
	public static Account searchWithCustomerCode(List<Customer> customers, String key){ 
		Account account1=null;
	    for (Customer customer:customers) {
	    	if (searchWithAccountCode(customer.getAccounts(),key)!=null) {
	    		account1 = searchWithAccountCode(customer.getAccounts(),key);
	    		break;
	    	}
	    }
		return account1;
	}


		

}
