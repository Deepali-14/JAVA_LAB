class ATM
{
    synchronized public void checkBalance(String name)
    {
        System.out.println(name+" Checking ");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {}
        System.out.println("Balance");
    }
    synchronized public void Withdraw(String name, int amount)
    {
        System.out.println(name+" Withdrawing ");
        try
        {
            Thread.sleep(1000);
        }
        catch(Exception e)
        {}
        System.out.println("Amount");
    }
}
class Customer1 extends Thread
{
    String name;
    int amount;
    ATM atm;
    public Customer1(String n, ATM a, int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    {
        atm.checkBalance(name);
        atm.Withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}
public class ScThread1 
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        Customer1 c1=new Customer1("Smith ", atm, 100);
        Customer1 c2=new Customer1("John ", atm, 200);
        c1.start();
        c2.start();
    }   
}
