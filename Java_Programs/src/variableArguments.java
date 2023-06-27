/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class variableArguments {

    /**
     * @param args the command line arguments
     */
    void var_arg(int ...x)//this works for both array and variables while int x[] works only for array
    {
        for(int i: x)
            System.out.print(i+" ");
        System.out.println();
    }
    void var_arg(String ...str)
    // void var_arg(int x(Starting index), String ...str) right and reverse sequence is wrong
    // not more than one variable argument
    {
        for(int i=0; i<str.length; i++)
            System.out.println(i+1+". "+str[i]);
        System.out.println();
    }
    public static void main(String ...args) { //new
        // TODO code application logic here
        variableArguments v = new variableArguments();
        v.var_arg(1,2,3,4,5);
        v.var_arg(new int[]{1,2,3,4,5,6});
        v.var_arg("Ram", "Raj", "Dheer", "Rohan");
    }
    
}
