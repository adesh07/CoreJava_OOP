package com.rays.oop;

public class Shape_Main {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.setColor("red");

		System.out.println(s.getColor());
		
		s.setBorderWidth(150);
		
		System.out.println(s.getBorderWidth());
	}
}