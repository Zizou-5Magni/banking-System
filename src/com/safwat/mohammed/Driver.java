package com.safwat.mohammed;
//Main class

public class Driver {
	public static void main(String[] args) {
		
		//Create  test objects
		Account acct1 = new Account(15, 2000, "Moe");
		acct1.deposit(1000);
		acct1.withdraw(300);

		Account acct2 = new Account(20, 1500, "Johnson");
		acct2.deposit(15000);
		acct2.deposit(1000);
		acct2.withdraw(1000);
		acct2.deposit(50);
		
		
		
		//print statement to display all actions above
		System.out.println("");
		//print statement to display all actions above. Use acctNumber above for 
		TransactionData.displayStatement(15);
		System.out.println("-----------------------");
		TransactionData.displayStatement(20);
		  
	}
}
