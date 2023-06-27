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
public class check_website {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of website : ");
        String str=sc.next();
        int i=str.lastIndexOf(".");
        int j=str.indexOf(":");
        String protocol=str.substring(0,j);
        System.out.println(protocol);
        String domain=str.substring(i+1,str.length());
        switch(protocol)
        {
            case "http":
                System.out.println("Hypertext transfer protocol");
                break;
            case "ftp":
                System.out.println("File transfer Protocol");
                break;
            default:
                System.out.println("Default case");
                break;     
        }
        switch(domain)
        {
            case "com":
                System.out.println("Commercial Website");
                break;
            case "net":
                System.out.println("Network Website");
                break;
            case "org":
                System.out.println("Organisational Website");
                break;
            case "gov":
                System.out.println("Government Webste");
                break;
            default:
                System.out.println("Default case");
                break;     
        }
        
    }
    
}
