package rays.com.abstrct;

public class Circle {

	private int radius;
	public static float PI = 3.14F;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		float carea = PI * radius * radius;
		System.out.println("Area of Circle : " + carea);
		return carea;
	}

}
