package rays.com.abstrct;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public double area() {
		double rarea = length * width;
		System.out.println("Area of rectangle : "+rarea);
		return rarea;
	}
	
}
