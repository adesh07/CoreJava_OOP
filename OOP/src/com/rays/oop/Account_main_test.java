package com.rays.oop;

public class Account_main_test {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		ac.setNumber("701225479SBI");
		ac.setAccountType("Saving");
		ac.setBalance(7456.21);

		System.out.println("Account Number : "+ac.getNumber());
		System.out.println("Account Type : "+ac.getAccountType());
		System.out.println("Balance : "+ ac.getBalance());
	}
}
