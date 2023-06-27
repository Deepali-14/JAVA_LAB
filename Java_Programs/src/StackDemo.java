import java.util.Scanner;
import myPack.Stack;
class StackTest implements Stack
{
    public int top=-1;
    public int stk[];
    public int max;
    public StackTest(int s)
    {
        max=s;
        stk=new int[s];
    }
    public void init()
    {
        top=-1;
    }
    public void overflow()
    {
        if(top==max-1)
            System.out.println("Stack is overflow");
        else
            System.out.println("Stack is not overflow");
    }
    public void underflow()
    {
        if(top==-1)
            System.out.println("Stack is underflow");
        else
            System.out.println("Stack is not underflow");
    }
    public void push(int x)
    {
        if(top==max-1)
            System.out.println("Stack is full");
        else
            stk[++top]=x;
    }
    public int pop()
    {
        if(top==-1)
            return -999;
        else
        {
            int y=stk[top--];
            return y;
        }
    }
    public void display()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else
        {
            System.out.println("Stack elements -> ");
            for(int i=top; i>=0; i--)
            {
                System.out.println(stk[i]);
            }
        }
    }
    public int size()
    {
        if(top==-1)
            return 0;
        else
            return top+1;
    }
    public int peek()
    {
        if(top==-1)
            return -999;
        else
            return stk[top];
    }
}

public class StackDemo 
{
    public static void main(String args[])
    {
        int ch,x;
        System.out.print("Enter size of stack : ");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        StackTest s = new StackTest(size);
        do
        {
            System.out.println("1. Initialization \n2. Push \n3. Pop \n4. Display");
            System.out.println("5. Underflow \n6. Overflow  \n7. Size \n8. Peek\n0. Exit");
            System.out.print("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    s.init();
                    System.out.println("Stack is initialized");
                    break;
                    
                case 2:
                    System.out.print("Enter element to insert in stack : ");
                    x=sc.nextInt();
                    s.push(x);
                    break;
                    
                case 3:
                    int res=s.pop();
                    if(res==-999)
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Popped element = "+res);
                    break;
                    
                case 4:
                    s.display();
                    break;
                    
                case 5:
                    s.underflow();
                    break;
                    
                case 6:
                    s.overflow();
                    break;
                
                case 7:
                    System.out.println("Stack size = "+s.size());
                    break;
                    
                case 8:
                    res=s.peek();
                    if(res==-999)
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Stack peek = "+res);
                    break;
                    
                case 0:
                    System.out.println("We are exiting!");
                    break;
                    
                default:
                    System.out.println("Wrong choice:( Please try again!");
            }
        }while(ch!=0);
    }
}