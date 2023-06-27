class MyData
{
    public void display(String str)
    {
        synchronized (this)
        {
            for(int i=0; i<str.length(); i++)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
class Mythread1 extends Thread
{
    MyData d;
    public Mythread1(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}
class Mythread2 extends Thread
{
    MyData d;
    public Mythread2(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display(" Welcome All");
    }
}
public class syncDemo 
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        Mythread1 t1=new Mythread1(data);
        Mythread2 t2=new Mythread2(data);
        t1.start();
        t2.start();
    }
    
}
