class My3 extends Thread
{
    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println((count++) +"MyThread");
        }
    }
}
public class Mp7
{
    public static void main(String args[]) throws Exception
    {
        My3 t = new My3();
        t.start();
        int count = 1;
        while(true)
        {
            System.out.println((count++) +"Main");
            Thread.yield();
        }
    }
}