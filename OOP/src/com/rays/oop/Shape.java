package com.rays.oop;

public class Shape {

	private String color = null; // private variable or attribute (private: can be used within this class only)
	private int borderWidth = 0;

	public void setColor(String color) { // public method or function
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
}