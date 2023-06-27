/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Rect
{
    public int l,b;
    public Rect()
    {
        l=b=1;
    }
    public Rect(int l, int b)
    {
        this.l=l;
        this.b=b;
    }
    public void display()
    {
        System.out.println("Length of rectangle = "+l);
        System.out.println("Breadth of rectangle = "+b);
    }
}
public class thisKeyword 
{
    public static void main(String [] args)
    {
        Rect r=new Rect(5,6);
        r.display();
    }
}
