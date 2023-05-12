package rays.com.inheritace;

public class Circle extends Shape {

	private int radius;
	public static double PI = 3.14;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void area() {
		double carea = PI * radius * radius;
		System.out.println("Area of Circle = " + carea);
	}
}
