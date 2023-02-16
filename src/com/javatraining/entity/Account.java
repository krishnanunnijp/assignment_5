package com.javatraining.entity;

public abstract class Account {

	private String accountCode;
	private String accountName;
	private String openingDate;
	private String expiryDate;
	
	public Account() {
			}
	public Account(String accountCode, String accountName, String openingDate, String expiryDate) {
		super();
		this.accountCode = accountCode;
		this.accountName = accountName;
		this.openingDate = openingDate;
		this.expiryDate = expiryDate;
	}

	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return ("          "+getAccountCode()+"        "+
				getAccountName()+"   "+getOpeningDate()+
				"   "+getExpiryDate());
	}

	
}
