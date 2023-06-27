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
public class Radix_number_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. in any no. system : ");
        String str=sc.next();
        if(str.matches("[01]+"))
            System.out.println("Binary number - Radix=2");
        else if(str.matches("[0-7]+"))
            System.out.println("Octal number - Radix=8");
        else if(str.matches("[0-9]+"))
            System.out.println("Decimal number - Radix=10");
        else if(str.matches("[0-9A-F]+"))
            System.out.println("Hexadecimal number - Radix=16");
        else
            System.out.println("Default case");
    }
    
}
