package com.rays.costructor;

public class Shape {
	
	private String colour;
	private int borderwidth;

	public Shape() {
	}

	public Shape(String colour, int borderwidth) {
		this.colour = colour;
		this.borderwidth = borderwidth;
	}

	public float area() {
		System.out.println("Shape area method");
		return 0;
	}
}
