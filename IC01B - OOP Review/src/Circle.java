/**
 * @author Courtney.Youngberg
 * @version 09042019

 *
 */
public class Circle {

	private double radius;

	public Circle() {
		radius = 0;
	}
	
	public Circle(double radiusInput) {
		radius = radiusInput;
		}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = Math.PI*(Math.pow(radius, 2));
		return area;							
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + "]";
	}

	
}
