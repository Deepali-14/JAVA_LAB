/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Second_largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,3,4,1,5};
        int max1, max2;
        max1=max2=Integer.MIN_VALUE;
        for(int i=0; i<5; i++)
        {
            if(a[i]>max1)
            {
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2 && a[i]!=max1)
            {
                max2=a[i];
            }
        }
        System.out.println("Second Largest Element : "+max2);
    }
    
}
