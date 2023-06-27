public class Exception5 
{
    public static int meth1(int l, int b) throws Exception
    {
        if(l<0 || b<0)
            throw new Exception();
        return l*b;
    }
    public static void meth2() throws Exception
    {
        System.out.println("Area of rectangle : "+meth1(-10,5));
    }
    public static void main(String args[]) throws Exception
    {
        meth2();
    }
}
