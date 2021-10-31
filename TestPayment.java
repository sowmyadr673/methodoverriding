package com.xworkz.methodoverriding;

public class TestPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PhonePay phonepe = new PhonePay();
		phonepe.moneyTransfer();

		GooglePay googlepay = new GooglePay();
		googlepay.moneyTransfer();
	}

}
