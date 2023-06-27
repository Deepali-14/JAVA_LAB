import java.util.*;

class Hello
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("May I know your name?");
		String name = sc.nextLine();
		System.out.println("Welcome "+name+" !");
	}
}