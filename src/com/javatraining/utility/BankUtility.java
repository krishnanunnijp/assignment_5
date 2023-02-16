package com.javatraining.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javatraining.entity.Account;
import com.javatraining.entity.CurrentAccount;
import com.javatraining.entity.Customer;
import com.javatraining.entity.SavingsAccount;
import com.javatraining.service.SavingsServiceImp;

public class BankUtility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice,option,i;
        String accountCode="",customerCode = null,customerName = null;
        double amount;
        List<Customer> customers= new ArrayList<Customer>();
        SavingsServiceImp savingsAccountImpl=new SavingsServiceImp();
        do {


                System.out.println("************Welcome to ABC Bank************\r\n"
                        + "1.Create Account\r\n"
                        + "2.Deposit Amount\r\n"
                        + "3.Withdraw Amount\r\n"
                        + "4.Display Accounts\r\n"
                        + "5.Exit");
                choice = scanner.nextInt();
                switch(choice) {
                    case 1:
                        List<Account> accounts= new ArrayList<Account>();
                        System.out.println("1.New user 2.existing");
                        int  choice1 = scanner.nextInt();
                        if (choice1==1) {
                            System.out.println("Enter the customer code");
                            customerCode=scanner.next();
                            System.out.println("Enter the customer name");
                            customerName=scanner.next();
                        }
                        System.out.println("1.Savings Account 2.current Account");
                        option = scanner.nextInt();
                        if(option==1) {
                            System.out.println("1.Women Savings Account 2. Savings Max Account");
                            option = option+ scanner.nextInt();
                            System.out.println("Enter the account code");
                            accountCode=scanner.next();
                            accounts.add((SavingsAccount) savingsAccountImpl.createAccount(option,accountCode));
        					if(choice1==1) {
        						customers.add( savingsAccountImpl.createCustomer(customerCode,customerName,accounts));
        					}
                            System.out.println( ((SavingsAccount) SavingsServiceImp.searchWithCustomerCode(customers, accountCode)).getAccountBalance());
                            System.out.println(SavingsServiceImp.searchWithAccountCode(accounts, accountCode));}
                        else {
                            System.out.println("1.Active Current Account 2. Max Advantage Account");
                            option = option+ scanner.nextInt()+1;
                            System.out.println("Enter the account code");
                            accountCode=scanner.next();
                            accounts.add( savingsAccountImpl.createAccount(option,accountCode));
                            if(choice1==1) {
        						customers.add( savingsAccountImpl.createCustomer(customerCode,customerName,accounts));
        					}
                            System.out.println( ((CurrentAccount) SavingsServiceImp.searchWithCustomerCode(customers, accountCode)).getAccountBalance());
                            System.out.println(SavingsServiceImp.searchWithAccountCode(accounts, accountCode));}
                        break;
                    case 2:
                        System.out.println("Enter the account code");
                        accountCode=scanner.next();
                        if(SavingsServiceImp.searchWithCustomerCode(customers, accountCode)!=null) {
                            System.out.println("Enter the amount to be deposit");
                            amount=scanner.nextDouble();
                            savingsAccountImpl.depositAmount(SavingsServiceImp.searchWithCustomerCode(customers, accountCode), amount);}
                        else {
                            System.out.println("invalid account number");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the account code");
                        accountCode=scanner.next();
                        if(SavingsServiceImp.searchWithCustomerCode(customers, accountCode)!=null) {
                            System.out.println("Enter the amount to be withdraw");
                            amount=scanner.nextDouble();
                            savingsAccountImpl.withdrawAmount(SavingsServiceImp.searchWithCustomerCode(customers, accountCode), amount);}
                        else {
                            System.out.println("invalid account number");
                        }
                        break;

                    case 4:

                        System.out.println("SINo  CustomerName     AccountCode          AccountType         CreateDate     ExpiryDate   Balance  FreeLimit\r\n"
                                + "-----------------------------------------------------------------------------------------------------------------------");
                    	for(Customer customer:customers) {
                        accounts=customer.getAccounts();
                        i=0;
                        for(Account account:accounts)
                        {
                            i=i+1;
                            System.out.println(i+"        "+customer.getCustomerName()+account);
                        }}
                        
                        break;
                    default : System.out.println("Invalid choice");
                }

        }while(choice!=5);
        scanner.close();
    }
}
