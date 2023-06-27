import java.sql.*;
import java.util.Scanner;
public class Emp 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/BANASTHALI", "Deepali", "deepali");
            Statement stmt=con.createStatement();
            System.out.println("-------------BANASTHALI DATABASE------------");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Record");
            System.out.println("0. Exit");
            int ch;
            do
            {
                String id,name,add,city,state;
                System.out.print("Enter choice : ");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                        System.out.print("Enter employee id : ");
                        id=sc.next();
                        System.out.print("Enter employee name : ");
                        name=sc.next();
                        System.out.print("Enter employee address : ");
                        add=sc.next();
                        System.out.print("Enter employee city : ");
                        city=sc.next();
                        System.out.print("Enter employee state : ");
                        state=sc.next();
                        String p="insert into Employee values ('"+id+"','"+name+"','"+add+"','"+city+"','"+state+"') ";
                        int x=stmt.executeUpdate(p);
                        if(x>0)
                            System.out.println("Successfully inserted");
                        else
                            System.out.println("Insertion failed :(");
                        break;
                        
                    case 2:
                        String q="update Employee set EmployeeName='Riya' where EmployeeId='e3'";
                        int x1=stmt.executeUpdate(q);
                        if(x1>0)
                            System.out.println("Successfully updated");
                        else
                            System.out.println("Updation failed :(");
                        break;
                        
                    case 3:
                        String r="delete from Employee where EmployeeId='e5'";
                        int x2=stmt.executeUpdate(r);
                        if(x2>0)
                            System.out.println("Successfully deleted");
                        else
                            System.out.println("Deletion failed :(");
                        break;
                        
                    case 4:
                        ResultSet rs=stmt.executeQuery("select * from Employee");
                        while(rs.next())
                        {
                            System.out.print(rs.getString(1)+"\t"+rs.getString(2)+"\t");
                            System.out.print(rs.getString(3)+"\t"+rs.getString(4)+"\t");
                            System.out.println(rs.getString(5));
                        }
                        con.close();
                        break;
                        
                    case 0:
                        System.out.println("We are exiting !");
                        break;
                        
                    default:
                        System.out.println("Wrong choice entered ! Try again !");
                }
            }while(ch!=0);
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
    }
}
