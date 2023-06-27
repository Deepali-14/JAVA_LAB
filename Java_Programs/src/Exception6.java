class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "The Dimensions are wrong. Please Try again!";
    }
}
public class Exception6 
{
    public static int meth1(int l, int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    public static void meth2() throws NegativeDimensionException
    {
        System.out.println("Area of rectangle : "+meth1(-10,5));
    }
    public static void main(String args[]) 
    {
        try
        {
            meth2();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}