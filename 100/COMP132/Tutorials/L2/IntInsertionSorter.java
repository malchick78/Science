/**
   The IntInsertionSorter class provides a public static
   method for performing an insertion sort on an int array.
*/

public class IntInsertionSorter
{

   /**
      The insertionSort method performs an insertion sort on
      an int array. The array is sorted in ascending order.
      @param array The array to sort.
   */

   public static void insertionSort(int[] array)
   {
      int unsortedValue;  // The first unsorted value
      int scan;           // Used to scan the array
      
      // The outer loop steps the index variable through 
      // each subscript in the array, starting at 1. This
      // is because element 0 is considered already sorted.
      for (int index = 1; index < array.length; index++)
      {
         // The first element outside the sorted subset is
         // array[index]. Store the value of this element
         // in unsortedValue.
         unsortedValue = array[index];
         
         // Start scan at the subscript of the first element
         // outside the sorted subset.
         scan = index;
         
         // Move the first element outside the sorted subset
         // into its proper position within the sorted subset.
         while (scan > 0 && array[scan-1] > unsortedValue)
         {
            array[scan] = array[scan - 1];
            scan--;
         }
         
         // Insert the unsorted value in its proper position
         // within the sorted subset.
         array[scan] = unsortedValue;
      }
   }
}