/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class Pattern11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r;
        r=sc.nextInt();
        int i,space,k=0;
        for(i=1; i<=r; ++i, k=0) 
        {
            for(space=1; space<=r-i; ++space) 
            {
                System.out.print(" ");
            }
            while(k!=2*i-1) 
            {
                System.out.print("*");
                ++k;
            }
            System.out.println(" ");
      }
    }  
}
