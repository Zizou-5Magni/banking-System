package com.safwat.mohammed;
//Main class

public class Driver {
	public static void main(String[] args) {
		
		//Create  test objects
		Account acct1 = new Account(100, 20000, "Moe");
		
		Account acct2 = new Account(200, 15000, "Johnson");
		
		acct1.deposit(1000);
		acct1.deposit(450);
		acct1.deposit(500);
		acct1.withdraw(1500);
		acct1.withdraw(300);
		acct1.deposit(500);
		//print statement to display all actions above
		System.out.println("");
		//print statement to display all actions above. Use acctNumber above for 
		TransactionData.displayStatement(100);
		
	}
}
