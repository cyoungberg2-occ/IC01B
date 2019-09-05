/**
 * @author Courtney.Youngberg
 * @version 09042019
 *
 */

import java.lang.reflect.Array;

public class TestShapes {

	public static void main(String[] args) {
	Circle test = new Circle(4.2);
	System.out.print(test.toString());
	System.out.println();
	test.setRadius(65);
	test.getArea();
	System.out.print(test.toString());
	System.out.println();
	System.out.println();
		
	manyCirclez();
	
	Rectangle rectang = new Rectangle(5, 4);
	rectang.getArea();
	System.out.println(rectang.toString());
	rectang.setHeight(10);
	rectang.setWidth(12);
	rectang.getArea();
	System.out.println(rectang.toString());
	System.out.println();
	
	Square sqr = new Square(45);
	sqr.getArea();
	System.out.print(sqr.toString());
	System.out.println();
	sqr.setWidth(12);
	System.out.println(sqr.toString());
	System.out.println();
	
		}

	public static void manyCirclez() {
		Circle manyCirlces[] = new Circle[100];
		double area = 0;
		double sum = 0;
		double max = 0;
		double min = 10000;
		
		for(int i = 0; i<manyCirlces.length; i++) {
			Circle newInput = new Circle(Math.random()* (50 - 10) + 10);
			newInput.toString();
			manyCirlces[i] = newInput;
			
			area = newInput.getArea();
			sum += area;
				
			if(max < area) {
				max = area;
			}
			else if(min > area) {
				min = area;
			}
			
		}
		System.out.println("The sum of the 100 area cirlces is: " + sum);
		System.out.println("Tha maximum area is: " + max);
		System.out.println("The minimum area is " + min);
		System.out.println();
		
	}

}
