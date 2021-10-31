package com.xworkz.methodoverriding;

public class PortableTV extends TV {

	public void connection() {
		super.connection();
		System.out.println("portable tv is connected through wifi");
	}
}
