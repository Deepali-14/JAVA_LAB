class Demo
{
	public static void main(String args[])
	{
		int mul=1;
		for(int i=0; i<args.length; i++)
		{
			int a=Integer.parseInt(args[i]);
			mul=mul*a;
		}
		System.out.println("Multiplcation = "+mul);
	}
}