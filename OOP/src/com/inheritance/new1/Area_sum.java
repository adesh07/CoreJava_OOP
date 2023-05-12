package com.inheritance.new1;

public class Area_sum {

	public static void main(String[] args) {

		double totalarea = 0;
		
		Shape[] s = new Shape[3];

		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();

		Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		r.setWidth(15);
		//r.area();
		
		
		Circle c = (Circle) s[1];
		c.setRadius(10);
		//c.area();

		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(15);
		//t.area();

		for (int i = 0; i < s.length; i++) {

			totalarea = totalarea + s[i].area();
		}
		System.out.println("Total Area = " + totalarea);
	}
}
