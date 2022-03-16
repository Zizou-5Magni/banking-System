package com.safwat.mohammed;

public class Account {
	//Instance variables
	private int accountNumber;
	private int accountBalance;
	private String customerName;
	
	//constructor from superclass
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor using feilds
	public Account(int accountNumber, int accountBalance, String customerName) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerName = customerName;
	}

	//Account class fields getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//Method deposit
	public void deposit(int depositAmount) {
		accountBalance += depositAmount;
		//after deposit we must store deposit details in an object
		//of a transaction class and store that object in collection
		//such as linkedlist for future reference.
	}
	
	//method to withdraw from balance
	public void withdraw(int withdrawAmount) {
		if(withdrawAmount > accountBalance) {
			try {
				throw new InSufficientBalanceException();
			} catch (InSufficientBalanceException e) {
				e.printStackTrace();
			}
		}//end of if-statement
		accountBalance -= withdrawAmount;
		//after withdraw we must store deposit details in an object
		//of a transaction class and store that object in collection
		//such as linkedlist for future reference.
	}//end of method
	
	
	
	
	

}//end of class
