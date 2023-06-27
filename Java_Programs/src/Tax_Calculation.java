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
public class Tax_Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary of employee : ");
        float sal = sc.nextFloat();
        
        if(sal<=50000)
            System.out.println("Tax = Rs.0");
        else if(sal>50000 && sal<=60000)
            System.out.println("Salary = Rs."+sal+" and Tax = Rs."+((sal-50000)*0.1));
        else if(sal>60000 && sal<=150000)
            System.out.println("Salary = Rs."+sal+" and Tax = Rs."+((10000*0.1)+((sal-60000)*0.2)));
        else if(sal>150000)
            System.out.println("Salary = Rs."+sal+" and Tax = Rs."+((10000*0.1)+(90000*0.2)+(sal-150000)*0.3));
    }
    
}
