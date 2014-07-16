public class Nov10 
{
	public static void main(String[] args)
	{
		message(10);
		
	}
	
	public static void message(int n)
	{
		if (n > 0)
		{
			System.out.println("Print this line. \n");
			message(n + 1);
		}	
	}
		
}