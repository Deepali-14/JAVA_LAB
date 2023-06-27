/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Account {

    /**
     * @param args the command line arguments
     */
    int accno;
    String accname;
    int accamt;
    
    void getdata()
    {
	Scanner sc = new Scanner(System.in);
        
	System.out.println("Reading Record :");
	
	System.out.println("Enter account number : ");
	accno=sc.nextInt();
	
	System.out.println("Enter account holder's name : ");
        sc.nextLine();
	accname=sc.nextLine();
	
	accamt=0;
    }

    void showdata()
    {
	System.out.println("Showing Record : ");
	
	System.out.println("Account Holder's name : "+accname);
	System.out.println("Account number : "+accno);
        System.out.println("Account Balance : "+accamt);

    }
    
    void deposit(int tempamt)
    {
        accamt=accamt+tempamt;
    }

    void withdraw(int tempamt)
    {
        if(tempamt > accamt)
        {
            System.out.println("Insuficient balance");
            return;
        }

        accamt=accamt-tempamt;
    }

    void balance()
    {
        System.out.println("Your current updated account balance is : Rs."+accamt);
    }
    
    int searchdata(int tempaccno)
    {
	if(accno==tempaccno)
		return 1;

	else
		return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Account a[] = new Account[5];
        int ch;
        do
        {
            System.out.println("1. Initialise \n2. Display \n3. Deposit \n4. Withdraw \n5. Balance \n0. Exit");
            System.out.println("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    for(int i=0; i<5; i++)
                    {
                        a[i] = new Account();
                        a[i].getdata();
                    }
                    break;
                case 2:
                    for(int i=0; i<5; i++)
                    {
                        a[i].showdata();
                    }
                    break;
                case 3:
                    int k=0;
                    System.out.println("Enter account number to deposit in : ");
                    int acn=sc.nextInt();
                    System.out.println("Enter amount to be deposit in : ");
                    int n=sc.nextInt();
                    for(int i=0; i<5; i++)
                    {
                        k=a[i].searchdata(acn);
                        if(k==1)
                        {
                            a[i].deposit(n);
                            break;
                        }
                    }	
                    if(k!=1)
                        System.out.println("Account not found");
                    break;
                case 4:
                    k=0;
                    System.out.println("Enter account number to withdraw from : ");
                    acn=sc.nextInt();
                    System.out.println("Enter amount to withdraw : ");
                    n=sc.nextInt();
                    for(int i=0; i<5; i++)
                    {
                        k=a[i].searchdata(acn);
                        if(k==1)
                        {
                            a[i].withdraw(n);
                            break;
                        }
                    }	
                    if(k!=1)
                        System.out.println("Account not found");
                    break;
                case 5:
                    k=0;
                    System.out.println("Enter account number to show balance of : ");
                    acn=sc.nextInt();
                    for(int i=0; i<5; i++)
                    {
                        k=a[i].searchdata(acn);
                        if(k==1)
                        {
                            a[i].balance();
                            break;
                        }
                    }	
                    if(k!=1)
                        System.out.println("Account not found");
                    break;
                case 0: 
                    System.out.println("We are Exiing :)");
                    break;
                default:
                    System.out.println("Wrong choice entered");
            }
        }while(ch!=0);
    }
    
}
