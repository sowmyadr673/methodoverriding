package com.xworkz.methodoverriding;

public class PhonePay extends OnlinePayment {

	public void moneyTransfer() {
		super.moneyTransfer();
		System.out.println("payment through rupay");
	}

}
