class Mydata
{
    synchronized void display(String str)
    {
        for(int i=0; i<str.length(); i++)
            System.out.print(str.charAt(i));
        System.out.println();
    }
}
class Mythread11 extends Thread
{
    Mydata d;
    Mythread11(Mydata dat)
    {
        d=dat;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class Mythread22 extends Thread
{
    Mydata d;
    Mythread22(Mydata dat)
    {
        d=dat;
    }
    public void run()
    {
        d.display("Welcome");
    }
}
public class Synchronize 
{
    public static void main(String args[])
    {
        Mydata d=new Mydata();
        Mythread11 t1=new Mythread11(d);
        Mythread22 t2=new Mythread22(d);
        t1.start();
        t2.start();
    }
}
