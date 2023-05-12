package com.rays.costructor;

public class Circle extends Shape{

	private int radius;
	public static float PI = 3.14F;

	public Circle() {
		//System.out.println("Default Circle Constructor");
	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public float area() {
		float carea = PI * radius * radius;
		System.out.println("Area of Circle : "+ carea);
		return carea;
	}
}
