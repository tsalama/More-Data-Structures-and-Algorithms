/** Tarek Salama
 * This class uses a stack to output a set of elements input by the user in reverse order.
 */

import java.util.*;

public class Reverse
{
	/**
	 * @param list user input
	 */
	public <T> Reverse (ArrayList<T> list)
	{
		ArrayStack<T> stack = new ArrayStack<T>();

		/**
		 * Adds list elements to a stack
		 */
		for (int i = 0; i < list.size(); i++)
		{
		T element = list.get(i);
		stack.push(element);
		}

		/**
		 * Clears list
		 */
		list.clear();

		/**
		 * Pops stack onto list
		 */
		while(! stack.isEmpty())
		{
			T element = stack.pop();
			list.add(element);
		}
	}
}
