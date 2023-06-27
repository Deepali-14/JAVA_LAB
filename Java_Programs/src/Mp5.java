class My1 extends Thread
{
    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}
public class Mp5 {
    public static void main(String args[])
    {
        My1 t = new My1();
        t.setDaemon(true);
        t.start();
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
