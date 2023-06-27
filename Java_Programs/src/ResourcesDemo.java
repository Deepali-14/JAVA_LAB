import java.util.*;
import java.io.*;
public class ResourcesDemo 
{
    static FileInputStream f1;
    static Scanner sc;
    
    static void Divide() throws Exception
    {
        f1=new FileInputStream("E:/JAVA LAB/Test.txt");
        sc = new Scanner(f1);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        f1.close();
        sc.close();
    }
    public static void main(String args[])
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        int x=sc.nextInt();
        System.out.println(x);
    }
}
