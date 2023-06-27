/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
class Cylinder_prop
{
    public double radius;
    public double height;
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class Cylinder {
    public static void main(String args[])
    {
        Cylinder_prop c = new Cylinder_prop();
        c.radius=2.5;
        c.height=2.3;
        System.out.println("Lid Area of Cylinder = "+c.lidArea());
        System.out.println("Total Surface Area of Cylinder = "+c.totalSurfaceArea());
        System.out.println("Volume of Cylinder = "+c.volume());
        System.out.println("Circumference of Cylinder = "+c.circumference());
        System.out.printf("Circumference of Cylinder = %2.2f",c.circumference());
        System.out.println();
    }
}
