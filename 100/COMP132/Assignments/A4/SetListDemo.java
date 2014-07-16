import java.util.*;

/**
   This program demonstrates the set concept of no duplicate elements,
   by using the methods in the SetListType class for a list of Integer
   objects.
*/

public class SetListDemo
{    
    public static void main(String[] args)
    {			
	System.out.println("\nEXAMPLE 1:");
	
	// Create a SetListType object that can hold Integers.
	SetListType<Integer> numList = new SetListType<Integer>();
	
	// Add some numbers to the list.
	numList.insert(1);
	numList.insert(2);
	numList.insert(3);
	numList.insert(4);
	numList.insert(5);
	numList.insert(3);
	numList.insert(2);
       
	// Display the set list.
	displaySet(numList);

	// Erase the number 3 and display the remaining list.
	System.out.println("\nWe erase the number " + numList.erase(3) 
	                   + ".\n");
	displaySet(numList);
	
	// Clear the list.
	numList.clear();
	
	System.out.println("\nEXAMPLE 2:");
	
	// Add some numbers to the list.
	numList.insert(12);
	numList.insert(18);
	numList.insert(9);
	numList.insert(7);
	numList.insert(10);
	numList.insert(12);
	numList.insert(9);
		
	// Display the set list.
	displaySet(numList);

      	// Add six unique numbers to the list.
	numList.insert(13);
	numList.insert(8);
	numList.insert(6);
	numList.insert(15);
	numList.insert(11);
	numList.insert(19);

	// Display results.
	System.out.println("\nWe add 6 unique numbers to the list so "); 
	System.out.println("the current capacity increases to " +
			   + numList.capacity() + ".\n");
	displaySet(numList);
	System.out.println();

	// Clear the list.
	numList.clear();
    } 

    private static void displaySet(SetListType<Integer> values)
    {
	// Get an iterator. 
        Iterator<Integer> iter = values.iterator();

        // Use the iterator to display the list.
        System.out.println("The set list has " + values.size() +
                           " elements: ");
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
