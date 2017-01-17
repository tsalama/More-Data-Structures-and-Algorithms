/*This should not be used regularly since the recursion is actually not necessary.
  The recursion is simply taking up much more of a stack in this situation and instead
  should be done using simpler ways (example: reversal of a character array).*/

import java.util.Scanner;

public class StringReverse
{

	public static void main (String[] args)
	{
	Scanner in = new Scanner(System.in);

	System.out.println("Please enter a string: ");
	String s = in.nextLine();

	System.out.println("\nBefore Reversal: " + s);

	System.out.println("After Reversal: " + reverse(s));
	}

	public static String reverse(String s){
		if (s.length() == 0)
			 return s;

		return reverse(s.substring(1)) + s.charAt(0);
	}
}