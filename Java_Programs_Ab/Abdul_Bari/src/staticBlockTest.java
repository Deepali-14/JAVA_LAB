/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class static_test
{
    static int y;
    static
    {
        y=20;
    }
    static void display()
    {
        System.out.println("y = "+y);
    }
}
public class staticBlockTest {
    public static void main(String args[])
    {
        static_test s = new static_test();
        s.display();
    }
}
