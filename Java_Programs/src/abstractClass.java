/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
abstract class abstractExample
{
    abstractExample()
    {
        System.out.println("Parent class constructor");
    }
    abstract void method1();
}
class derived extends abstractExample
{
    public void method1()
    {
        System.out.println("Derived class method");
    }
}
public class abstractClass 
{
    public static void main(String[] args)
    {
        abstractExample a = new derived();
        a.method1();
    }
}
