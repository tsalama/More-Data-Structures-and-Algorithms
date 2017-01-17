/* Tarek Salama
   This program uses and demonstrates a random numbers method */

import java.util.*;

public class RandomInRange{

	public static void main(String[] args)
	{
	   /* Takes in user range */
	   System.out.println("Enter parameters: ");

	   Scanner in = new Scanner(System.in);

	   int max = in.nextInt();

	   int min = in.nextInt();

	   /* Calls on random number method and prints number */
	   System.out.println("\nRandom number: " + randomInRange(min, max));
	}


	/* Random number method */
	public static int randomInRange (int first, int second)
	{
	int number = 0;
	Random generator = new Random();

	if (first <= second)
	{
	int range = second - first + 1;
	number = generator.nextInt(range) + first;
	}

	return number;
	}
}
