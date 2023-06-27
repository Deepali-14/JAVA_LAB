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
public class Add_matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter elements to insert in matrix a : ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Elements in matrix a : ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
                System.out.print(" "+a[i][j]);
            System.out.println("");
        }
        int b[][]=new int[3][3];
        System.out.println("Enter elements to insert in matrix b : ");
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[0].length; j++)
                b[i][j]=sc.nextInt();
        }
        System.out.println("Elements in matrix b : ");
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[0].length; j++)
                System.out.print(" "+b[i][j]);
            System.out.println("");
        }
        int c[][]=new int[3][3];
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        System.out.println("Matrix after adding a and b : ");
        for(int i=0; i<c.length; i++)
        {
            for(int j=0; j<c[0].length; j++)
                System.out.print(" "+c[i][j]);
            System.out.println("");
        }
    }
    
}
