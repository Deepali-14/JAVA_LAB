import java.util.Scanner;
abstract class Shape2
{
    abstract public void RectangleArea(int l, int b);
    abstract public void SquareArea(int s);
    abstract public void CircleArea(float r);
}

class Area1 extends Shape2
{
    public void RectangleArea(int l, int b)
    {
        System.out.println("Area of rectangle = "+l*b);
    }
    public void SquareArea(int s)
    {
        System.out.println("Area of square = "+s*s);
    }
    public void CircleArea(float r)
    {
        System.out.println("Area of circle = "+3.14*r*r);
    }
}
public class DemoAreaTest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Area a[]=new Area[5];
        System.out.println("----------DETAILS OF 4 RECTANGLES--------");
        for(int i=0; i<4; i++)
        {
            a[i]=new Area();
            System.out.print("Enter length and breadth of rectangle : ");
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[i].RectangleArea(x,y);
        }
         System.out.println("----------DETAILS OF 4 SQUARES--------");
        for(int i=0; i<4; i++)
        {
            a[i]=new Area();
            System.out.print("Enter side of square : ");
            int x=sc.nextInt();
            a[i].SquareArea(x);
        }
        System.out.println("----------DETAILS OF 4 CIRCLES--------");
        for(int i=0; i<5; i++)
        {
            a[i]=new Area();
            System.out.print("Enter radius of circle : ");
            float x=sc.nextFloat();
            a[i].CircleArea(x);
        }      
    }
    
}
