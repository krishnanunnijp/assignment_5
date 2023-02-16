package com.javatraining.entity;

public class SavingsMaxAccount extends SavingsAccount {

	public SavingsMaxAccount(String accountCode) {
		super(accountCode, "Savings Max Account", String.valueOf(java.time.LocalDate.now()), String.valueOf(java.time.LocalDate.now().plusYears(10)), 0);
	}

	@Override
	public String toString() {
		return 	(super.toString()+"        "+"nill");
	}





}
