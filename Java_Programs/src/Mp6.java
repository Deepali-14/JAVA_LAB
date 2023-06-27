class My2 extends Thread
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
public class Mp6 
{
    public static void main(String args[]) throws Exception
    {
        My2 t = new My2();
        t.setDaemon(true);
        t.start();
        Thread main=Thread.currentThread();
        main.join();
    }
}
