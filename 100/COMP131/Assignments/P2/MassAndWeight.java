/*********************************************************************
   MassAndWeight.java computes the weight of an object and checks
   whether it falls between a specified range.
   
   Input: Mass (kg) 
   Output: Weight (N)
 *********************************************************************/
 
 import java.util.Scanner;
 
 public class MassAndWeight
{ 
	// main method begins program execution
	public static void main(String[] args)
	{  
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
	  
		// variable declarations
		double mass, weight;
	  
		// prompt user to input a number
		System.out.print( "Enter the object's mass: " );
		
		// get input from user and store it in mass variable
		mass = input.nextDouble(); 
	  
		// calculations
		weight = mass * 9.8;
	  
		// use logical operator to check valid range and output message
		// to the user with computed weight value
		if ( 20 <= weight && weight <= 2000 )
			System.out.println( "The object's weight is " + weight + 
			" Newtons." );
			
		else if ( weight < 20 )
				System.out.println( "The object is too light.");
			
			 else
				System.out.println( "The object is too heavy.");
	}
}