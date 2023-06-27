class MyThr extends Thread
{
    public MyThr(String name)
    {
        super(name);
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Mp4 {
    public static void main(String args[])
    {
        MyThr t=new MyThr("My Thread 1");
        t.start();
        t.interrupt();
    }
}
