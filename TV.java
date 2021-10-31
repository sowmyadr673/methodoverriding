package com.xworkz.methodoverriding;

public class TV {

	String brand;
	int width;
	int resolution;
	int price;

	public TV() {
		System.out.println("inside tv");
	}

	public void connection() {
		System.out.println("tv is connected");
	}
}
