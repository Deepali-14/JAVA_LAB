import java.lang.*;

class Profit_loss
{
	public static void main(String args[])
	{
		float cp=223.77f, sp=223.77f;
		if(cp>sp)
			System.out.println("Loss");
		else if(sp>cp)
			System.out.println("Profit");
		else
			System.out.println("No Profit no Loss");
	}
}