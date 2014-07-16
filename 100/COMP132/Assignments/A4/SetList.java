/**
   The SetList interface specifies the operations that
   should be supported by a list that is either a set
   or a bag. While duplicate elements are permitted in
   in a bag, they are not permitted in a set. 
*/

public interface SetList<E>
{
    
    /** The insert method adds an element to the list.
	@param entry The element to add.
    */
    public void insert(E entry);
    
    
    /** The erase method removes the single occurrence of
	an object held in a set or all occurrences of a 
	specified object held in a bag.
	@param target The specified object to remove.
	@return The object removed from the list.
    */
    public E erase(E target); 
    
    
    /** The count method returns the number of times a
	specified object occurs in the list.
	@param target The specified object to count.
	@return  The number of times the object occurs in the 
                 list.
    */
    public int count(E target); 
    
    
    /** The clear method clears the list */
    public void clear(); 
    
    
    /** The isEmpty method determines whether the list is 
	empty.
	@return true if the list is empty; false otherwise.
    */
    public boolean isEmpty(); 
    
    
    /** The capacity method returns the current capacity
	of the list and can resize the list to twice its 
	current length if required.
    */
    public int capacity(); 
    
    
    /** The size method returns the number of elements in
	the list.
	@return The number of elements in the list.
    */
    public int size(); 
    
    
    /** The get method gets an element at a specific index.
	@param index The specified index.
	@return The element at the index.
	@exception IndexOutOfBoundsException When index
	           is out of bounds.
    */
    public E get(int index); 
    
    
    /** The remove method removes an element at a specific
	index.
	@param index The index of the element to remove.
	@return The element that was removed.
	@exception IndexOutOfBoundsException When index
	           is out of bounds.
    */
    public E remove(int index);

}
