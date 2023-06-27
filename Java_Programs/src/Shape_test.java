/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract class Shape
{
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape
{
    public int l;
    public int b;
    public double area()
    {
        return l*b;
    }
    public double perimeter()
    {
        return 2*(l+b);
    }
}
class Circle extends Shape
{
    public double r;
    public double area()
    {
        return 3.14*r*r;
    }
    public double perimeter()
    {
        return 2*3.14*r;
    }
}
public class Shape_test 
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        r.l=2;
        r.b=5;
        c.r=2.45;
        System.out.println("Area of rectangle = "+r.area());
        System.out.println("Perimeter of rectangle = "+r.perimeter());
        System.out.println("Area of circle = "+c.area());
        System.out.println("Perimeter of circle = "+c.perimeter());
    }
    
}
