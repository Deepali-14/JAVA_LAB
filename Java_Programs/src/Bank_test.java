import java.util.Scanner;
abstract class Account
{
    public String name;
    public int acc_no;
    public static int count=1000;
    public String type;
    public float amt;
    
    abstract public void input();
    abstract public void output();
}

class SavingsAccount extends Account
{
    public float r;
    public float t;
    public String ctype;
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of account holder : ");
        name=sc.nextLine();
        acc_no=count++;
        amt=0f;
        System.out.print("Enter value of rate : ");
        r=sc.nextFloat();
        System.out.print("Enter value of years : ");
        t=sc.nextFloat();
        System.out.print("Enter compound interest type(Half yearly/Full yearly) : ");
        sc.nextLine();
        ctype=sc.nextLine();
    }
    
    public void output()
    {
        System.out.println(name+"\t"+acc_no+"\t"+amt+"\n");
    }
    
    public void comp_interest()
    {
        if("Half yearly".equals(ctype))
            amt = amt + (float) Math.pow(1+(r/200)*amt,(2*t));
        else if("Full yearly".equals(ctype))
            amt = amt + (float) Math.pow((1+(r/100)*amt),t);
    }
    public void deposit(float a)
    {
        amt=amt+a;
    }
    public void withdrawal(float a)
    {
        if(a>amt)
            System.out.println("Insufficient Balance");
        else
            amt=amt-a;
    }
    public int search(int tmpacc)
    {
        if(tmpacc==acc_no)
            return 1;
        else
            return 0;
    }
}

class CurrentAccount extends Account
{
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of account holder : ");
        name=sc.nextLine();
        acc_no=count++;
        amt=1000f;
    }
    
    public void output()
    {
        System.out.println(name+"\t"+acc_no+"\t"+amt+"\n");
    }
    public void deposit(float a)
    {
        amt=amt+a;
        if(amt<1000)
        {
            System.out.println("Limit of minimum balance crossed");
            System.out.println("You got a fine of 50.50 rupees. Please check your balance!");
            amt=amt-50.50f;
        }
        else
            System.out.println("Your minimum balance is maintained");
    }
    public void withdrawal(float a)
    {
        if(a>amt)
            System.out.println("Insufficient Balance");
        else
            amt=amt-a;
        if(amt<1000)
        {
            System.out.println("Limit of minimum balance crossed");
            System.out.println("You got a fine of 50.50 rupees. Please check your balance!");
            amt=amt-50.50f;
        }
        else
            System.out.println("Your minimum balance is maintained");
    }
    public int search(int tmpacc)
    {
        if(tmpacc==acc_no)
            return 1;
        else
            return 0;
    }
}
public class Bank_test {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of savings account you want to make : ");
        int m=sc.nextInt();
        System.out.print("Enter no. of current account you want to make : ");
        int n=sc.nextInt();
        
        SavingsAccount s[] = new SavingsAccount[m];
        CurrentAccount c[] = new CurrentAccount[n];
        
        System.out.print("\n******* Enter savings account detail *******\n");
        for(int i=0; i<m; i++)
        {
            s[i] = new SavingsAccount();
            s[i].input();
        }
        
        System.out.print("\n******* Enter current account detail *******\n");
        for(int i=0; i<m; i++)
        {
            c[i] = new CurrentAccount();
            c[i].input();
        }
        
        int ch, chc, temp_acc, r, flag=0;
        float temp_amt;
        do
        {
            System.out.print("Enter 1 if Savings account and 2 if Current account and 0 to exit : ");
            ch=sc.nextInt();
            if(ch==1)
            {
                flag=0;
                System.out.println("1. Compound Interest \n2. Deposit \n3. Withdraw \n4. Balance \n5. Exit");
                System.out.print("Enter your choice : ");
                chc=sc.nextInt();
                switch(chc)
                {
                    case 1:
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<m; i++)
                        {
                            r=s[i].search(temp_acc);
                            if(r==1)
                            {
                                s[i].comp_interest();
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                        
                    case 2:
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<m; i++)
                        {
                            r=s[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Enter amount you want to deposit : ");
                                temp_amt=sc.nextFloat();
                                s[i].deposit(temp_amt);
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                    
                    case 3:
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<m; i++)
                        {
                            r=s[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Enter amount you want to withdraw : ");
                                temp_amt=sc.nextFloat();
                                s[i].withdrawal(temp_amt);
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                        
                    case 4: 
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<m; i++)
                        {
                            r=s[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Name\tAccount No.\tAmount\n");
                                s[i].output();
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                        
                    case 5:
                        System.out.println("We are exiting!!");
                        break;
                    
                    default:
                        System.out.println("Wrong choice!  Please Try again:(");
                }
            }
            else if(ch==2)
            {
                flag=0;
                System.out.println("1. Deposit \n2. Withdraw \n3. Balance \n4. Exit");
                System.out.print("Enter your choice : ");
                chc=sc.nextInt();
                switch(chc)
                {
                    case 1:
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<n; i++)
                        {
                            r=c[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Enter amount you want to deposit : ");
                                temp_amt=sc.nextFloat();
                                c[i].deposit(temp_amt);
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                    
                    case 2:
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<n; i++)
                        {
                            r=c[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Enter amount you want to withdraw : ");
                                temp_amt=sc.nextFloat();
                                c[i].withdrawal(temp_amt);
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                        
                    case 3: 
                        System.out.print("Enter account number : ");
                        temp_acc=sc.nextInt();
                        for(int i=0; i<n; i++)
                        {
                            r=c[i].search(temp_acc);
                            if(r==1)
                            {
                                System.out.println("Name\tAccount No.\tAmount\n");
                                c[i].output();
                                flag=1;
                                break;
                            }
                            
                        }
                        
                        if(flag==0)
                            System.out.println("Account not found!");
                        break;
                        
                    case 4:
                        System.out.println("We are exiting!!");
                        break;
                    
                    default:
                        System.out.println("Wrong choice!  Please Try again:(");
                }
            }
            
            else
                System.out.println("Wrong choice!  Please Try again:(");
        }while(ch!=0);
    }
}
