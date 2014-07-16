import java.util.Scanner;

public class Progression
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner (System.in);
    System.out.println(
      "This program will calculate the geometric and ");
    System.out.println(
      "harmonic progression for the number you enter.");
    System.out.print(
      "Enter an integer that is greater than or equal to 1:  ");		
	
    int input = keyboard.nextInt();
    int geomAnswer = geometricRecursive (input);
    double harmAnswer = harmonicRecursive (input);
		
    System.out.println("Using recursion:");
    System.out.println("The geometric progression of " + input + " is " + geomAnswer);
    System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
		
    geomAnswer = geometricIterative (input);
	harmAnswer = harmonicIterative (input);
	
    System.out.println("Using iteration:");
    System.out.println("The geometric progression of " + input + " is " + geomAnswer);
	System.out.println("The harmonic progression of " + input + " is " + harmAnswer);
	}
	
	public static int geometricRecursive (int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return (geometricRecursive(n-1) * n);
		}
	}
	
	public static int geometricIterative (int n)
	{
		int product = 1;
		for (int index = 1; index <= n; index++)
		{
			product = product * index;
		}
		return product;
	}
	
	public static double harmonicRecursive (int n)
	{
			if (n == 0)
		{
			return 1;
		}
		else
		{
			return (harmonicRecursive(n-1) / (double)n);
		}
	}
	
	public static double harmonicIterative (int n)
	{
		double product = 1;
		for (int index = 1; index <= n; index++)
		{
			product = product /(double)index;
		}
		return product;
	}
	
}