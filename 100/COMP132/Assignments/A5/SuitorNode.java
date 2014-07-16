/**
   The SuitorNode class contains the necessary instance 
   fields to represent suitors to a beautiful princess as
   numbers in a circular linked list. It also contains the
   methods to determine which position a suitor should 
   stand in so that he is chosen to marry the princess.
*/
   
public class SuitorNode
{
    private int suitor;	        // list element
    private SuitorNode next; 	// successor link
    private SuitorNode first;	// head node

    /**
       Constructor to initialise class fields.
    */
	
    public SuitorNode()
    {
	suitor = 0;
	first = null;
	next = null;
    }

    /**
       The isEmpty method determines whether the list is 
       empty.
       @return true if the list is empty; false otherwise.
    */
    
    public boolean isEmpty()
    {
	return first == null;
    }
    
    /**
       The add method stores elements into linked nodes that
       incrementally build the circular linked list.
       @param element The element to store in this node.
    */   
    
    public void add(int element)
    {
	// Create a new SuitorNode object to hold the list elements.
	SuitorNode newNode = new SuitorNode();
	
	// Set the current node as the head node.
	SuitorNode current = first;
	
	if (isEmpty())
        {
	    // Initialise the head node.
	    first = newNode;
	    
	    // Store the element in the node.
	    newNode.suitor = element;
	    
	    // Link the head node to the tail of list.
	    newNode.next = first;
	}
	
	else
	{
	   
	   // Link successive current nodes while at middle of list.
	   while (current.next != first)
	   {
	       current = current.next;
	   }
	   
	   // Add the current node to the list.
	   current.next = newNode;
	   
	   // Store the element in the node.
	   newNode.suitor = element;
	   
	   // Link the head node to the tail of list.
	   newNode.next = first;
       }
    }
    
    /** 
	The size method returns the length of the list.
	@return The number of elements in the list.
    */
	
    public int size()
    {
	int count = 1;
	SuitorNode current = first;

	while (current.next != first)
	{
	    current = current.next;
	    count++;
	}
		
	return count;
    }
	
    /** 
	The eliminate method removes every third element by skipping
	the corresponding third node. When at the end of the list, the 
	eliminations start again, counting from the beginning.
    */
    
    public void eliminate()
    {
	int count = 0;
	SuitorNode current = null;
	SuitorNode pred = null;
	SuitorNode succ = first;
	
	while (size() > 1)
	{
	    count++;
	    pred = current;
	    current = succ;
	    succ = succ.next;

	    if (count == 3)
	    {
		// Link to skip the current node.
		pred.next = succ;
		
		// Restart counting from previous node.
		succ = pred;
		
		// Required to set a node as head node.
		if (current == first)
		    first = succ;
		
		// Reset values to restart counting.
		pred = null; 
		current = null;
		count = -1;
	    }
	}
    }
	
    /**
       The print method traverses the list and displays
       all of its elements.
    */
    
    public void print()
    {
	SuitorNode current = first;
	
	while (current.next != first)
        {
	    System.out.print(current.suitor + " ");
	    current = current.next;
	}
	
	System.out.print(current.suitor);
    }
}
