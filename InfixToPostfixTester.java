/**
 * Tarek Salama - Program 7, driver class 1
 *
 * This class reads two infix expressions from a "expressions.txt"
 * file & converts the expressions into postfix in order to compute 
 * the results as well as produce the expressions' trees.
 */

import java.io.File;
import java.util.Scanner;
import java.util.Stack;
import java.io.FileNotFoundException;

public class InfixToPostfixTester
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the name of the infix file: ");
      Scanner file = new Scanner(new File(in.nextLine()));

      while (file.hasNextLine())
      {
         String line = file.nextLine();

         if (line.startsWith("#") || line.isEmpty())
         {
            continue;
         }

         String infix = parse(line);
         String postfix = toPostfix(infix);

         System.out.println("\nExpression: " + infix);
         PostfixEvaluator evaluator = new PostfixEvaluator();

         int result = evaluator.evaluate(postfix);
         System.out.println("Result: " + result);

         System.out.print("Expression Tree: ");
         System.out.print(evaluator.getTree());
      }
   }

   /**
    * Spaces out the expression
    * @param line expression
    * @return list of operators
    */
   private static String parse(String line)
   {
      String[] operators = {"+", "-", "*", "/", "(", ")"};

      for (int i = 0; i < operators.length; i++)
      {
         line = line.replace(operators[i], " " + operators[i] + " ");
      }

      line = line.trim().replaceAll(" +", " ");

      return line;
   }

   /**
    * @param operator
    * @return precedence
    */
   private static int getPrecedence(String operator)
   {
      if (operator.equals("*") || operator.equals("/") || operator.equals("%"))
      {
         return 2;
      }

      else
      return 1;
   }

   /**
    * Checks if the character is an operator
    * @param operator
    * @return true if character is an operator, false if not
    */
   private static boolean isOperator(String operator)
   {
      return (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("(") || operator.equals(")"));
   }

   /**
    * Converts expression to postfix
    *
    * @param expression infix
    * @return postfix
    */
   private static String toPostfix(String expression)
   {
      String result = "";

      Stack<String> stack = new Stack<>();
      String[] parts = expression.split(" ");

      for (int i = 0; i < parts.length; i++)
      {
         String part = parts[i];

         if (!isOperator(part))
         {
            result += part + " ";
         }
         else if (isOperator(part))
         {
            if (stack.empty())
            {
               stack.push(part);
            }
            else if (part.equals("(") || part.equals(")"))
            {
               switch (part)
               {
                  case "(":
                     stack.push(part);
                     break;
                  case ")":
                     while (!stack.empty())
                     {
                        String popped = stack.pop();

                        if (popped.equals("("))
                        {
                           break;
                        }
                        else
                        {
                           result += popped + " ";
                        }
                     }

                     break;
               }
            }
            else
            {
               while (!stack.empty())
               {
                  if (stack.peek().equals("("))
                  {
                     stack.push(part);
                     break;
                  }

                  if (getPrecedence(stack.peek()) >= getPrecedence(part))
                  {
                     result += stack.pop() + " ";
                  }
                  else
                  {
                     stack.push(part);
                     break;
                  }
               }
            }
         }
      }

      while (!stack.empty())
      {
         result += stack.pop() + " ";
      }

      return result.trim();
   }
}