/**
 * Tarek Salama - Program 7, driver class 2
 *
 * This class reads questions from a "input.txt" file & 
 * uses a decision tree in order to diagnose an injury.
 */

import java.io.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.
 */
public class BackPainAnalyzer
{
    /**
     *  Asks questions of the user to diagnose a medical problem.
     */
    public static void main (String[] args) throws FileNotFoundException
    {
        System.out.println ("So, you're having back pain.");

        DecisionTree expert = new DecisionTree("input.txt");
        expert.evaluate();
    }
}
