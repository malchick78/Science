/**
   The BagList interface extends the SetList
   interface.
*/
   
public interface BagList<E> extends SetList<E>
{
    
    /** The erase_one method removes one 
	occurrence of an object held in a
	bag and returns a true boolean 
	value if the a successful deletion
	occurred.
    */
    public boolean erase_one(E target);
    
}
