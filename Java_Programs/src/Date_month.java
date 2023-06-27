/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
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
public class Date_month{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter date (dd/mm/yyyy)");
        String str = sc.nextLine();
        int i=str.indexOf("/");
        System.out.println(i);
        int j=str.lastIndexOf("/");
        System.out.println(j);
        int a = str.charAt(0);
        System.out.println(a);
        int b = str.charAt(1);
        System.out.println(b);
        int c = str.charAt(i+1);
        System.out.println(c);
        int d = str.charAt(i+2);
        System.out.println(d);
        
        if(c==48 && j==5 && (d>=49 || d<=57))
            System.out.println("Valid month");
        
        else
        {
            if(c==49 && j==5 && (d==48 || d==49 || d==50))
                System.out.println("Valid month");
            else
                System.out.println("Not a valid month");
        }
        
        if(i==2 && a==48)
        {
            if(b>=49 && b<=57)
                System.out.println("Valid day");
            else
                System.out.println("Not a valid day");
        }
        
        else if(i==2 && a==49 || a==50)
        {
            if(b>=48 || b<=57)
                System.out.println("Valid day");
            else
                System.out.println("Not a valid day");
        }
        
        else if(i==2 && a==50)
        {
            if(b==48 || b==49)
                System.out.println("Valid day");
            else
                System.out.println("Not a valid day");
        }
 
        
    }
    
}

