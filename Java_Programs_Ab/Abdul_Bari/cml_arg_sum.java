import java.lang.*;
class cml_arg_sum
{
public static void main(String[] args){
double sum=0;
for(String i:args)
{
if(i.matches("[0-9\\.]+"))//if a is or any string is there it throws an exception
sum=sum+Double.parseDouble(i);
}
System.out.println("Sum is :"+sum);
}
}