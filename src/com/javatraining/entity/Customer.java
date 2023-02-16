package com.javatraining.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
private String customerCode;
private String customerName;
private List<Account> accounts= new ArrayList<Account>();

public Customer(String customerCode, String customerName, List<Account> accounts) {
	this.customerCode = customerCode;
	this.customerName = customerName;
	this.accounts = accounts;
}
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public List<Account> getAccounts() {
	return accounts;
}


}
