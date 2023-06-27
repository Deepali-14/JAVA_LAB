/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
//interface Demo
//{
//    void display1();
//}
abstract class Demo
{
    abstract public void display1();
}
class O
{
    public void display()
    {
//        Demo d = new Demo(){
//            public void display1()
//            {
//                System.out.println("We are working on anonymous inner class");
//            }
//        };
        new Demo(){
            public void display1()
            {
                System.out.println("We are working on anonymous inner class");
            }
        }.display1(); //Anonymous object
        //d.display1();
    }
}
public class anonymousClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        O o =new O();
        o.display();
    }
    
}
