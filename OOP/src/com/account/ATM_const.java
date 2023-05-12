package com.account;

public class ATM_const {

	public ATM_const() {
	}

	ATM_const(double balance, double deposite, double withdrawal) {

		System.out.println("Initial Balance = Rs." + balance + "/-");
		
        // to add the deposited amount 
		balance = balance + deposite;
		System.out.println("Balance after depositing : Rs." + deposite + "/- = Rs." + balance+ "/-");
		
        // to check if the remaining balance after withdrawal goes below 2000/- or not
		double amount = balance - withdrawal;
		
		if (amount >= 2000) {
			
			balance = balance - withdrawal;
			System.out.println("Balance after Withdrawing Rs." + withdrawal + "/- = " + balance+ "/-");
		} else {
			System.out.println("(Insufficient Funds) cannot withdraw amount : Rs." + withdrawal + "/-");
		}
		
	}
	
}
