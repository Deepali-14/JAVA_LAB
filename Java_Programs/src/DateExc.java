class DateException extends Exception
{
    DateException(String s)
    {
        super(s);
    }
}
class Check
{
    public String str1, str2;
    void YearExceptionTest(String s) throws DateException
    {
        //Assuming current year 2022 input is considered the only valid year
        if(s.endsWith("2022"))
            System.out.println("Year is valid :)");
        else
            throw new DateException("Year is invalid");
    }
    void MonthExceptionTest(String s) throws DateException
    {
        int i=s.indexOf("/");
        int j=s.lastIndexOf("/");
        str1=s.substring(i+1,j);
        int k=Integer.parseInt(str1);
        if(s.charAt(5)!='/')
            throw new DateException("Month is Invalid");
        else if(k<1 || k>12)
            throw new DateException("Month is Invalid");
        else
            System.out.println("Month is valid :)");        
    }
    void DateExceptionTest(String s) throws DateException, Exception
    {
        int i=s.indexOf("/");
        str2=s.substring(0,i);
        int t=Integer.parseInt(str2);
        if(s.charAt(2)!='/')
            System.out.println("Date is Invalid");
        else if(t<1 || t>31)
            System.out.println("Date is Invalid");
        else
            System.out.println("Date is valid :)");
    }
}
public class DateExc 
{

    public static void main(String[] args) 
    {
        Check c=new Check();
        String s="12/11/2022";
        try
        {
            c.DateExceptionTest(s);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            c.MonthExceptionTest(s);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            c.YearExceptionTest(s);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}

