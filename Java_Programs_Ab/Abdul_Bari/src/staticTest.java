class outer1
{
    public static int y=20; 
    public static void display()
    {
        System.out.println("y = "+y); 
    }
}
public class staticTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer1 o = new outer1();
        o.display();
        int n,m;
        String s,l;
    }
    
    
}