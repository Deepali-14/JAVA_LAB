/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Rec
{
    public int l,b;
    public Rec()
    {
        l=b=1;
    }
    public Rec(int len, int bre)
    {
        if(l>=0 && b>=0)
        {
            l=len;
            b=bre;
        }
        else
            l=b=1;
    }
}
class Cub extends Rec
{
    public int h;
    public Cub()
    {
        h=1;
    }
    public Cub(int ht)
    {
        if(h>=0)
            h=ht;
        else
            h=1;
    }
    public Cub(int len, int bre, int ht)
    {
        super(len,bre);
        if(h>=0)
            h=ht;
        else
            h=1;
    }
    public int Volume()
    {
        return l*b*h;
    }
}
public class Rectangle_Cuboid_Inherit 
{
    public static void main(String[] args)
    { 
        Cub r=new Cub(10,20,30);
        System.out.println("Volume of rectangle = "+r.Volume());
    }
}
