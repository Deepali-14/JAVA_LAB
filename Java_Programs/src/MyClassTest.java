interface A
{
    public void math1();
    public void math2();
}
class MyClass implements A
{
    public void math1()
    {
        System.out.println("This is method 1");
    }
    public void math2()
    {
        System.out.println("This is method 2");
    }
}
public class MyClassTest 
{
    public static void main(String args[])
    {
        MyClass m=new MyClass();
        m.math1();
        m.math2();
    }
}
