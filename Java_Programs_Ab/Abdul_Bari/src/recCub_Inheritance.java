/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Rectangle 
{
    public int l,b;
    public Rectangle()
    {
        l=b=1;
    }
    public Rectangle(int len, int br)
    {
        System.out.println("Base class Rectangle");
        if(len>0 && br>0)
        {
            l=len;
            b=br;
        }
        else
        {
            l=b=1;
        }
    }
}

class Cuboid extends Rectangle 
{
    public int h;
    public Cuboid()
    {
        h=1;
    }
    public Cuboid(int ht)
    {
        if(ht>0)
            h=ht;
        else
            h=1;
    }
    public Cuboid(int len, int br,int ht)
    {
        super(len,br);
        System.out.println("Derived class Cuboid");
        if(ht>0)
            h=ht;
        else
            h=1;
    }
    public int volume()
    {
        System.out.println("l = "+l+"\n"+"b = "+b+"\n"+"h = "+h);
        return (l*b*h);
    }
}
public class recCub_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuboid c = new Cuboid(1,4,-1);
        int r=c.volume();
        System.out.println("Volume of Cuboid : "+r);
    }
    
}
