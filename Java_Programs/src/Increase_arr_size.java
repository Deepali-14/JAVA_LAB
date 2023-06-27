/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Increase_arr_size {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        int b[]=new int[2*a.length];
        System.out.println("Size of array a = "+a.length);
        for(int i=0; i<a.length; i++)
        {
            b[i]=a[i];
        }
        a=b;
        System.out.println("Size of array a = "+a.length);
        System.out.println("Size of array b = "+b.length);
        System.out.println("Array a : ");
        for(int x:a)
             System.out.print(x+" ");
        System.out.println("");
        System.out.println("Array b : ");
        for(int x:b)
             System.out.print(x+" ");
        System.out.println("");
    }
    
}
