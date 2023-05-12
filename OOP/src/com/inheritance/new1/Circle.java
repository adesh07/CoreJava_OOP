package com.inheritance.new1;

public class Circle extends Shape{

	private int radius;
	public static final double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		double carea = PI * radius * radius;
		System.out.println("Circle Area = " + carea);
		return carea;
	}
}
