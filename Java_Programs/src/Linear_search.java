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
public class Linear_search {

    /**
     * @param args the command line arguments
     */
    static int linear_search(int a[], int n, int key)
    {
        for(int i=0; i<n; i++)
        {
            if(a[i]==key)
                return i;
        }
        return -1;
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
        System.out.println("Enter element to search : ");
        int key = sc.nextInt();
        int k = linear_search(a,n,key);
        if(k==-1)
            System.out.println(key+" not found");
        else
            System.out.println(key+" found at "+k+"th index");
            
    }
    
}
