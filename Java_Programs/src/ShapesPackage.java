import java.util.Scanner;
import Shapes.*;


class ShapesPackage
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        packageShapes p=new packageShapes();
        System.out.println("Enter The Radius Of Circle: ");
        float r = scan.nextFloat();
        p.message();
        System.out.println(p.Area(r));
    }
}