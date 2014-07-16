
/* CatalanDemo.java
 * Demonstrates the Catalan class.
 * Calculates the value of a specific Catalan number.
 *
 * Input: integer value
 * Output: n-th Catalan number
 ********************************************************************/

import java.util.Scanner;

public class CatalanDemo
{
  public static void main(String[] args)
  {
      // Create Scanner object for keyboard input.
      Scanner keyboard = new Scanner (System.in); 

      // Get the first number from the user.
      System.out.println("Which catalan number do you " +
                         "want to calculate (-1 to stop): ");
      int input = keyboard.nextInt();  

      // Validate the number entered. Input -1 to exit program. 
      while (input != -1)
      {
          if (input > -1)
          {
              // Variable declaration and method call. 
              long catAnswer = Catalan.catalan(input); 

              // Display the results.
              System.out.println("n = " + input + ": catalan number is " 
                                 + catAnswer);

              // User prompt to continually enter a number.
              System.out.println("Which catalan number do you want to "
                                 + "calculate (-1 to stop): ");
              input = keyboard.nextInt();
          }

          else
          {
              // Display invalid input message.
              System.out.println("Invalid input:");
              System.out.println("Valid input range is an input >= 0\n");

              // User prompt to continually enter a number.
              System.out.println("Which catalan number do you want to "
                                 + "calculate (-1 to stop): ");
              input = keyboard.nextInt();
          }
      }
  }
}