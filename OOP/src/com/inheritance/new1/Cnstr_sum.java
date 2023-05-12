package com.inheritance.new1;

public class Cnstr_sum {

	public static void main(String[] args) {

//		Shape_cnstr sct = new Shape_cnstr();
//		
//		Rectangle_cnstr rc = new Rectangle_cnstr(10, 10);
//		
//		Triangle_cnstr tc = new Triangle_cnstr(15, 10);
//		
//		Circle_cnstr cc = new Circle_cnstr(10);

		Shape_cnstr[] sh = new Shape_cnstr[3];

		sh[0] = new Rectangle_cnstr(11, 11);
		sh[1] = new Triangle_cnstr(14, 12);
		sh[2] = new Circle_cnstr(11);

		double totalarea = 0;
		for (int i = 0; i < sh.length; i++) {
			totalarea = totalarea + sh[i].area();
			
		}
		System.out.println("Total area = " + totalarea);
	}
}
