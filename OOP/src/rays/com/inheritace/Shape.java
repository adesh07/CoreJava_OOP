package rays.com.inheritace;

public class Shape {

	private String colour = null;
	private int borderWidth = 0;

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

	public void area() {
		System.out.println("Shape area method");
	}
}
