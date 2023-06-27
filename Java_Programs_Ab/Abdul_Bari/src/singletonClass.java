/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class coffeeMachine
{
    private float coffeeQty;
    private float sugarQty;
    private float milkQty;
    private float waterQty;
    
    private static coffeeMachine my=null;
    
    private coffeeMachine()
    {
        coffeeQty = 1.0f;
        sugarQty = 1.0f;
        waterQty = 1.0f;
        milkQty = 1.0f;
    }
    
    static coffeeMachine getInstance()
    {
        if(my==null)
            my = new coffeeMachine();
        my.getCoffeeQty(20.78f);
        my.getWaterQty(78.78f);
        my.getSugarQty(12.34f);
        my.getMilkQty(100.23f);
        my.display();
        return my;
    }
    
    public void getCoffeeQty(float f)
    {
        coffeeQty = f;
    }
    
    public void getMilkQty(float f)
    {
        milkQty = f;
    }
    
    public void getSugarQty(float f)
    {
        sugarQty = f;
    }
    
    public void getWaterQty(float f)
    {
        waterQty = f;
    }
    
    public void display()
    {
        System.out.println("Sugar quantity = "+sugarQty);
        System.out.println("Water quantity = "+waterQty);
        System.out.println("Coffee quantity = "+coffeeQty);
        System.out.println("Milk quantity = "+milkQty);
        System.out.println("----------------------------------------------------------------");
    }
}
public class singletonClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        coffeeMachine m1 = coffeeMachine.getInstance();
        coffeeMachine m2 = coffeeMachine.getInstance();
        coffeeMachine m3 = coffeeMachine.getInstance();
        if(m1==m2 && m2==m3)
            System.out.println("The objects are equal");
        else
            System.out.println("The ibjects are not equal");
    }
    
}
