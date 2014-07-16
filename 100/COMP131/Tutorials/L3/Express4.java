/**
 * Express3.java provides a 'laboratory' for exploring Java expressions.
 *
 **********************************************************************/

public class Express4
{ 
   public static void main(String[] args)
   {
      int w, x, y, z;
      w = 8;
      x = 4;
      y = 2;
      z = 1;

      w -= x /= y *= z += 1;
	  
      System.out.print("Verify Assignment Associativity of ");
      System.out.println("the expression:  w -= x /= y *= z += 1");
      System.out.printf( "w = %d, x = %d, y = %d, z = %d\n", w, x, y, z);
   }
}

