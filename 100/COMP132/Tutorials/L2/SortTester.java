public class SortTester
{
    public static void main(String[] args)
    {
        // Create an int array with 20 test values                                                                                                                                                                                                                            
        int[] values = {16, 2, 55, 68, 54, 9, 11, 1, 75, 23,
                        8, 46, 75, 3, 67, 95, 9, 18, 13, 19};

        int array1[] = new int[values.length];
        int array2[] = new int[values.length];
        int array3[] = new int[values.length];
        int array4[] = new int[values.length];

        // Make 4 copies of the original array                                                                                                                                                                                                                                  
        for(int index = 0; index < values.length; index++)
        {
            array1[index] = values[index];
            array2[index] = values[index];
            array3[index] = values[index];
            array4[index] = values[index];
        }

        // Display the original array's contents                                                                                                                                                                                                                              
        System.out.println("Original order: ");
        for (int element : values)
            System.out.print(element + " ");

        // Sort the arrays                                                                                                                                                                                                                                                    
        IntBubbleSorter.bubbleSort(array1);
        IntSelectionSorter.selectionSort(array2);
        IntInsertionSorter.insertionSort(array3);
        IntQuickSorter.quickSort(array4);

        // Display the sorted arrays                                                                                                                                                                                                                                          
        System.out.println("\nBubble Sort: ");
        for (int element : array1)
            System.out.print(element + " ");

        System.out.println("\nSelection Sort: ");
        for (int element : array2)
            System.out.print(element + " ");

        System.out.println("\nInsertion Sort: ");
        for (int element : array3)
            System.out.print(element + " ");

        System.out.println("\nQuick Sort: ");
        for (int element : array4)
            System.out.print(element + " ");

        System.out.println();
    }
}
