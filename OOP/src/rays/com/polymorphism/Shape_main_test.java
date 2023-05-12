package rays.com.polymorphism;

public class Shape_main_test {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();

		Rectangle r = (Rectangle) s[0];
		r.setLength(10);
		r.setWidth(15);
		// r.area();

		Circle c = (Circle) s[1];
		c.setRadius(20);
		// c.area();

		Triangle t = (Triangle) s[2];
		t.setHeight(15);
		t.setBase(30);
		// t.area();

		double sum = 0;

		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i].area();
		}
		System.out.println("Total Area : " + sum);
	}
}