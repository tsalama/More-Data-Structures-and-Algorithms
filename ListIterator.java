/**
 * An iterator for a linked list
 */
import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {
	
   private LinkedList<T> iteratorList = new LinkedList<>();
   private LinearNode<T> node;
   private int position = 0;

   public ListIterator(T list) {
      iteratorList = (LinkedList<T>) list;
      node = iteratorList.head;
   }
	
	/**
	 * Interface method, checks if list has another element
	 * @return the boolean of if there are more elements
	 */
   @Override
   public boolean hasNext() {
      return position < iteratorList.size();
   }

	/**
	 * returns the next element in the list
	 * @return next element in the list
	 */
   @Override
   public T next() {
      T currentElement = node.getElement();
      position++;
      node = node.getNext();
      return currentElement;
   }

   @Override
   public void remove() {
   	
   }
}