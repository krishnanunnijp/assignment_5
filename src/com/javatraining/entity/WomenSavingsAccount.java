package com.javatraining.entity;

public class WomenSavingsAccount extends SavingsAccount  {
	private int freeLimit;


	public WomenSavingsAccount(String accountCode) {
		super(accountCode, "Women Savings Account", String.valueOf(java.time.LocalDate.now()), String.valueOf(java.time.LocalDate.now().plusYears(10)), 0);
		this.freeLimit = 3;

	}


	public int getFreeLimit() {
		return freeLimit;
	}


	public void setFreeLimit(int freeLimit) {
		this.freeLimit = freeLimit;
	}


	@Override
	public String toString() {
		return 	(super.toString()+"        "+freeLimit);
	}





}
