/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
class Students
{
    private String rollNo;
    private static int count=1;
    private static String generateRollNo()
    {
        Date d = new Date();
        String rno = "Univ"+"-"+(d.getYear()+1999)+"-"+count;
        count++;
        return rno;
    }
    Students()
    {
        rollNo = generateRollNo();
    }
    public void display()
    {
        System.out.println("Roll No. = "+rollNo);
    }
}
public class studentAutoRollTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();
        s1.display();
        s2.display();
        s3.display();
    }
    
}
