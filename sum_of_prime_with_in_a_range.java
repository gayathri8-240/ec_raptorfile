/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */

public class sum_of_prime_with_in_a_range extends eecs.Gui
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      ?? b = ??;
      ?? c = ??;
      ?? average = ??;
      ?? cp = ??;
      ?? sum = ??;
      ?? i = ??;
      ?? j = ??;
      
      raptor_prompt_variable_zzyz = "enter lower bound";
      i = get???(raptor_prompt_variable_zzyz);
      raptor_prompt_variable_zzyz = "enter ub";
      b = get???(raptor_prompt_variable_zzyz);
      sum = 0;
      cp = 0;
      while	(1)
      {
         c = 0;
         if (i > b)	break;
         j = 1;
         while (j == i)
         {
            if (i % j == 0)
            {
               c = c + 1;
            }
            else
            {
            }
            j = j + 1;
         }
         if (c >= 2)
         {
         }
         else
         {
            printLine(i);
            sum = sum + i;
            cp = cp + 1;
         }
         i = i + 1;
      }
      average = 0;
      printLine("average=" + (sum / cp));
   } // close main
} // close sum_of_prime_with_in_a_range
