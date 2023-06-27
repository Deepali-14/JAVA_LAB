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
public class Sum_Avg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n=10;
        float arr[] = new float[10];
        float sum=0.0f;
        System.out.println("Enter 10 float numbers : ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextFloat();
            sum+=arr[i];
        }
        float avg=sum/n;
        System.out.println("Sum of given numbers is "+sum);
        System.out.println("Average of given numbers is "+avg);
    }
    
}
