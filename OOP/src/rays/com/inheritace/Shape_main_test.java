package rays.com.inheritace;

public class Shape_main_test {

	public static void main(String[] args) {

		Shape s = new Shape();

		// s.setColour("Blue");
		// System.out.println(s.getColour());

		Rectangle r = new Rectangle();

		r.setLength(10);
		r.setWidth(20);
		r.setColour("Green");
		System.out.println("Rectangle color : " + r.getColour());
		r.area();

		Circle c = new Circle();

		c.setRadius(10);
		c.area();

		Triangle t = new Triangle();

		t.setBase(10);
		t.setHeight(20);
		t.area();

		Shape s1 = new Rectangle();
		Rectangle r1 = (Rectangle) s1; // type casting

		r1.area(); // fetch area() from Shape class but, executes area() from Rectangle
		r1.setLength(5);
		r1.setWidth(5);
		r1.area();

	}

}
