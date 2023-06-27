abstract class Shape1
{
    abstract public void RectangleArea(int l, int b);
    abstract public void SquareArea(int s);
    abstract public void CircleArea(float r);
}

class Area extends Shape1
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
public class DemoArea 
{
    public static void main(String args[])
    {
        Area a=new Area();
        a.RectangleArea(2,3);
        a.SquareArea(4);
        a.CircleArea(2.3f);
    }
    
}
