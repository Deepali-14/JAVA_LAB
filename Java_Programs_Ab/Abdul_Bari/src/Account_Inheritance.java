/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Account_a
{
    public String Name;
    public String Accno;
    public String Phnno;
    public String Dob;
    public int Balance;
    public Account_a(String nm, String ano, String ph, String dob)
    {
        Name=nm;
        Accno=ano;
        Phnno=ph;
        Dob=dob;
        Balance=0;
    }
}
class savingsAccount extends Account_a
{
    public void deposit(int amt)
    {
        Balance=Balance+amt;
    }
    public void withdraw(int amt)
    {
        if(amt>Balance)
            System.out.println("Insufficient balance for withdrawal");
        else
            Balance=Balance-amt;
    }
    public void balanceCheck()
    {
        System.out.println("Balance in your account is : "+Balance);
    }
}
class loansAccount extends Account_a
{
    public void payloan(int amt)
    {
        if(Balance<amt)
            System.out.println("Insufficient balance to pay loan");
        else
            Balance=Balance-amt;
    }
    public void balanceCheck()
    {
        System.out.println("Balance in your account is : "+Balance);
    }
}
public class Account_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account_a a = new Account_a("Deepali","12345","9814117751","14/11/2001");
        savingsAccount s = new savingsAccount();
        loansAccount l = new loansAccount();
        s.deposit(5000);
        s.withdraw(2000);
        s.balanceCheck();
        l.payloan(10000);
        l.balanceCheck();
    }
    
}
