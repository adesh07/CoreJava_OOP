package com.rays.costructor;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public float area() {
		float rarea = length * width;
		System.out.println("Area of Rectangle : " + rarea);
		return rarea;
	}
}
