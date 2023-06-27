/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Student {

    /**
     * @param args the command line arguments
     */
    private String name;
    private String rollno;
    private String dept;
    private String subject[];
    
    public Student(String nm, String rn, String dpt, String sub[])
    {
        name=nm;
        rollno=rn;
        dept=dpt;
        subject=new String[5];
        for(int i=0; i<5; i++)
        {
            subject[i]=sub[i];
        }
    }   
    public String[] getsubject()
    {
        return subject;
    }
    public String toString()
    {
        return "\n Name : "+name+"\n Roll no. : "+rollno+"\n Department : "+dept;
    }
}
public class Studenttest
{
    public static void main(String args[])
    {
        System.out.println("\n *************Detail of 5 students*************");
        Student s[] = new Student[5];
        s[0]=new Student("Deepali","2016736","Computer Science", new String[]{"Maths", "Science", "Social Science", "English", "Hindi"} );
        s[1]=new Student("Aman Sharma","2016730","Information Technology", new String[]{"Maths", "Science", "Social Science", "Punjabi", "Spanish"} );
        s[2]=new Student("Shraddha","2016778","Chemical", new String[]{"Maths", "Science", "Social Science", "English", "Business Studies"} );
        s[3]=new Student("Aryan Malik","2016756","Electrical and Electronics", new String[]{"Maths", "Science", "Social Science", "English", "German"} );
        s[4]=new Student("Deepansh Roy","2016990","Mecatronics", new String[]{"Maths", "Science", "Social Science", "English", "Robotics"} );
        for(Student x:s)
        {
            System.out.println(x);
            System.out.println(" Subjects : ");
            for(int i=0; i<5; i++)
            {
                String sub[]=s[i].getsubject();
                System.out.print(" "+sub[i]+"    ");
            }
            System.out.println();
        }
    }
}
