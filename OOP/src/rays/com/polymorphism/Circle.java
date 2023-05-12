package rays.com.polymorphism;

public class Circle extends Shape {

	private int radius;
	public final static float PI = 3.14F;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		double carea = PI * radius * radius;
		System.out.println("Circle area : " + carea);
		return carea;
	}
}
