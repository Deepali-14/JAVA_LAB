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
public class checkEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an email address : ");
        String str = sc.nextLine();
        
        int i=str.indexOf("@");
        
        int j=str.indexOf(".");
      
        int k=str.indexOf(" ");
       
        int ch= str.charAt(0);
      
        if(((ch<=122) && (ch>=97)) && k==-1)
        {
            if((i>0 && j>0 && (j-i)>1))
            {
                String domain=str.substring(j,str.length());
                if(domain.equals(".com") || domain.equals(".net"))
                    System.out.println("Email address is valid");
                else
                    System.out.println("Email address is not valid");
            }
            else
                System.out.println("Email address is not valid");
        }
        else
            System.out.println("Email address is not valid");
    }  
}
