package com.rays.oop;

public class Shape1 {

	private String color = null;
	private int borderWidth = 0;

	public Shape1() {
		System.out.println("default constructor");
	}

	public Shape1(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
		System.out.println(color +"   "+ borderWidth);
		
	}

}
