import java.lang.*;
class A_Pattern3
{
	
	public static void main(String[] args)
	{
	int k=0;
        for(int i=1; i<=5; i++,k=0)
        {
            for(int s=1; s<=5-i; s++)
            {
                System.out.print(" ");
            }
            while(k!=2*i-1)
            {
                System.out.print("*");
		k++;
            }
            System.out.println("");
        }
	int space = 1;
   	for(int i=1; i<=(5-1); i++)
    	{
            for(int j=1; j<=space; j++)
            	System.out.print(" ");
            space++;
       	    for(int j=1; j<=(2*(5-i)-1); j++)
            	System.out.print("*");
            System.out.println(" ");
    	}
    	System.out.println(" ");
	
    }
    
}
