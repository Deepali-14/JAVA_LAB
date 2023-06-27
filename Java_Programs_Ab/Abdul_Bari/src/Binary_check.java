/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Binary_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //To check if a number is binary or not
        //String s = String.valueOf(b);
        String s = "21010";
        System.out.println(s.matches("[01]+"));
        //To check if a string is hexadecimal no. or not
        //String s = String.valueOf(b);
        String str = "120";
        System.out.println(str.matches("[0-9A-F]+"));
        //To check if a string is in specific date format i.e. 22/03/2001 or not
        String str1 = "02/02/2021";
        System.out.println(str1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        //To check if a string contains special characters or not and remove it if present
        String str3 = "abc@12";
        System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));
        //To remove the leading trailing zeroes and to remove extra spaces if any with one
        String str4 = "      dee      pali singh  ";
        System.out.println(str4.replaceAll("\\s+", " ").trim());
        //To find no. of words in a sentence
        String str5 = "      dee      pali   singh  ";
        str5=str5.replaceAll("\\s+", " ").trim();
        String words[]=str5.split("\\s");
        System.out.println("No. of words in sentence : "+words.length);
    }
    
}
