import java.util.*;

/** 
   This program demonstrates how an infix expression is converted to 
   postfix notation using a generic implementation of a linked stack.
*/

public class InfixToPostfixConverter 
{	
    public static void main(String[] args)
    {
	String input;
		
     	// Create Scanner object for keyboard input.
	Scanner keyboard = new Scanner(System.in);
	
	// User prompt to enter an arithmetic expression.
	System.out.println("Please enter an infix expression: ");
	
	// Read the expression entered and store in input.
	input = keyboard.nextLine();

	// Create a StringBuffer object to hold the infix expression.
	StringBuffer infix = new StringBuffer(input);
	
	// Display the infix.
	System.out.println("\nThe original infix expression is: \n" + infix);

	// Perform the conversion and display the postfix.
	convertToPostfix(infix);
    }
    
    /**
       The convertToInfix method converts an infix expression to postfix
       notation.
       @param inf The infix expression to convert.
       @return The expression converted to postfix notation.
    */
	
    public static StringBuffer convertToPostfix(StringBuffer inf)
    {
	// Create a linked stack that can hold Character objects.
	GenericLinkedStack<Character> stack = new GenericLinkedStack<Character>();
	
	// Create a StringBuffer object to hold the postfix expression.
	StringBuffer postfix = new StringBuffer();
	
	// Push a left parenthesis onto the stack.
	stack.push('(');
	
	// Append a right parenthesis to the end of the infix.
	inf.append(")");
	
	// Create an array called current to hold the infix characters.
	char[] current = new char[inf.length()];

	// The conversion algorithm.
	for (int index = 0; index < inf.length(); index++)
	{
	    // Store each infix character in the current array.
	    current[index] = inf.charAt(index);

	    // If the current character is a digit, append it to the postfix.
	    if (Character.isDigit(current[index]))
		postfix.append(current[index]);
	    
	    // If the current character is a left parenthesis, push it onto the 
	    // stack.
	    else if (current[index] == '(')
		stack.push(current[index]);
				
	    // If the current character is an operator,
	    else if (isOperator(current[index]))
	    {			
		// While the current operator has lower or equal precedence than
		// the operator at the top of the stack, pop operators from the
		// stack and append them to the postfix.
		while (precedence(current[index], stack.peek()))
		    postfix.append(stack.pop());
		
		// Push the current operator onto the stack.
		stack.push(current[index]);
	    }
    
	    // If the character is a right parenthesis, 
	    else if (current[index] == ')')
	    {  
		// While the top of the stack is not a left parenthesis, pop 
		// operators from the stack and append them to the postfix.
		while (stack.peek() != '(')
		    postfix.append(stack.pop());
     
		// Pop the left parenthesis from the stack.
		stack.pop();
	    }
	}

	// Display the postfix.
	System.out.println("The expression in postfix notation is: \n" + postfix);
	
	return postfix;
    }
    
    /**
       The isOperator method determines whether a character is an operator.
       @param ch The character to test.
       @return true If the character is an operator; false otherwise.
    */
    
    public static boolean isOperator(char ch)
    {
	boolean operator = false;
		
	if (ch == '^' || ch == '*' || ch == '/' || ch == '%' || ch == '+' || 
	    ch == '-')
	    operator = true;
	
	return operator; 
    }
        
    /**
       The precedence method determines whether the operator from the infix
       expression has lower precedence than the operator from the stack.
       @param op1 The operator from the infix.
       @param op2 The operator from the stack.
       @return true If op1 has lower or equal precedence than op2; false otherwise.
    */
    
    public static boolean precedence(char op1, char op2)
    {	
	boolean lowerOrEqual = false;
	
	if ((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/' || op2 == '%' || 
					   op2 == '^' || op2 == '+' || op2 == '-'))
	    lowerOrEqual = true;

	else if ((op1 == '*' || op1 == '/' || op1 == '%') && (op2 == '^' || op2 == '*' ||
							      op2 == '/' || op2 == '%'))
	    lowerOrEqual = true;
	
	return lowerOrEqual;
    }
}
