/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Isprime {

    /**
     * @param args the command line arguments
     */
    static boolean check_prime(int x)
    {
        for(int i=2; i<=x/2; i++) 
            if(x%i==0)
                return false;
        return true;
           
    }
    
    int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number to check if it is prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(check_prime(n));
        int m=sc.nextInt();
        Isprime p = new Isprime();
        int res = p.gcd(n,m);
        System.out.println("Gcd of "+n+" and "+m+" is "+res);
    }
    
}
