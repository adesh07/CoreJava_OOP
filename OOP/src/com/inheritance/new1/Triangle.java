package com.inheritance.new1;

public class Triangle extends Shape {

	private int height;
	private int base;

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBase() {
		return base;
	}

	public double area() {
		double tarea = (base * height) / 2;
		System.out.println("Triangle Area = " + tarea);
		return tarea;
	}
}
