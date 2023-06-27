/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class maxVar {

    /**
     * @param args the command line arguments
     */
    int max(int ...a)
    {
        if(a.length==0)
            return Integer.MAX_VALUE;
        else
        {
            int max=a[0];
            for(int i=0; i<a.length; i++)
            {
                if(a[i]>max)
                    max=a[i];
            }
            return max;
        }
    }
    
    int sum(int ...a)
    {
        if(a.length==0)
            return 0;
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    
    float discount(int ...a)
    {
        if(a.length==0)
            return 0;
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        if(sum<10000)
            return (sum*0.1f);
        else if(sum>=10000 && sum<50000)
            return (sum*0.5f);
        else
            return (sum*0.75f);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        maxVar a = new maxVar();
        System.out.println("MAX = "+a.max());
        System.out.println("MAX = "+a.max(1,2,-1,333,5,6));
        System.out.println("SUM = "+a.sum(1,2,-1,333,5,6));
        System.out.println("SUM = "+a.sum());
        System.out.println("DISCOUNT = "+a.discount(10000, 200, 3000, 5000, 90000));
        System.out.println("DISCOUNT = "+a.discount());
    }
    
}
