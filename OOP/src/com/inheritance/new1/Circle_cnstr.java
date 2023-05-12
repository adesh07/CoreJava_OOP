package com.inheritance.new1;

public class Circle_cnstr extends Shape_cnstr {

	private double carea;
	public static final double PI = 3.14;

	public Circle_cnstr() {
	}

	public Circle_cnstr(int radius) {
		this.carea = PI * radius * radius;
		System.out.println("Circle Area = " + carea);
	}

	public double area() {
		return carea;
	}
	
}
