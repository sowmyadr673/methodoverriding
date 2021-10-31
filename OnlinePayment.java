package com.xworkz.methodoverriding;

public class OnlinePayment {

	String accountno;
	String accountholdername;
	String bankname;
	int amount;

	public OnlinePayment() {
		System.out.println("start online payment");
	}

	public void moneyTransfer() {
		System.out.println("money transfer successful");
	}
}
