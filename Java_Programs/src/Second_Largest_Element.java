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
public class Second_Largest_Element{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {5,4,1,2,3};
        Arrays.sort(A);
        int max1=A[0], max2=A[0];
        for(int x:A)
            System.out.println(x);
        for(int i=1; i<5; i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("\n Second largest element : "+max2);
        
    }
    
}
