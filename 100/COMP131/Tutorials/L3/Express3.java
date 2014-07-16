/**
 * Express3.java provides a 'laboratory' for exploring Java expressions.
 *
 **********************************************************************/

public class Express3
{ 
   public static void main(String[] args)
   {
      int w, x, y, z;
      w = 1;
      x = 2;
      y = 4;
      z = 8;

      w = x = y = z;
	  
      System.out.print("Verify Assignment Associativity of ");
      System.out.println("the expression: w = x = y = z");
      System.out.printf( "w = %d, x = %d, y = %d, z = %d\n", w, x, y, z);
   }
}

