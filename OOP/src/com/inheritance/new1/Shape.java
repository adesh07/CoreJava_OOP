package com.inheritance.new1;

public class Shape {

	private int borderWidth;
	private String colour;
	
	public void setColour(String col) {
		colour = col;
	}
	public String getColour() {
		return colour;
	}
	
	public void setBorderWidth(int bw) {
		borderWidth = bw;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public double area() {
		System.out.println("Shape area method");
		return 0;
	}
}
