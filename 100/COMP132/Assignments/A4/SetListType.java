import java.util.*;

/** 
   The SetListType class is a concrete class for storing a list 
   of objects in a set structure.
*/

public class SetListType<E> implements SetList<E>
{
    // Constants for the default capacity and the resizing factor.
    private final int DEFAULT_CAPACITY = 10;
    private final int RESIZE_FACTOR = 2;
    
    // Private fields
    private E[] list;      // The list.
    private int elements;  // Number of elements stored.
    
    
    /** This constructor creates an empty list of the default 
	capacity. 
    */
    public SetListType()
    {
	// The following statement causes a compiler warning since
	// we cannot instantiate an array of a generic type.
	list = (E[])(new Object[DEFAULT_CAPACITY]);
	elements = 0;
    }

        
    /** Add an element to the end of the list.
	@param entry The element to add.
    */
    public void insert(E entry)
    {
	while (indexOf(entry) == -1) 
	{
	    // Check current capacity and resize the list if needed.
	    capacity();
	
	    // Add element to the end of the list.
	    list[elements] = entry;
	
	    // Adjust the number of elements.
	    elements++;
	}	
    }
    
    
    /** Remove a specified element from the list.
	@param target The specified element to remove.
	@return The element removed from the list.
    */
    public E erase(E target)
    {
	int index = 0;			// Index counter
	boolean found = false;	        // Search flag
	
	// Perform a sequential search for the element. When it
	// is found, remove it and stop searching since there
	// are no duplicates on the list.
	while(!found && index < elements)
	{
	    if (list[index].equals(target))
	    {	
		list[index] = null;
		found = true;
	    }
	    index++;
	}
	
	// If the value was found, shift all subsequent
	// elements toward the front of the list.
	if (found)
	{
	    while (index < elements)
	    {
		list[index - 1] = list[index];
		index++;
	    }
	    
	    // Adjust the number of elements.
	    elements--;
	}
	
	// Return the element that was removed.
		return target;
    }
    
    
    /** Count the number of times a specified element
	occurs in the list.
	@param target The specified element to count.
	@return The number of times the element occurs
	        in the list.
    */
    public int count(E target)
    {
	int total = 0;
	int index = 0;
	boolean found = false;
	
	while(index < elements)
	{
	    if (list[index].equals(target))
	    {	
		total++;
	    }
	    index++;
	}
	return total;
    }
    
	
    /** Clear the list. */
    public void clear()
    {
	for (int index = 0; index < list.length; index++)
	    list[index] = null;
	elements = 0;
    }
    
    
    /** Determine whether the list is empty. 
	@return true if the list is empty; false otherwise
    */
    public boolean isEmpty()
    {
	return (elements == 0);
    }
    
    
    /** Return the current capacity of the list and can resize 
	the list to twice its current length if required.
    */
    public int capacity()
    {
	// If the list is full, resize it.
	if (elements == list.length)
	    resize();
	
	// Return the capacity.
		return list.length;
    }
    
    
    /** Return the number of elements in the list. 
	@return The number of elements in the list.
    */
    public int size()
    {
	return elements;
    }
    
    
    /** Get an element at a specific index.
	@param index The specified index.
	@return The element at the index.
	@exception IndexOutOfBoundsException When index
	           is out of bounds.
    */
    public E get(int index)
    {
	if (index >= elements || index < 0)
	    throw new IndexOutOfBoundsException();
	return list[index];
    }
    
    
    /** Remove an element at a specific index.
	@param index The index of the element to remove.
	@return The element that was removed.
	@exception IndexOutOfBoundsException When index
	           is out of bounds.
    */
    public E remove(int index)
    {
	if (index >= elements || index < 0)
	    throw new IndexOutOfBoundsException();
	
	// Save the element, but remove it from the list.
	E temp = list[index];
	list[index] = null;
	index++;
	
	// Shift all subsequent elements towards the 
	// front of the list.
	while (index < elements)
	{
	    list[index - 1] = list[index];
	    index++;
	}
	
	// Adjust the number of elements.
	elements--;
	
	// Return the element that was removed.
	return temp;
    }
    
    
    /** Resize the list to twice its current length. */
    private void resize()
    {
	// Calculate the new length, which is the current 
	// length multiplied by the resize factor.
	int newLength = list.length * RESIZE_FACTOR;

	// Create a new list. Note: This statement causes
	// a compiler warning since we cannot instantiate
	// an array of a generic type.
	E[] tempList = (E[])(new Object[newLength]);
	
	// Copy the existing elements to the new list.
	for (int index = 0; index < elements; index++)
	    tempList[index] = list[index];
	
	// Replace the existing list with the new one.
	list = tempList;
    }	


    /** Gets the index of the first occurrence of the 
	specified element.
	@param entry The element to search for.
	@return The index of the first occurrence of the
	        element if it exists; -1 if the element
		is not in the list.
    */
    public int indexOf(E entry)
    {
	int index = 0;            // Index counter
	boolean found = false;    // Search flag

	// Step through the list. When the element
	// is found, set found to true and stop.
	while (!found && index < elements)
	{
	    if (list[index].equals(entry))
		found = true;
	    else
		index++;
	}

	// Return the index of the element or -1.
	if (!found)
	    index = -1;
	return index;
    }


    /** Return an iterator for this list.
	@return An Iterator.
    */
    public Iterator<E> iterator()
    {
	return new SetTypeIterator<E>(this);
    }

}
