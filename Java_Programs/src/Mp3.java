class Mythread extends Thread
{
    public Mythread(String name)
    {
        super(name);
        setPriority(Thread.NORM_PRIORITY+5);
    }
}
public class Mp3 {
    public static void main(String args[])
    {
        Mythread t = new Mythread("My thread 1");
        System.out.println("ID : "+t.getId());
        System.out.println("NAME : "+t.getName());
        System.out.println("PRIORITY : "+t.getPriority());
        System.out.println("STATE : "+t.getState());
        System.out.println("ALIVE : "+t.isAlive());
    }
}
