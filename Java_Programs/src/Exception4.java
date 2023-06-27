public class Exception4 
{
    static void meth1()
    {
        System.out.println(10/0);
    }
    static void meth2()
    {
        meth1();
    }
    static void meth3()
    {
        meth2();
    }
    public static void main(String args[])
    {
        try
        {
            meth3();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
