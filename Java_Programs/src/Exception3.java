/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class lowBalanceException extends Exception
{
    public String toString()
    {
        return "The balance is less than Rupees 1000\n";
    }
}
public class Exception3{
    static void fun1()
    {
        try
        {
            int i=1000;
            if(i<5000)
                throw new lowBalanceException();
        }
        catch(lowBalanceException e)
        {
//            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    public static void main(String args[])
    {
	fun3();
    }
}
