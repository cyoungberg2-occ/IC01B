/**
 * @author Courtney.Youngberg
 * @version 09042019

 *
 */
public class Square {
	
	private double width;
	
	public Square() {
		width = 0;
	}
	
	public Square(double inputWidth) {
		width = inputWidth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		double area = width*width;
		return area;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", Area=" + getArea() + "]";
	}
		
}
