/* Tarek Salama
   This class creates two die objects and various getter and setter methods */

public class PairOfDice
{
   	private Die die1, die2;

	/* Die objects */
	public PairOfDice()
	{
	  die1 = new Die();
	  die2 = new Die();
   	}

	/* Rolls die & returns their sum */
	public int roll()
	{
	  return die1.roll() + die2.roll();
   	}

   /* Getter methods */
   public int getFaceValue1()
   {
      return die1.getFaceValue();
   }

   public int getFaceValue2()
   {
      return die2.getFaceValue();
   }

   /* Returns sum of face values */
   public int sum()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }

   /* toString method that returns a string representation of the pair of dice*/
   public String toString()
   {
      return "Die 1: " + getFaceValue1() + "   Die 2: " + getFaceValue2();
   }
}