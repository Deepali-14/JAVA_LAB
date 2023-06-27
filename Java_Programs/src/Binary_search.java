
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
import java.util.*;
public class Binary_search {

    /**
     * @param args the command line arguments
     */
    static int binary_search(int a[], int n, int key)
    {
        int l=0, h=n-1, m;
        while(l<=h)
        {
            m=(l+h)/2;
            if(a[m]==key)
                return m;
            else if(a[m]>key)
                h=m-1;
            else
                l=m+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of elements in array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements in increasing order : ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter element to search : ");
        int key = sc.nextInt();
        int k = binary_search(a,n,key);
        if(k==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at "+k+"th index");
            
    }
    
}

