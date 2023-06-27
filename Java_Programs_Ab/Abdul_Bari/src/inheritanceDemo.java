/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Parent
{
    public int x;
    public Parent()
    {
        System.out.println("Non-parameterised constructor of parent class");
    }
    public Parent(int x)
    {
        System.out.println("Parameterised constructor of parent class where x is "+x);
    }
}
class Child extends Parent
{
    public int y;
    public Child()
    {
        System.out.println("Non-parameterised constructor of child class");
    }
    public Child(int y)
    {
        System.out.println("Parameterised constructor of child class where y is "+y);
    }
    public Child(int x,int y)
    {
        super(x); //for parent class it is called and it must be called prior to assigning to child class
        System.out.println("Parameterised constructor of child class where y is "+y);
    }
}
public class inheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Child c = new Child();
        //Child c = new Child(2);
        Child c = new Child(2,3);
    }
    
}
