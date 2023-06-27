class Tv
{
    public void switchOn()
    {          
        System.out.println("Tv is switched on");
    }
    public void changeChannel()
    {          
        System.out.println("Tv channel is changed");
    }
}
class SmartTv extends Tv
{
    public void switchOn()
    {          
        System.out.println("Smart Tv is switched on");
    }
    public void changeChannel()
    {          
        System.out.println("Smart Tv channel is changed");
    }
    public void browse()
    {
      System.out.println("We can browse here");
    }
}
public class Tv_smarttv 
{
    public static void main(String[] args)
    {
        Tv t = new SmartTv();// We can call a smart tv as tv and hence it can be used as a reference but not vice versa
        t.switchOn();
        t.changeChannel();
        //t.browse(); it shows err here because it is not here in Tv and hence it does not know about this property
    }
    
}
