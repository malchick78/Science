/** 

   The VehicleObjectInsertionSorter class provides a public
   static method for performing a insertion sort on an array
   of objects of the Vehicle class. The method allows the
   objects to be sorted according to a particular  field 
   selected.
   
*/

public class VehicleObjectInsertionSorter
{
    /**
       The insertionSort method performs an insertion sort on
       an array of Vehicle objects according to a particular 
       field selected.
       @param array The array to sort.
    */

    public static void insertionSort(Vehicle[] array,
				     String field) 
    {
	Vehicle unsortedValue; // The first unsorted value
        int scan;              // Used to scan the array
	
	// Sorts the array of Vehicle objects by type.
	if (field == "type")
	{
	    // The outer loop steps the index variable through  
	    // each subscript in the array, starting at 1. The
	    // portion of the array consisting of element 0 by 
	    // itself is already sorted.
	    
	    for (int index = 1; index < array.length; index++)
	    {
		// The first element outside the sorted portion
		// is array[index]. Store the value of this
		// element in unsortedValue.
			
		unsortedValue = array[index];
		
		// Start scan at the subscript of the first 
		// element in the still unsorted part.
		
		scan = index;
		
		// Move the first element in the still unsorted 
		// part into its proper position within the
		// sorted part.
		
		while (scan > 0 &&
		       array[scan-1].typeCompareTo(unsortedValue)>0)
		{
		    array[scan] = array[scan-1];
		    scan--;
		}

		// Insert the unsorted value in its proper 
		// position within the sorted part.
                
		array[scan] = unsortedValue;
	    }
	}
		
	// Sorts the array of Vehicle objects by make.
	else if(field == "make")
	{
	    for (int index = 1; index < array.length; index++)
	    {
		unsortedValue = array[index];
		scan = index;                                                                                                                                                                                                                                            
		
		while (scan > 0 &&
		       array[scan-1].makeCompareTo(unsortedValue)>0)
		{
		    array[scan] = array[scan-1];
		    scan--;
		}
                
		array[scan] = unsortedValue;
	    }
	}
		
	// Sorts the array of Vehicle objects by colour.
	else if(field == "colour")
	{
	    for (int index = 1; index < array.length; index++)
	    {
		unsortedValue = array[index];
		scan = index;                                                                                                                                                                                                                                            
		
		while (scan > 0 &&
		       array[scan-1].colourCompareTo(unsortedValue)>0)
		{
		    array[scan] = array[scan-1];
		    scan--;
		}
                
		array[scan] = unsortedValue;
	    }
	}
    }
}
