import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner (System.in);
	System.out.print("Enter an integer that is greater than or equal to 0:  ");		
	
	int input = keyboard.nextInt();
	int fibAnswer = Fib(input);
	int fibItAnswer = fibIt(input);
	
	System.out.println(" ");	
	System.out.println("Using recursion:");
	System.out.println("Fib(" + input + ") returns " + fibAnswer);
	   
	System.out.println(" ");	
	System.out.println("Using iteration:");
	System.out.println("Fib(" + input + ") returns " + fibItAnswer);
	}
	
	public static int Fib(int n)
	{	
		if (n == 0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			return Fib(n-1) + Fib(n-2);
		}
	}
	
	public static int fibIt(int n)
	{
		int sum = 0; // the value to be returned
		int n_minus_1 = 1; // set the n-1 value initially to 1
		int n_minus_2 = 0; // set the n-2 value initially to 0
		
		if (n == 0)
			sum = 0;
			
		else if (n == 1)
			sum = 1;
		
		else
			for (int index = 1; index < n; index++)
			{
				sum = n_minus_1 + n_minus_2;
				n_minus_2 = n_minus_1;
				n_minus_1 = sum;
			}
		return sum;
	}
}