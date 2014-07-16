import java.util.*;

/**
   This program demonstrates the bag concept by using the methods in 
   the BagListType class for a list of Integer objects that permits
   duplicate elements.
*/

public class BagListDemo
{		
    // Private field to store the values of the bag list.
    private static int[] dualArray = new int[2];
    
    //  SetListType object to hold the unique list.
    private static SetListType<Integer> 
	           uniqueList =  new SetListType<Integer>();

    public static void main(String[] args)
    {			
	System.out.println("\nEXAMPLE 1:");
	
	// Create a BagListType object that can hold Integers.
	BagListType<Integer> numList = new BagListType<Integer>();
	
	// Add some numbers to the list.
	numList.insert(1);
	numList.insert(2);
	numList.insert(3);
	numList.insert(4);
	numList.insert(5);
	numList.insert(3);
	numList.insert(2);

	// Display the bag list.
	displayBag(numList);
                                                                                                                                                                                                        
	// Erase the number 2 and display how the remaining values 
	// are stored in a dual array structure.
	System.out.println("\nBy erasing " + numList.erase(2) +
					   ", the list decreases to " 
			                   + numList.size());
	System.out.println("elements, with the remaining elements ");
	System.out.println("shown below in a dual array structure: ");
	
	// Display the dual array.
	displayDualArray(numList);
	
	// Add more numbers to the list.
	numList.insert(2);
	numList.insert(8);
	numList.insert(1);
	numList.insert(6);
	numList.insert(6);
	numList.insert(3);
	
	// Display the new bag list.
	System.out.println("\nWe add 6 more numbers to the list. ");
	displayBag(numList);

	// Display the new dual array.
	System.out.println("\nThe new dual array is shown below: ");
	displayDualArray(numList);
	
	System.out.println("\nThe current capacity also increases to " + 
			   numList.capacity() + ".");
	
	// Clear the bag list.
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
	
	// Display the bag list.
	displayBag(numList);

	// Erase the number 9 from the list once.
	numList.erase_one(9);
	
	// Erase the number 12 from the list completely.
	numList.erase(12);

	// Display the dual array after erasing all instances of 9 and
	// one instance of 12.
	System.out.println("\nBy erasing 9 once and 12 completely, the ");
	System.out.println("list decreases to " + numList.size() + 
			   " elements, shown below ");
	System.out.println("in a dual array structure: ");
	displayDualArray(numList);

	// Clear the bag list.
	numList.clear();

	System.out.println();
    }

    public static SetListType<Integer> findUniqueList
	                              (BagListType<Integer> values)
    {
	// Create a temporary list.
        BagListType<Integer> tempList = new BagListType<Integer>();

        // Copy the values to tempList.
        for (int index = 0; index < values.size(); index++)
            tempList.insert(values.get(index));

        // The unique list.
        for (int index = 0; index < tempList.size(); index++)
            uniqueList.insert(tempList.get(index));
			
	return uniqueList;
    }
	
    private static String storeValues(int value, int count)
    {
	String str;
	dualArray[0] = value;
	dualArray[1] = count;
	str = "[" + dualArray[0] + "," + dualArray[1] + "]";
	return str;
    }
    
    private static void displayBag(BagListType<Integer> values)
    {
        // Get an iterator.
        Iterator<Integer> iter = values.iterator();

        // Use the iterator to display the list.
        System.out.println("The bag list has " + values.size() +
                           " elements: ");
        while (iter.hasNext())
            System.out.println(iter.next());
    }

    private static void displayDualArray(BagListType<Integer> values)
    {
	// Find the unique elements in the list. 
        findUniqueList(values);

        // Store the values by matching the each element in the unique
        // list with the number of times it occurs in the bag list.
        for (int index = 0; index < uniqueList.size(); index++)
            System.out.println(storeValues(uniqueList.get(index),
			       values.count(uniqueList.get(index))));
        
	// Clear the unique list.
        uniqueList.clear();
    }
}
