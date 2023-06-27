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
public class Array_2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int a[][]=new int[3][4];
//        int b[][];
//        b=new int[3][4];
//        int [][]c=new int[3][4];
//        int[][] d=new int[3][4];
//        int[][]e=new int[3][4];
//        int []f, g[];
//        f=new int[2];
//        g=new int[3][4];
          Scanner sc = new Scanner(System.in);
//        System.out.println("Enter elements to insert : ");
//        for(int i=0; i<a.length; i++)
//        {
//            for(int j=0; j<a[0].length; j++)
//                a[i][j]=sc.nextInt();
//        }
//        System.out.println("Elements : ");
//        for(int i=0; i<a.length; i++)
//        {
//            for(int j=0; j<a[0].length; j++)
//                System.out.print(" "+a[i][j]);
//            System.out.println("");
//        }
//        System.out.println("Elements with for each loop : ");
//        for(int x[]:a)
//        {
//            for(int y:x)
//                System.out.print(" "+y);
//            System.out.println("");
//        }
//        System.out.println("Array length : "+a.length); //no. of rows
//        Jagged array - Array with different column sizes
        int a[][];
        a=new int[3][];
        a[0]=new int[4];
        a[1]=new int[3];
        a[2]=new int[5];
        
        
        System.out.println("Enter elements to insert in jagged array : ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Elements in jagged array: ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
                System.out.print(" "+a[i][j]);
            System.out.println("");
        }
        System.out.println("Elements with for each loop in jagged array : ");
        for(int x[]:a)
        {
            for(int y:x)
                System.out.print(" "+y);
            System.out.println("");
        }
        
        
    }
    
}
