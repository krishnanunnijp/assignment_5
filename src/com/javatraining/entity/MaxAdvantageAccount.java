package com.javatraining.entity;

public class MaxAdvantageAccount extends CurrentAccount {

	public MaxAdvantageAccount(String accountCode) {
		super(accountCode, "Max Advantage Account", String.valueOf(java.time.LocalDate.now()), String.valueOf(java.time.LocalDate.now().plusYears(10)), 0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return 	(super.toString()+"        "+"nill");
	}




}
