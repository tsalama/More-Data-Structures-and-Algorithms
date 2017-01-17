/* Tarek Salama
   Two exception examples */

import java.util.Scanner;

public class ExceptionExamples
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);

		System.out.println("For a NullPointerException, type '1'. For an ArithmeticException, type '2': ");
		int num = scan.nextInt();

		String word = null;

		if(num == 1)
		System.out.println("Null manipulation causes a NullPointerException: " + word.length());

		if (num == 2)
		System.out.println("Division by zero causes an ArithmeticException: " + 5/0);
	}
}