import java.util.Scanner;
public class StringFunctionTest 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        System.out.println("String in lower case is "+str.toLowerCase());
        System.out.println("String in lower case is "+str);
        String sr = new String("Deepali Singh");
        System.out.println("String in lower case is "+sr.toLowerCase());
        System.out.println("String in lower case is "+sr);
        String s="Deepali Singh";
        System.out.println("Length of string is "+s.length());
        System.out.println("String in lower case is "+s.toLowerCase());
        System.out.println("String in upper case is "+s.toUpperCase());
        String s1=" Deepali Singh";
        if(s1.equals(s))
            System.out.println("String "+s+" and String "+s1+" are equal");
        else
            System.out.println("String "+s+" and String "+s1+" are not equal");
        System.out.println("String before trimming : "+s1);
        s1=s1.trim();
        System.out.println("String after trimming : "+s1);
        if(s1.equals(s))
            System.out.println("String "+s+" and String "+s1+" are equal");
        else
            System.out.println("String "+s+" and String "+s1+" are not equal");
        if(s1.endsWith("singh"))
            System.out.println("String ends with Singh");
        else
            System.out.println("String does not end with Singh");
        System.out.println("Last name is "+s.substring(8,13));
        String r=" Rathore";
        System.out.println("Full name is "+s.concat(r));
        
    }
    
}
