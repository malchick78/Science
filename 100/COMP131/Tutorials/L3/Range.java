import java.util.Scanner;

public class Range
{
   // main method begins program execution
   public static void main( String args[] )
   { 
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      // prompt for an input integer number
      System.out.println( "Please enter a number within the range 1 <= x <= 100:" );
      int x = input.nextInt(); // read in an integer value

	  
      //use logical operator to check the range
	  
      /*if ( 1 <= x && x <= 100 )
         System.out.println("The value entered is with the range ");
      else
         System.out.println("The value entered is NOT with the range ");*/ 
		 
	  if ( !( x < 1 || x > 100 ) )
         System.out.println("The value entered is with the range ");
      else
         System.out.println("The value entered is NOT with the range ");

   } // end main

} // end class Range

