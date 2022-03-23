//This classes utilizes a collection to keep track of transactions
//Normally these objects used in collections must be stored in a database
//but this a simple project that captures the main simple points.
package com.safwat.mohammed;
import java.util.LinkedList;
import java.util.List;

public class TransactionData {
	//The objects in Account class in Deposit and withdraw methods will
	//be stored int this transactionList collection.
	public static List<Transaction> transactionList = new LinkedList<>();
	
	//To store objects into the collection use this method that takes a transaction object
	public static void addTransaction(Transaction transactionObj) {
		transactionList.add(transactionObj);
		
	}
	//Method to display statement using account number.
	public static void displayStatement(int acctNumber) {
		System.out.println("Statement for account number: " + acctNumber);
		System.out.println();
		
		//loop through list: when matched, display all details
		for(Transaction t: transactionList) {
			if(t.getAccountNumber() == acctNumber) {
				System.out.println("Transaction Number: "+ t.getTransactionNumber() + "\n" +
									"Transaction Type: "+ t.getTransactionType() + "\n" + 
									"Amount: " + t.getTransactionAmount() + "\n" + "Remaining Balance: " + t.getBalanceAfterTransaction() + "\n");
			}
		}
		
		
	}
}
