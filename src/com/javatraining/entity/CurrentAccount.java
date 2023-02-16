package com.javatraining.entity;

public abstract class  CurrentAccount extends Account {
	private double accountBalance;

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public CurrentAccount(String accountCode, String accountName, String openingDate, String expiryDate,
			double accountBalance) {
		super(accountCode, accountName, openingDate, expiryDate);
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return (super.toString()+"     "+getAccountBalance());
	}





	

}
