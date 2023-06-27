/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Test
{
    public static int s=8;
    public static void cube()
    {
        System.out.println("Cube of "+s+" is "+s*s*s+"\n");
    }
}
public class Static_testofcube {
    public static void main(String args[])
    {
        Test t = new Test();
        t.cube();
    }
}
