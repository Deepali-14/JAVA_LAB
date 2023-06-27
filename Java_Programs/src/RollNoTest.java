import java.util.Scanner;
public class RollNoTest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in the format(JP-2015-8976) : ");
        String s = sc.next();
        String s1=s.substring(0,2);
        String s2=s.substring(3,7);
        String s3=s.substring(8,12);
        System.out.println(s1+" is Jaipur, "+s2+" is Year and "+s3+" is Rollno");
    }   
}
