/**
   This generic class contains the standard stack methods to be
   implemented by a linked list.
*/

public class GenericLinkedStack<T>
{
    /**
       The Node class is used to implement the linked list.
    */
    
    private class Node
    {
	T value;
	Node next;
	Node(T val, Node n)
	{
	    value = val;
	    next = n;
	}
    }
    
    private Node top = null;     // Top of the stack

    /**
       The isEmpty method checks for an empty stack
       @return true if stack is empty; false otherwise
    */

    public boolean isEmpty()
    {
	return top == null;
    }

    /**
       The push method adds a new item to the stack.
       @param s The item to be pushed onto the stack.
    */

    public void push(T s)
    {
	top = new Node(s, top);
    }

    /**
       The pop method removes the value at the top of the stack.
       @return The value at the top of the stack.
       @exception EmptyStackException When the stack is empty.
    */

    public T pop()
    {
	if (isEmpty())
	    throw new EmptyStackException();
	else
	{
	    T retValue = top.value;
	    top = top.next;
	    return retValue;
	}
    }

    /**
       The peek method returns the top value on the stack.
       @return The value at the top of the stack.
       @exception EmptyStackException When the stack is empty.
    */

    public T peek()
    {
	if (isEmpty())
	    throw new EmptyStackException();
	else
	    return top.value;
    }

    /**
       The toString method computes a string representation of
       the contents of the stack. 
       @return The string representation of the stack contents.
    */

    public String toString()
    {
	StringBuilder sBuilder = new StringBuilder();
	Node p = top;
	while (p != null)
	{
	    sBuilder.append(p.value);
	    p = p.next;
	    if (p != null)
		sBuilder.append("\n");
	}
	return sBuilder.toString();
    }
}
