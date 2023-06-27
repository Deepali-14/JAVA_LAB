public class Exception6 
{
    public static int meth1(int l, int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception("Either length or breadth or both are invalid");
        return l*b;
    }
    public static void meth2() throws Exception
    {
        System.out.println("Area of rectangle : "+meth1(-10,5));
    }
    public static void main(String args[])
    {
	try
	{
		meth2();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
    }
}
