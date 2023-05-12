package com.rays.costructor;

public class Triangle extends Shape {

	private int height;
	private int base;

	public Triangle() {
		// System.out.println("Default Triangle Constructor");
	}

	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public float area() {
		float tarea = (height * base) / 2;
		System.out.println("Area of Triangle : " + tarea);
		return tarea;
	}
}
