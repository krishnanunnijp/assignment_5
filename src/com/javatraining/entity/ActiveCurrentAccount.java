package com.javatraining.entity;

public class ActiveCurrentAccount extends CurrentAccount {

	public ActiveCurrentAccount(String accountCode) {
		super(accountCode, "Active Current Account", String.valueOf(java.time.LocalDate.now()), String.valueOf(java.time.LocalDate.now().plusYears(10)), 0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return 	(super.toString()+"        "+"nill");
	}



}
