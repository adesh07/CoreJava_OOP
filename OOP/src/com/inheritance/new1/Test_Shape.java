package com.inheritance.new1;

public class Test_Shape {

	public static void main(String[] args) {
		
		Shape s = new Shape();
		s.setBorderWidth(10);
		s.setColour("Red");
	    s.area();
		
		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setWidth(15);
		r.area();
		
		Circle c = new Circle();
		c.setRadius(10);
		c.area();
		
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(12);
		t.area();
		
	}
}
