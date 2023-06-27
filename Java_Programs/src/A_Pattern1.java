/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class A_Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        for(int i=1; i<=5; i++)
//        {
//            for(int k=1; k<=5-i; k++)
//                System.out.print(" ");
//            for(int j=1; j<=i; j++)
//                System.out.print("*");
//            System.out.println("");
//        }
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(i+j>5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
}
