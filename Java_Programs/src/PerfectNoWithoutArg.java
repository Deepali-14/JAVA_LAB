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
class PerfectTest
{
    public int n;
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is perfect or not : ");
        n = sc.nextInt();
    }
    public boolean checkPerfect()
    {
        int sum=0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
                sum=sum+i;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
}
public class PerfectNoWithoutArg {

    public static void main(String[] args) {
        PerfectTest p = new PerfectTest();
        p.getdata();
        boolean b=p.checkPerfect();
        System.out.println(b);
    }
    
}
