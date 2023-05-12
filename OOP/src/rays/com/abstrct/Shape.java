package rays.com.abstrct;

public abstract class Shape {

	private String colour;
	private int borderwidth;
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setBorderWidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	public int getBorderWidth() {
		return borderwidth;
	}
	public abstract double area();
}
