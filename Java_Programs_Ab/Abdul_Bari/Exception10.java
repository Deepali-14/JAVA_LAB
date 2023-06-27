public class Exception10 {
    public static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
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
    public static void meth2() throws Exception
    {
        meth1();
    }
    public static void main(String args[]) throws Exception
    {
        meth2();
    }
}
