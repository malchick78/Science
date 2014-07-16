
/* Catalan.java
 * Contains 2 methods: factorial and catalan
 * 
 * catalan calculates the n-th Catalan number 
 * factorial calculates the factorial recursively

 * Receive: n
 * Return: n-th catalan number
 *****************************************************************/

public class Catalan
{
  /**
     The factorial method recursively computes the factorial
     of a positive integer.
     @param n Specifies the integer value received.
     @return The factorial value.
  */
  
  private static long factorial(int n)
  {
      if (n == 0 || n == 1) // base cases
          return 1;
      else 
          return (long)(factorial(n-1) * n); // recursive cases
  }
  
  /**
     The catalan method calculates the n-th Catalan number
     by using the factorial method to compute the binomial 
     coefficient part of the formula.
     @param n Specifies the integer value received.
     @return The n-th Catalan number.
  */
  
  public static long catalan(int n)
  {
      double cat; // the Catalan number to be returned

      if (n == 0 || n == 1) 
          return 1;

      else 
      {
          cat = (1/(double)(n+1)) * factorial(2*n) / (factorial(n)
                 * factorial(n)); // the Catalan formula
          return (long)cat;
      }
  }
}
