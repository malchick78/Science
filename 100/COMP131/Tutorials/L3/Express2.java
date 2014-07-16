/**
 * Express2.java provides a 'laboratory' for exploring Java expressions.
 *
 **********************************************************************/

public class Express2
{ 
   public static void main(String[] args)
   {

      System.out.print("Verify Operator Precedence of ");
      System.out.println("the expression:  16 + 8 / 4");
      System.out.println( 16 + 8 / 4 );
	  
	  System.out.print("\nVerify Operator Precedence of ");
      System.out.println("the expression:  ((9-1) * (1+1))");
	  System.out.println( ((9-1) * (1+1)) );
	  
	  System.out.print("\nVerify Operator Associativity of ");
      System.out.println("the expression:  8 - 4 - 2");
	  System.out.println( 8 - 4 - 2 );
	  
	  System.out.print("\nVerify Operator Associativity of ");
      System.out.println("the expression:  8 / 4 / 2");
	  System.out.println( 8 / 4 / 2 );

   }
}

