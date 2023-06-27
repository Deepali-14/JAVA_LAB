/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Outer1
{
    public void display()
    {
        class Inner1
        {
            public void display1()
            {
                System.out.println("Local inner class accessed via outer class");
            }
        }
        new Inner1().display1();//Anonymous object
        //Inner i = new Inner();
        //i.display1();
    }
}
public class localInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Outer1 o = new Outer1();
        o.display();
    }
    
}
