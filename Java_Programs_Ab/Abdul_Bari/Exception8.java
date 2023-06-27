public class Exception8 {
    public static void meth1()
    {
        try
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("GoodBye!!!");
        }
    }
    public static void meth2()
    {
        meth1();
    }
    public static void main(String args[])
    {
        meth2();
    }
}
