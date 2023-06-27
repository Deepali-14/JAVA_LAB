public class StringBufferTest 
{
    public static void main(String[] args)
    {
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println("Original String is "+sb);
        sb.append("Java");
        System.out.println("Concatenated String is "+sb);
        sb.insert(1, "ii! H");
        System.out.println("New string after inserting : "+sb);
        sb.replace(1,3,"ello");
        System.out.println("New string after replacing : "+sb);
        sb.delete(7,13);
        System.out.println("String after deleting : "+sb);
        System.out.println("Length of new string : "+sb.length());
        sb.append(". You are my favourite language!");
        System.out.println("New string after appending : "+sb);
        System.out.println("Capacity of new string : "+sb.capacity());
        sb.reverse();
        System.out.println("New string after reversing : "+sb);
    }
    
}
