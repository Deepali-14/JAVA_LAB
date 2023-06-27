/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Super
{
    public void display()
    {
        System.out.println("In parent class");
    }
}
class Derived extends Super
{
    public void display()
    {
        System.out.println("In derived class");
    }
}
public class Method_overriding {
    public static void main(String[] args)
    {
//        Super s=new Super();
//        s.display();   
        Super t=new Derived();
        t.display();   
//        Derived d=new Derived();
//        d.display();   
    }
}
