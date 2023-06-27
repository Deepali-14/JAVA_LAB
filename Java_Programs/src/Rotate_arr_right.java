
import java.util.Scanner;

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
public class Rotate_arr_right {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array elements : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
        int temp=a[n-1];
        for(int i=n-2; i>=0; i--)
        {
            a[i+1]=a[i];
        }
        a[0]=temp;
        System.out.println("Rotated array elements : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }
    
}
