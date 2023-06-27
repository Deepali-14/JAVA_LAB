/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
interface IVehicle
{
    String company="Maruti Suzuki";
    double price=2000750.98989;
    void input();
    void display();
}

class LightMotorVehicle implements IVehicle
{
    public float mileage;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mileage (in kmps) : ");
        mileage=sc.nextFloat();
    }
    
    public void display()
    {
        System.out.println(" "+company+"\t"+price+"\t"+mileage+"\n");
    }
}

class HeavyMotorVehicle implements IVehicle
{
    int capacity;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity (in tons) : ");
        capacity=sc.nextInt();
    }
    
    public void display()
    {
        System.out.print(" "+company+"\t"+price+"\t"+capacity+"\n");
    }
}

public class Vehicle_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects you want to make : ");
        int n=sc.nextInt();
        
        System.out.print("Enter type of vehicle (LightMotorVehicle or HeavyMotorVehicle) : ");
        sc.nextLine();
        String type = sc.nextLine();
        
        switch(type)
        {
            case "LightMotorVehicle":
                IVehicle v[]= new LightMotorVehicle[n];
                for(int i=0; i<n; i++)
                {
                    v[i]=new LightMotorVehicle();
                    v[i].input();
                }
                System.out.println("********************* DETAILS *********************");
                System.out.println("Company \t\t Price \t\t Mileage \n");
                for(int i=0; i<n; i++)
                {
                    v[i].display();
                }
                break;
            case "HeavyMotorVehicle":
                IVehicle s[]= new HeavyMotorVehicle[n];
                for(int i=0; i<n; i++)
                {
                    s[i]=new HeavyMotorVehicle();
                    s[i].input();
                }
                System.out.println("********************* DETAILS *********************");
                System.out.println("Company \t\t Price \t\t Capacity \n");
                for(int i=0; i<n; i++)
                {
                    s[i].display();
                }
            break;
        }
        
    }
    
}

