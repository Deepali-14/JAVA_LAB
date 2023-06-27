import java.util.Scanner;
class StackOverflow extends Exception
{
    public String toString()
    {
        return "Stack is full";
    }
}
class StackUnderflow extends Exception
{
    public String toString()
    {
        return "Stack is empty";
    }
}

class Stack
{
    public int top=-1;
    public int stk[];
    public int size;
    public Stack(int s)
    {
        size = s;
        stk=new int [s];
    }
    public void push(int x)throws StackOverflow
    {
        if(top==size-1)
            throw new StackOverflow();
        else
            stk[++top]=x;
    }
    public int pop()throws StackUnderflow
    {
        if(top==-1)
            throw new StackUnderflow();
        else
        {
            int y=stk[top--];
            return y;
        }
    }
    public void display()
    {
        System.out.println("Stack elements -> ");
        for(int i=(size-1); i>=0; i--)
        {
            System.out.println(stk[i]);
        }
    }
    public void init()
    {
        top=-1;
    }
}
public class StackExceptionTest {
    public static void main(String args[])
    {
        int ch,x;
        Stack s = new Stack(5);
        do
        {
            System.out.println("1. Initialization \n2. Push \n3. Pop \n4. Display \n0. Exit");
            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    s.init();
                    break;
                case 2:
                    System.out.print("Enter element to insert in stack : ");
                    x=sc.nextInt();
                    try
                    {
                        s.push(x);
                    }
                    catch(StackOverflow e)
                    {
                        System.out.println(e);
                    }
                break;
                case 3:
                    try
                    {
                        int res=s.pop();
                        System.out.println("Popped element = "+res);
                    }
                    catch(StackUnderflow e)
                    {
                        System.out.println(e);
                    }
                break;
                case 4:
                    s.display();
                    break;
                case 0:
                    System.out.println("We are exiting !");
                    break;
                default:
                    System.out.println("Wrong choice:( Please try again!");
            }
        }while(ch!=0);
    }
}
