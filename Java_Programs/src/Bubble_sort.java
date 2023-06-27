
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
public class Bubble_sort {

    /**
     * @param args the command line arguments
     */
    static void bubble_sort(int a[], int n)
    {
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of elements in array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        bubble_sort(a,n);
        System.out.println("Sorted array elements in increasing order : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}

