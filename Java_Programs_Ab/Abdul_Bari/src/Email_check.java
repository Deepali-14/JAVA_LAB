/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Email_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // to check whether a string has gmail or not and to separate its username and domain name
        String str="deepalisingh141101@gmail.com";
        int n = str.indexOf("@");
        String username = str.substring(0,n);
        String domain = str.substring(n+1, str.length());
        
        System.out.println("Username = "+username);
        System.out.println("Domain name = "+domain);
        
        int i=domain.indexOf(".");
        
        String str1 =  domain.substring(0,i);
        
        System.out.println("If string matches "+str1.equals("gmail"));
        
    }
    
}
