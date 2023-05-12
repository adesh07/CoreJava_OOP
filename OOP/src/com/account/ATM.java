package com.account;

public class ATM {

	private double balance;
	private double deposite;
	private double withdrawl;

	public void setBalace(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		System.out.println("Initial Balance = Rs." + balance + "/-");
		return balance;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}

	public double getDeposite() {
		balance = deposite + balance;
		System.out.println("Balance after Depositing  Rs." + deposite + "/- = " + balance);
		return deposite;
	}

	public void setWithdrwal(double withdrawl) {
		this.withdrawl = withdrawl;
	}

	public double getWithdrawl() {
		double amount = balance - withdrawl;
		if (amount >= 2000) {
			balance = balance - withdrawl;
			System.out.println("Remaining Balance = Rs." + balance + "/-");
		} else {
			System.out.println("Cannot withdraw Amount : " + withdrawl + "/-" + " (Insufficient Funds)");

		}
		return withdrawl;
	}

}
