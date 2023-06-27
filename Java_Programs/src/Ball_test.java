/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
class Ball
{
    public String ball_color;
    public int ball_bounce;
    public String bounce_type;
    
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ball color : ");
        ball_color = sc.next();
        System.out.println("Enter number of times ball bounced : ");
        ball_bounce = sc.nextInt();
        if(ball_bounce%2==0)
            bounce_type="EVEN";
        else
            bounce_type="ODD";
    }
    public String toString()
    {
        return ball_color+"\t\t\t"+ball_bounce+"\t\t\t"+bounce_type+"\n"; 
    }
}
        
public class Ball_test 
{
    public static void main(String[] args)
    {
        Ball b[] = new Ball[3];
        for(int i=0; i<3; i++)
        {
            b[i]=new Ball();
            b[i].getdata();
        }
        System.out.println("Ball Color\t Ball Bounce\t Bounce Type\n");
        for(Ball x:b)
        {
            System.out.println(x);
        }
    }
}
