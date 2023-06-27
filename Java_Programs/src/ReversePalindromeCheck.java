import java.util.Scanner;
public class ReversePalindromeCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        System.out.println("Reverse of "+s+" is "+s1);
        if(s.equals(s1))
            System.out.println("The String is a palindrome");
        else
            System.out.println("The String is not a palindrome");
    }
    
}
