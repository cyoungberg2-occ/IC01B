
public class Rectangle {
	
	private double height;
	private double width;
	
	public Rectangle() 
	{
		height = 0;
		width = 0;
	}
	
	public Rectangle(double inputHeight, double inputWidth)
	{
		height = inputHeight;
		width = inputWidth;	
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		double area = width * height;
		return area;	
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", area=" + getArea() + "]";
	}

	
	
	

}
