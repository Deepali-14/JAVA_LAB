/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
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
public class Delete_element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n=sc.nextInt();
        int a[]=new int[2*n];
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
        System.out.println("Enter position to delete from : ");
        int pos=sc.nextInt();
        for(int i=pos+1; i<n; i++)
        {
            a[i-1]=a[i];
        }
        for(int i=0; i<n-1; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
    }  
}
