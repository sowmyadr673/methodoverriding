package com.xworkz.methodoverriding;

public class SmartTV extends TV {

	String brand;
	int width;
	int resolution;
	int price;

	public void connection() {
		super.connection();
		System.out.println("smart tv is connected through wires");
	}

}
