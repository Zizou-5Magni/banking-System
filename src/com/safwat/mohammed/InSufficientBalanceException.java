package com.safwat.mohammed;

public class InSufficientBalanceException extends Exception {
		//override object class
	public String toString() {
		return "Balance not sufficient ";
	}
}
