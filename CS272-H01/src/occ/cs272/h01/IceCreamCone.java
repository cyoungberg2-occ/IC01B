/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author cyoungberg2
 * @version 08302019
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "Cyoungberg2";
    public static final String ASSIGNMENT = "H01-B";


    private double height;
    private double radius;

    public IceCreamCone()
    {
        height = 0;
        radius = 0;
    }

    public IceCreamCone(double heightInput, double radiusInput)
    {
        height = heightInput;
        radius = radiusInput;
    }

    public double getSurfaceArea()
    {
        return Math.PI*radius*Math.sqrt(Math.pow(radius, 2)+Math.pow(height, 2));
    }

    public double getVolume()
    {
        return Math.PI*Math.pow(radius, 2)*(height/3);
    }

    
}
