import java.util.Arrays;
import java.util.Scanner;
public class AnagramTest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1=sc.nextLine();
        System.out.print("Enter String 2 : ");
        String s2=sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("No the strings are not anagram");
            System.exit(0);
        }
        else
        {
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            char[] str1=s1.toCharArray();
            char[] str2=s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if(Arrays.equals(str1, str2))
                System.out.println("Yes the strings are anagram");
            else
                System.out.println("No the strings are not anagram");
        }
    }   
}
