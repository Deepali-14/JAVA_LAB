public class A_Pattern3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
        for(int i=1; i<=5; i++)
        {
            for(int s=1; s<=5-i; s++)
            {
                System.out.print(" ");
            }
            while(k!=2*i-1)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
