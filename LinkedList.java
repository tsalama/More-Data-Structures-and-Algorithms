/**
 * LinkedList represents a linked implementation of a list.
 * @author Java Foundations
 * @version 4.0
 */
import java.util.Iterator;

public class LinkedList<T> implements ListADT<T> {

   protected int count;
   protected LinearNode<T> head, tail;
   protected int modCount;

/** Creates an empty list.
*/
   public LinkedList() {
      count = 0;
      head = tail = null;
      modCount = 0;
   }
   
   /** Removes the first instance of the specified element 
   * from this list and returns it. Throws an EmptyCollectionException
   * if the list is empty. Throws an ElementNotFoundException if the
   * specified element is not found in the list.
   */
   public T remove(T targetElement) throws EmptyCollectionException,
      											ElementNotFoundException {
      if(isEmpty())
         throw new EmptyCollectionException( "LinkedList" );
         
      boolean found = false;
      LinearNode<T> previous = null;
      LinearNode<T> current = head;
      
      while(current != null && !found)
         if( targetElement.equals( current.getElement() ) )
            found = true;
         else {
            previous = current;
            current = current.getNext();
         }
            
      if( ! found )
         throw new ElementNotFoundException( "LinkedList" );
         
      if( size() == 1 ) // there was only one element in the list,
                        // and we just removed it.
         head = tail = null;    
      else if (current.equals( head )) // target is at the head
         head = current.getNext();
      else if (current.equals( tail )) // target is at the tail
      {
         tail = previous;
         tail.setNext( null );
      } 
      else // target is in the middle
         previous.setNext( current.getNext() );
      
      count--;
      
      modCount++;
      return current.getElement();     
   }
   
   /** Returns true if list is empty.
   * @return true if list is empty
   */
   public boolean isEmpty() {
      return count == 0;
   }
   
   /** Returns element at the head of the list.
   * @return element at the head of the list.
   */   
   public T first() throws EmptyCollectionException {
      if (size() == 0)
         throw new EmptyCollectionException( "LinkedList" );
      return head.getElement();  
   }

   /** Returns element at the tail of the list.
   * @return element at the tail of the list.
   */
   public T last() throws EmptyCollectionException {      
      if(isEmpty())
         throw new EmptyCollectionException( "LinkedList" );      
      return tail.getElement();
   }

   public Iterator<T> iterator() {
      return new ListIterator(this);
   }

	@Override
	public T removeFirst() throws EmptyCollectionException{
		if (count == 0)
			throw new EmptyCollectionException("LinkedList");
		
		T element = head.getElement();
		head = head.getNext();
		count --;
		return element;		
	}
	/**
	 * Removes and returns the last element in the list
	 * @return element at the tail of the list
	 */
	@Override
	public T removeLast() {
		T element;
	    LinearNode<T> previous = null;
	    LinearNode<T> current = head;
	    
	    if(isEmpty())
	       throw new EmptyCollectionException( "LinkedList" );
	    element = tail.getElement();
	    if(size() == 1) {
	       tail = head = null;
	    }
	    else { // need to traverse list to find second-to-last
	       while(current != tail) {
	          current = current.getNext();
	          previous = current;
	       }
	       tail = previous;
	    }    
	    return element;
	}

	/**
	 * Checks the list to see if it contains the specified object
	 * @param target the object to check for
	 * @return boolean of whether the object was found
	 */
	@Override
	public boolean contains(T target) {
		 if (count == 0) 
			 throw new EmptyCollectionException( "LinkedList" );
	         
	      boolean found = false;
	      LinearNode<T> current = head;
	      
	      while (current != null && !found) {
	         if(target.equals(current.getElement()))
	            found = true;
	         else
	            current = current.getNext();
	      }	      
	      return found;     
	}
	
	/**
	 * Returns an integer that is the size of the list
	 * @return the size of the list
	 */
	@Override
	public int size() {
		return count;
	}
}