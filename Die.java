/* Tarek Salama
   This class represents the face value of a die. */

public class Die
{
   private final int	MAX =	6;
   private int	faceValue;

   /* Constructor: Sets	the initial	face value of this die. */
   public Die()
   {
      faceValue =	1;
   }

   /* Computes a new face value for this die and returns the result. */
   public int roll()
   {
      faceValue =	(int)(Math.random() * MAX)	+ 1;
      return faceValue;
   }

   /* Sets face value */
   public void	setFaceValue (int	value)
   {
      if(value >	0 && value <= MAX)
      faceValue = value;
   }

   /* Gets face value */
   public int getFaceValue()
   {
      return faceValue;
   }

   /* Returns a string representation of this die. */
   public String toString()
   {
      String result = Integer.toString(faceValue);
      return result;
   }
}