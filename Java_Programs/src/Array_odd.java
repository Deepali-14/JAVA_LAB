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
public class Array_odd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int arr[] = new int[10];
        System.out.println("Enter 10 integer numbers : ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Odd numbers : ");
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
            
}
