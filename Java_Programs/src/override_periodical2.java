class Parent
{ 
    void show(String s) 
    { 
        System.out.println(s); 
    } 
} 
  
// Inherited class 
class Child extends Parent 
{ 
    void show(String m) 
    { 
        super.show("Hello"); 
        System.out.println(m); 
    } 
} 
  
// Driver class 
public class override_periodical2 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Parent obj = new Child(); 
        obj.show("Deepali");
    }
    
}
