/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class outer
{
    public int x=10;
    public static int y=20;  //By default is public even if not written
    public static class inner
    {
        public void display()
        {
            System.out.println("y = "+y); // this static class an only access static data member
        }
    }    
    public void display()
    {
        System.out.println("x = "+x); // this static class an only access static data member
    }
}
public class staticClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer o = new outer();
        o.display();
        outer.inner i = new outer.inner();
        i.display();
    }
    
    
}
