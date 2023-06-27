class Car
{
    public void start()
    {
        System.out.println("Car is started");
    }
    public void accelerate()
    {
        System.out.println("Car is accelerated");
    }
    public void Gear()
    {
        System.out.println("Car gear is changed");
    }
}
class LuxuryCar extends Car
{
    public void Gear()
    {
        System.out.println("Automatic gear");
    }
    public void openRoof()
    {
        System.out.println("Roof is opened");
    }
}
public class carLuxuryCar {
    public static void main(String[] args)
    {
        Car c=new Car();
        c.start();
        c.accelerate();
        c.Gear();
        
        Car d=new LuxuryCar();
        d.start();
        d.accelerate();
        d.Gear();
        //it cannot call openRoof as it does not know about this feature
        LuxuryCar e = new LuxuryCar();
        e.start();
        e.accelerate();
        e.Gear();
        e.openRoof();
    }
}
