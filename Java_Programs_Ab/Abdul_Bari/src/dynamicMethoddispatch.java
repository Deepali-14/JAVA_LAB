/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Sup
{
    public void math1()
    {
        System.out.println("math1");
    }
    
    public void math2()
    {
        System.out.println("math2");
    }
}
class Der extends Sup
{
    @Override  //Annotation
    public void math2()
    {
        System.out.println("Derived math2");
    }
    
    public void math3()
    {
        System.out.println("math3");
    }
}
public class dynamicMethoddispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sup s=new Der();
        s.math1();
        s.math2();
    }
    
}
