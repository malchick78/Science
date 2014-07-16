/**
 * This program tests a hierarchy of the GeometricFigure classes.
 *
 * File name: Combinations.java
 *
 * Input:  two integers
 *
 * Output: number of combinations
 *
 * Author: Krzysztof Krakowski, October 2010
 *
 ********************************************************************/

import java.util.Scanner;	// Needed for the Scanner class
import java.util.*;			// Stack class

/**
 *   This program consist of a number classes
 */
 
public class Combinations
{
	public static void main(String[] args)
        {
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		// we store the board in an array
		
		// output purpose of the program 
		System.out.println( "This program calculates the number of m-combinations\n"
			+ "from a collection of n items." );
				
		// read the numbers
		System.out.print("\nEnter two numbers, n m (n >= m >= 0): ");
		int n = keyboard.nextInt();
 		int m = keyboard.nextInt();
							
		System.out.println("The number of combinations "
			+ "C(" + n + "," + m + ") = " + Comb(n,m) + " ?=? " + RecursiveComb(n,m) );
			
	} // end of main

	/**
	 * RecursiveComb: computes C(n, m) assuming 0 <= m <= n and n <= 1
	 */
	private static int RecursiveComb(int n, int m)
	{
		if ((n == 1) || (m == 0) || (m == n))
			return 1;
		else
			return RecursiveComb(n-1, m) + RecursiveComb(n-1, m-1);
	} // RecursiveComb
	
	
	
	/**
	 * Comb: computes C(n, m) assuming 0 <= m <= n and n <= 1 with a stack
	 */
	public static int Comb(int n, int m)
	{
		Stack<Active> stack = new Stack<Active>();
		Active topmost = new Active(n, m);
		
		stack.push( topmost );
		
		while ( !stack.empty() )
		{
			topmost = stack.pop();
                        //System.out.println("--> poping " + topmost.n + "," + topmost.m);
			if (topmost.result > 0)			// the reult in known
			{
                          //System.out.println("topmost.result is > 0");
				if (stack.empty()) {
                                   //System.out.println("Stack empty - breaking..."); 
					break;
                                }
                                //System.out.println("Stack not empty.");
				Active last = stack.pop();
                                //System.out.println("--> poping " + last.n + "," + last.m);
				
				if (last.result > 0)
				{
                                        //System.out.println("Accumulating results");
					stack.peek().result = last.result + topmost.result;
				}
				else						// swap them
				{
					stack.push(topmost);
					stack.push(last);
                                        //System.out.println("<-> swapping");
				}
			}
			else							// the result needs to be evaluated
			{
                                //System.out.println("topmost.result = 0");
				stack.push(topmost);
                                //System.out.println("--> pushing " + topmost.n + "," + topmost.m);
				if ((topmost.n == 1) || (topmost.m == 0) || (topmost.m == topmost.n))
				{
                                   //System.out.println("setting topmost.result = 1");
                                   topmost.result = 1;
                                }
				else
				{
                                        //System.out.println("Not a base case.");
					stack.push(new Active(topmost.n-1, topmost.m));
                                        //System.out.println("--> pushing " + (topmost.n-1) + "," + topmost.m);
					stack.push(new Active(topmost.n-1, topmost.m-1));
                                        //System.out.println("--> pushing " + (topmost.n-1) + "," + (topmost.m-1));
				}
			}
		}
               
		return topmost.result;
		
	} // Comb
	
} // end of class Combinations

class Active
{
	int n, m, result;
	
	public Active(int n, int m)
	{
		this.n = n;
		this.m = m;
		result = 0;	
	}	
} // Active
