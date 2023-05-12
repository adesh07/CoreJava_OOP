package com.inheritance.new1;

public class Rectangle_cnstr extends Shape_cnstr {

	private double rarea;

	public Rectangle_cnstr() {
	}

	public Rectangle_cnstr(int length, int width) {

		this.rarea = length * width;
		System.out.println("Rectangle area = " + rarea);
	}

	public double area() {
		return rarea;
	}
}
