import java.util.Scanner;
public class Exception1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.println("Enter two numbers you want to divide : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
		try
		{
            		int c=a/b;
            		System.out.println(a+" divided by "+b+" is "+c);
		}
		catch(ArithmeticException e)
        	{
            		System.out.println("Divide by zero exception! Please try again! \n");
        	}
            	System.out.println("Element at index 5 is "+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound! Please try again! \n");
        }
        System.out.println("Bye!!!!");
    }
}