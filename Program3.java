/** Tarek Salama
 * This program uses a stack to output a set of elements input by the user in reverse order.
 */

import java.util.*;
import java.util.Scanner;

public class Program3
{
	public static void main (String[] args)
	{
	   /**
		 * String code begins:
		 */


		/**
		 * Creates an ArrayList capable of holding strings.
		 */
		ArrayList<String> stringList = new ArrayList<String>();

		Scanner scan = new Scanner (System.in);

		System.out.println("Enter 5 string elements: ");

		/**
		 * Accepts elements & adds to list
		 */
		for(int i1 = 0; i1 < 5; i1++)
		{
			stringList.add(scan.nextLine());
		}

		System.out.println("Before reversal: " + stringList);

		/**
		 * Tests the Reverse class which reverses and outputs the string list
		 */
		Reverse elementsObject1 = new Reverse(stringList);

		System.out.println("After reversal: " + stringList + "\n");



		/**
		 * Integer code begins:
		 */



		/**
		 * Creates an ArrayList capable of holding integers.
		 */
		ArrayList<Integer> intList = new ArrayList<Integer>();

		System.out.println("Enter 5 integer elements: ");

		/**
		 * Accepts elements & adds to list
		 */
		for(int i2 = 0; i2 < 5; i2++)
		{
			intList.add(scan.nextInt());
		}

		System.out.println("Before reversal: " + intList);

		/**
		 * Tests the Reverse class which reverses and outputs the integer list
		 */
		Reverse elementsObject2 = new Reverse(intList);

		System.out.println("After reversal: " + intList + "\n");



		/**
		 * Char code begins:
		 */



		/**
		 * Creates an ArrayList capable of holding characters.
		 */
		ArrayList<Character> charList = new ArrayList<Character>();

		System.out.println("Enter 5 character elements: ");

		/**
		 * Accepts elements & adds to list
		 */
		for(int i3 = 0; i3 < 5; i3++)
		{
			charList.add(scan.next().charAt(0));
		}

		System.out.println("Before reversal: " + charList);

		/**
		 * Tests the Reverse class which reverses and outputs the character list
		 */
		Reverse elementsObject3 = new Reverse(charList);

		System.out.println("After reversal: " + charList);
	}
}