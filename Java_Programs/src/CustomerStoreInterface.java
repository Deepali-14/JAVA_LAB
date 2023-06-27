/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
interface Member
{
    public void callBack();
}
class Store
{
    Member m[] = new Member[20];
    int count=0;
    
    public void register(Member mb)
    {
        m[count++]=mb;
    }
    public void inviteSale()
    {
        for(int i=0; i<count; i++)
            m[i].callBack();
    }
}
class Customer implements Member
{
    public String name;
    public Customer(String m)
    {
        name=m;
    }  
    public void callBack()
    {
        System.out.println("Okay! I will visit "+name+":)\n");
    }
}
public class CustomerStoreInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Store s = new Store();
        Customer c1 = new Customer("Deepali Singh");
        Customer c2 = new Customer("Sudhiksha Singh");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
    
}
