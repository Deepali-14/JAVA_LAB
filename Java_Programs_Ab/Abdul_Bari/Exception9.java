public class Exception9 {
    public static void meth1()
    {
        try
        {
            System.out.println(10/0);
        }
	catch(Exception e)
	{
		System.out.println(e);
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
