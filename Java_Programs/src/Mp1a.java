
public class Mp1a extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        Mp1a m=new Mp1a();
        m.start();
        int i=1;
        while(true)
        {
            System.out.println(i+"world");
            i++;
        }
    }
}
