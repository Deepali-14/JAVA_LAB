/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Outer
{
    public int y=30;
    //Inner i = new Inner();
    class Inner
    {
        public int x=20;
        public void idisplay()
        {
            System.out.println("Innerclass: Outer variable y = "+y+" and "+"Inner variable x = "+x);
        }
    }
    public void odisplay()
    {
        Inner i = new Inner();
        System.out.println("Outerclass: Outer variable y = "+y+" and "+"Inner variable x = "+i.x);
    }
}
public class nestedInner {
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.odisplay();
        Outer.Inner i = new Outer().new Inner();
        i.idisplay();
    }
}
