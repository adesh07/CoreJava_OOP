package com.rays.oop;

public class Automobile_main_test {

	public static void main(String[] args) {
		
		Automobile am = new Automobile();
		
		am.setColor("White");
		am.setSpeed(250);
		am.setCompany("Toyota");
		
		System.out.println("Color : "+am.getColor());
		System.out.println("Speed : "+am.getSpeed()+" km/hr");
		System.out.println("Company : "+am.getCompany());
	}
}
