/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Merging_Masking_nibble {
    public static void main(String[] args) {
        // TODO code application logic here
        byte c;
        c=(byte)(9<<4);
        c=(byte)(c|12);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111);
    }
}
 