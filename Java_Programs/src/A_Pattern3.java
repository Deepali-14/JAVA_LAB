/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class A_Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
        for(int i=1; i<=5; i++)
        {
            for(int s=1; s<=5-i; s++)
            {
                System.out.print(" ");
            }
            while(k!=2*i-1)
            {
                System.out.print("*");
                k++;
            }
            System.out.println("");
        }
    }
    
}
