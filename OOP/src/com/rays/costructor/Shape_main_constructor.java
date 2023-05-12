package com.rays.costructor;

public class Shape_main_constructor {

	public static void main(String[] args) {
		
	     Shape[] s = new Shape[3];
		
		s[0] = new Rectangle();
		s[1] = new Triangle();
		s[2] = new Circle();
		
		Rectangle rr = new Rectangle(10, 15);
		rr.area();
		
		Triangle t = new Triangle(12,20);
		t.area();
		
		Circle c = new Circle(10);
		c.area();
		
	}
}
