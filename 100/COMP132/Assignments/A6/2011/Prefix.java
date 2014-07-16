/**
 * This program calculates simple arithmetic expressions in the prefix notation.
 *
 * File name: Prefix.java
 *
 * Input:  arithmetic expressions in the prefix notation
 *
 * Output: the resul
 *
 * Author: Krzysztof Krakowski, October 2010
 *
 ********************************************************************/

import java.util.Scanner;	// Needed for the Scanner class
import java.util.*;			// Stack class

/**
 *   This program consist of a number classes
 */
 
public class Prefix
{
	public static void main(String[] args)
	{	
		// Create a Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		// we store the board in an array
		
		// output purpose of the program 
		System.out.println( "This program evaluates arithmetic prefix expressions." );
				
		// read the numbers
		System.out.print("\nEnter a prefix expression: ");
		String line = keyboard.nextLine();
		
		PrefixTree prefix = new PrefixTree( line );
		
		System.out.println("The value of: " + prefix + "is " + prefix.valueOf() );
		
//		Scanner entry = new Scanner( line );
//		while (entry.hasNext())
//		{
//			if (entry.hasNextInt())
//			{
//				System.out.println("The number you entered is: "
//					+ entry.nextInt() );
//			}
//			else
//				System.out.println("Not a number: " + entry.next() );
//		}
		
	} // end of main
}

class PrefixTree
{
	enum Operator { None, Plus, Minus, Times, Divide, Error };
	Node root;
	
	class Node
	{
		public Node left, right;
		public int value;
		public Operator op;
		
		Node(int value, Operator op, Node left, Node right)
		{	
			this.left = left;
			this.right = right;
			this.op = op;
			this.value = value;
		}
		
		Node(int value)
		{	
			this(value, Operator.None, null, null);
		}
		
		Node(Operator op, Node left, Node right)
		{	
			this(0, op, left, right);
		}
		
		private String toString(Operator op)
		{
			switch( op )
			{
				case None: return "NOP";
				case Plus: return "+";
				case Minus: return "-";
				case Times: return "*";
				case Divide: return "/";
				default: return "ERROR";
			}
		}
		
		public String toString()
		{
			if (op == Operator.None)
				return String.valueOf( value );
			return toString( op );
		}
	}
	
	
	PrefixTree(String line)
	{
		Scanner entry = new Scanner( line );
		root = ParsePrefix(entry);
	}
	
	
	Node ParsePrefix(Scanner entry)
	{
		if (entry.hasNext())
		{
			if (entry.hasNextInt())		// this is a leaf of the tree
				return new Node(entry.nextInt());
			else						// check for the operator
			{
				Operator binary;
				String word = entry.next();
				if ( word.equals("+") )
					binary = Operator.Plus;
				else if ( word.equals("-") )
					binary = Operator.Minus;
				else if ( word.equals("*") )
					binary = Operator.Times;
				else if ( word.equals("/") )
					binary = Operator.Divide;
				else
					binary = Operator.Error;
				
				return new Node(binary, ParsePrefix( entry ), ParsePrefix( entry ));
			}
		}
		else
			return null;				// end of input
	}
	
	public String toString()
	{
		return toString(root);	
	}
	
	private String toString(Node node)
	{
		String result = "";					// we build the string recursively
		if ( node != null )
		{
			result = ( (node.left != null) ? "( " : "" )
				+ toString( node.left )
				+ node + " "
				+ toString( node.right )
				+ ( (node.right != null) ? ") " : "" );
		}
		return result;
	}
	
	public int valueOf()
	{
		return valueOf(root);	
	}
	
	private int valueOf(Node node)
	{
		if ( node != null )				// we evaluate the tree recursively
		{
			int left = valueOf( node.left );
			int right = valueOf( node.right );
			
			switch( node.op )
			{
				case None: return node.value;
				case Plus: return left + right;
				case Minus: return left - right;
				case Times: return left * right;
				case Divide: return left / right;
			}	
		}
		return 0;
	}
}
