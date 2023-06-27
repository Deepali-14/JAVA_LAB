import java.util.Scanner;
class Employee1
{
    public String emp_name;
    public int yr;
    public String address;     
    public void setdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of employee : ");
        emp_name = sc.nextLine();
        System.out.println("Enter year of joining of employee : ");
        yr = sc.nextInt();
        System.out.println("Enter address of employee : ");
        sc.nextLine();
        address = sc.nextLine();
    }
    public void getdata()
    {
        System.out.println(emp_name+"\t\t"+yr+"\t\t"+address+"\n");
    }
}

public class Employee_test 
{
    public static void main(String[] args)
    {
        Employee1 e[] = new Employee1[3];
        for(int i=0; i<3; i++)
        {
           e[i]=new Employee1();
           e[i].setdata();
        }
        System.out.println("Name\tYear of joining\t\tAddress\n");
        for(int i=0; i<3; i++)
        {
           e[i].getdata();
        }
    }
}