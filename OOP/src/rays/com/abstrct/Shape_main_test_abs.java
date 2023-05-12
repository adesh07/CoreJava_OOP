package rays.com.abstrct;

public class Shape_main_test_abs {

	public static void main(String[] args) {
		
		//Shape s = new Shape();
		
		Rectangle rr = new Rectangle();
		
		rr.setLength(10);
		rr.setWidth(20);
		rr.area();
		
		Circle c  =  new Circle();
		c.setRadius(15);
		c.area();
		
		Triangle t = new Triangle();
		t.setBase(25);
		t.setHeight(15);
		t.area();
	}
}
