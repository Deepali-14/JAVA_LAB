/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Volume_test
{
    public int volume(int s)
    {
        return s*s*s;
    }
    public float volume(float r, int h)
    {
        return 3.14f*r*r*h;
    }
    public int volume(int l, int b, int h)
    {
        return l*b*h;
    }
}
public class volumeOverloading {
    
    public static void main(String[] args) {
        Volume_test v = new Volume_test();
        System.out.println("Volume of cube : "+v.volume(5));
        System.out.println("Volume of cylinder : "+v.volume(3.15f,4));
        System.out.println("Volume of rectangular box : "+v.volume(2,3,4));
    }
    
}
