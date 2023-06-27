class whiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance()
    {
        numberOfStudents++;
    }
    synchronized public void write(String t)
    {
        System.out.println("Teacher is writing "+t);
        while(count!=0)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
            }
        }
        text=t;
        count=numberOfStudents;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count==0)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
            }
        }
        String t=text;
        count--;
        if(count==0)
            notify();
        return t;
    }
}
class Teacher extends Thread
{
    whiteBoard wb;
    String notes[]={"Java is language", "It is OOPs", "It is platform independent", "It supports thread", "end"};
    public Teacher(whiteBoard w)
    {
        wb=w;
    }
    public void run()
    {
        for(int i=0; i<notes.length; i++)
        {
            wb.write(notes[i]);
        }
    }
}
class Student extends Thread
{
    whiteBoard wb;
    String name;
    public Student(String n, whiteBoard w)
    {
        name=n;
        wb=w;
    }
    public void run()
    {
        String text;
        wb.attendance();
        do
        {
            text=wb.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}
public class ScThread2
{
    public static void main(String[] args) 
    {
        whiteBoard wb=new whiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }   
}