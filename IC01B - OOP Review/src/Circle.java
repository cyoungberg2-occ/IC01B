/**
 * 
 */

/**
 * @author Courtney.Youngberg
 * @version 09042019
 * 
 * B. Write and Test Simple Object-Oriented Programs:  note that the test program described below is not a unit-test; 
 * it simply exercises the classes that you create.
 * Create a Circle class that contains a radius field and a TestShapes program that creates and exercise a Circle object.
 * Your Circle class should have a constructor where you pass in the radius and a single accessor method that returns the radius
 * Your test program should create a few circles of different radix and then print the information about the circles. 
 * Give your Circle a getArea method that calculates its area (pir2), and a toString() method that returns both the radius + area
 * Add a test case that tries these capabilities out.
 * Add a test case that creates an array of 100 circles, each with a random radius.
 * Print out the sum of the areas of the circles. Also print the biggest and smallest areas. 
 * Create a Rectangle class that contains width and height fields. 
 * Also give it a getArea method. Add some tests to the TestShapes program.
 *Create a Square class with width and getArea. 
 *Then, give both Square and Circle setArea methods that let you specify a desired area. 
 *Make a few more test cases.

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
