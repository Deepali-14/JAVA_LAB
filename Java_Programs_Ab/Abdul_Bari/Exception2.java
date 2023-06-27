/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Exception2 {
    static void fun1()
    {
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
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