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
public class overloading_Fun {

    /**
     * @param args the command line arguments
     */
    
    void display(int n, char c)
    {
        System.out.println("Integer : "+n);
        System.out.println("Character : "+c);
    }
    
    void display(char c, int n)
    {
        System.out.println("Character : "+c);
        System.out.println("Integer : "+n);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        overloading_Fun o;
        o = new overloading_Fun();
        o.display(1,'c');
        o.display('c',1);
    }
    
}
