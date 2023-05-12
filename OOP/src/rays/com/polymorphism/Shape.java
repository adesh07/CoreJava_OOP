package rays.com.polymorphism;

public class Shape {

	private String colour;
	private int borderWidth;

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public double area() {
		System.out.println("Shape area method");
		return 0;
	}

}
