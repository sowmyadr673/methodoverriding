package com.xworkz.methodoverriding;

public class TestTV {

	public static void main(String[] args) {

		LcdTV lcd = new LcdTV();
		lcd.connection();

		SmartTV smarttv = new SmartTV();
		smarttv.connection();

		PortableTV portabletv = new PortableTV();
		portabletv.connection();
	}

}
