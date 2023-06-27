public class CatchTest 
{
    public static void main(String[] args) 
    {
        int m=5,n=0;
        try
        {
            System.out.println(m/n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
             System.out.println(e);
        }
    }
}
