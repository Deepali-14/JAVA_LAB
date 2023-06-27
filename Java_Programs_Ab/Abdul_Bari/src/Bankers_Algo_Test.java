import java.util.Scanner;


class BankersAlgorithm
{
    // declaring no. of processes and resource types
    public int m,n;
    
    
    // declaring different matrices both 1D and 2D as per requirement
    public int[] finish =  new int [10],available = new int [10];
    public int[][] allocation = new int [10][10],max = new int [10][10],need = new int [10][10];
    
    
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("\nEnter number of processes : ");
        m = sc.nextInt();
        
        System.out.print("\nEnter type of resources needed : ");
        n = sc.nextInt();  
        
        
        // initializing finish array to false (here 0) to indicate none of the process has been finished yet
        for(int i=0; i<m; i++)
            finish[i]=0;
        
        
        // initializing available matrix with the no. of different types of resources and their instances currently available
        System.out.println("\nEnter available resources with their instances -> ");
        System.out.println("\nEnter available matrix -> ");
        for(int i=0; i<n; i++)
        {
            System.out.print("\nEnter available number of instances of resource "+i+" : ");
            available[i]=sc.nextInt();
        }
        
        
        // initialzing type of resources with the instances currently allocated to different processes
        System.out.println("\nEnter allocation matrix -> ");
        for(int i=0; i<m; i++)
        {
            System.out.println("\nProcess "+i+" -> ");
            for(int j=0; j<n; j++)
            {
       
                System.out.print("\nEnter number of available instances of resource "+j+" : ");
                allocation[i][j]=sc.nextInt();
            }
        }
        
        
        // initializing the maximum type of resouce instances needed by each process
        System.out.println("\nEnter max matrix -> ");
        for(int i=0; i<m; i++)
        {
            System.out.println("\nProcess "+i+" -> ");
            for(int j=0; j<n; j++)
            {
                System.out.print("\nEnter number of maximum needed instances of resource "+j+" : ");
                max[i][j]=sc.nextInt();
            }
        }
        
    } 
    
    
    
    public void putdata()
    {
        // displaying finish matrix
        System.out.println("\nFinish matrix -> ");
        for(int i=0; i<m; i++)
            System.out.println(" P"+i+" "+finish[i]);
        
        
        // displaying allocation matrix
        System.out.println("\nAllocation matrix -> ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(" "+allocation[i][j]);
            }
            System.out.println();
        }
        
        // displaying max matrix
        System.out.println("\nMax matrix -> ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(" "+max[i][j]);
            }
            System.out.println();
        }
        
        
        // displaying need matrix
        System.out.println("\nNeed matrix -> ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                need[i][j]=max[i][j]-allocation[i][j];
                System.out.print(" "+need[i][j]);
            }
            System.out.println();
        }
        
        
        // displaying available matrix
        System.out.println("\nAvailable matrix -> ");
        for(int i=0; i<n; i++)
        {
            System.out.print(" "+available[i]);
        }
        System.out.println();
    }
    
    
    
    public int[] bankersalgo()
    {
        int i=0,flag=0,l=0,count=0,flag1=0;
        
        
        // declaring result matrix to store the sequence in which the way the processes are to be executed to prevent deadlock
        int res[]=new int[m];
        
        
        
        while(i<m) // to counter every process
        {
            for(int j=0; j<n; j++)  // to counter every processes instance of each resource
            {
                if(finish[i]==0) // to check if it has not finished yet
                {
                    if((need[i][j]<available[j] || need[i][j]==available[j])) // to check if the available resources can satisfy the need of the current process
                    { 
                        flag++; // to check if all the instance are getting satisfied of need by available matrix
                    }
                }
            }
            
            
            
            if(flag==n) // to check if all the instances are satified of need by available matrix
            {
                /* to add back the allocated  matrix once the process has finished execution
                   to available matrix*/
                for(int j=0; j<n; j++) 
                {
                    count++;
                    if(count==1) // to run the loop only once so that the matrices do not get distorted
                    {
                        finish[i]=1;
                        res[l++]=i;
                    }   
                    available[j]=available[j]+allocation[i][j]; // addition 
                    if(j==n-1)
                    {
                        i=0;   // logic to take back us to the starting process to check if now available matrix can satify the need of it
                        flag1=1;  // to not increase i and easily take back it to previous process
                    }
                }
            }
            
            
            
            if(flag1==0)
            {
                i++;  // if not satisfied in 149th and 151th line increase i to check rest process need
            }
            
            
            // for another iteration of checking need 
            flag=0;
            flag1=0;
            count=0;
        }
        
        
        
        // displaying available matrix at the end of finishing execution of each process
        System.out.println("\nAvailable matrix at the end -> ");
        for(int k=0; k<n; k++)
        {
            System.out.print(" "+available[k]);
        }
        System.out.println();
        
        
        // returning result matrix
        return res;
    }
}


public class Bankers_Algo_Test {
    public static void main(String args[])
    {
        // Executable class
        System.out.println("\n***************** MADE BY DEEPALI(2016736) ******************");
        System.out.println("\n***************** BANKER'S ALGORITHM IMPLEMENTATION ****************");
        
        
        // declaring object of BankersAlgorithm class
        BankersAlgorithm b = new BankersAlgorithm();
        
        
        // calling different functions to get and display data
        b.getdata();
        b.putdata();
        
        
        // declaring result matrix to hold the result returned by bankersalgo function
        int res[];
        res=b.bankersalgo();
        
        
        // to display the safe state safe sequence
        System.out.println("\nSafe state sequence -> ");
        for(int k=0; k<b.m-1; k++)
        {
            System.out.print(" P"+res[k]+" ->");
        }
        System.out.print(" P"+res[b.m-1]);
        System.out.println();   
    }   
}
