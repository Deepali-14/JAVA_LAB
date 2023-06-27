/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class methodOverloading {

    /**
     * @param args the command line arguments
     */
    int reverse(int x)
    {
        int r,rev=0;
        while(x>0)
        {
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        return rev;
    }
    int[] reverse(int a[], int n)
    {
        int b[]=new int[5];
        for(int i=n-1, j=0; i>=0; i--, j++)
            b[j]=a[i];
        return b;
    }
    boolean validate(String str)
    {
        return(str.matches("[a-zA-Z\\s]+"));
    }
    boolean validate(int age)
    {
        return (age>=3 && age<=15);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        methodOverloading o = new methodOverloading();
        int a[]={1,2,3,4,5};
        System.out.println(o.reverse(237));
        int b[]=o.reverse(a,5);
        for(int i=0; i<5; i++)
             System.out.print(b[i]);
        System.out.println();
        System.out.println(o.validate("6stha"));
        System.out.println(o.validate(21));
    }
    
}
