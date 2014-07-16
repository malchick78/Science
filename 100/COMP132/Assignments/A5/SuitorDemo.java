import java.util.*;

/**
   The SuitorDemo program demonstrates which suitor a beautiful princess  
   will choose to marry, given the decision involves eliminating every  
   third suitor standing in line. When the end of the line is reached,  
   the eliminations start again, counting from the beginning. This
   process is simulated using a circular linked list.
*/

public class SuitorDemo
{
    public static void main(String[] args)
    {
	int numSuitors;
	SuitorNode list = new SuitorNode();

	// Create Scanner object for keyboard input.
	Scanner keyboard = new Scanner(System.in);
	
	// User prompt to enter a number.
	System.out.println("Enter the number of suitors: ");
	
	// Read the number entered and store in numSuitors.
	numSuitors = keyboard.nextInt();

	if (numSuitors < 1)
	    System.out.println("Not enough suitors.");

	else if (numSuitors == 1)
	    System.out.println("The suitor would stand first in line.");

	else
	{   
	    // Incrementally build the list.
	    for (int index = 1; index <= numSuitors; index++)
	    {
		list.add(index);
	    }
		
	    // Perform the elimination process.
	    list.eliminate();
		
	    // Display result.
	    System.out.print("To win the princess, the suitor should "
			     + "stand in position ");
	    list.print();
	    System.out.println();
	}
    }
}
