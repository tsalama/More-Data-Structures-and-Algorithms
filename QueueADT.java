/**
 * Defines the interface to a queue collection.
 */
public interface QueueADT<T> {
   /**
   * Adds one element to the rear of this queue.
   * @param element -- the new element
   */
   public void enqueue( T element );
   
   /**
   * Removes and returns the element at the front of this queue.
   * @return the element at the front of the queue.
   */
   public T dequeue();
   
   /** Returns without removing the element at the front of the queue.
   * @return -- the first element in the queue.
   */
   public T first();
   
   /** 
   * Returns true if this queue contains no elements.
   * @return -- true if queue is empty.
   */
   public boolean isEmpty();
   
   /**
   * Returns the number of elements in this queue.
   * @return -- size of the queue.
   */
   public int size();
   
   /** Returns a string representation of this queue.
   * @returns -- string representation of the queue.
   */
   public String toString();
   
} // interface
