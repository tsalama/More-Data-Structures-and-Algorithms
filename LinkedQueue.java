/**
* LinkedQueue represents a linked implementation of a queue.
*/
public class LinkedQueue<T> implements QueueADT<T> {
   private static final boolean BUGS = false;
   private int count;
   private LinearNode<T> head, tail;
/**
   * Adds one element to the rear of this queue.
   * @param element -- the new element
   */
   public void enqueue( T element ) {
      LinearNode<T> node = new LinearNode<T>( element );

      if( isEmpty() )
         head = node;
      else
         tail.setNext( node );

      tail = node;
      count++;
   }

   /**
   * Removes and returns the element at the front of this queue.
   * @return the element at the front of the queue.
   */
   public T dequeue() {

      T result = head.getElement();
      head = head.getNext();
      count--;

      if( isEmpty() )
         tail = null;

      return result;
   }

   /** Returns without removing the element at the front of the queue.
   * @return -- the first element in the queue.
   */
   public T first() {

      T result = head.getElement();

      return result;
   }

   /** Returns first node of queue.
   * @return -- first node.
   */
   public LinearNode<T> getHeadNode() {
      return head;
   }

   /**
   * Returns true if this queue contains no elements.
   * @return -- true if queue is empty.
   */
   public boolean isEmpty() {
      return size() == 0;
   }

   /**
   * Returns the number of elements in this queue.
   * @return -- size of the queue.
   */
   public int size() {
      return count;
   }

   /** Returns a string representation of this queue.
   * @returns -- string representation of the queue.
   */
   public String toString() {
      String rString = "";
      LinearNode<T> temp = head;

      for( int i=0; i<size(); i++ ) {
         T nextElem = temp.getElement();

         if( BUGS )
            rString += "BUGS: nextChar=" + nextElem + "i=" + i;

         rString += nextElem;
         temp = temp.getNext( );
      }
      return rString;

   }

} // class
