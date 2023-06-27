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
public class Pattern10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r;
        r=sc.nextInt();
        int n=0;
        for(int i=1; i<=r; i++)
        {
            if(i%2!=0)
               System.out.print(" "+(++n));
            else
                for(int j=1; j<=3; j++)
                    System.out.print((++n));
                System.out.println();
        }
    }
    
}
