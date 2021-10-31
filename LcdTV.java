package com.xworkz.methodoverriding;

public class LcdTV extends TV {

	String brand;
	int width;
	int resolution;
	int price;

	public void connection() {
		System.out.println("lcd tv is conncted through bluetooth");
	}

}
