package ca.sfu.cmpt213;

import ca.sfu.cmpt213.graded.GradedActivity;
import ca.sfu.cmpt213.graded.FinalExam;
import ca.sfu.cmpt213.graded.PassFailExam;

public class ObjectMethods
{
   public static void main(String[] args)
   {
      // Create two objects.
      GradedActivity exam1 = new PassFailExam(0, 0);
      GradedActivity exam2 = new FinalExam(0, 0);

      System.out.println(exam1);
      System.out.println(exam2);

      if (exam1.equals(exam2))
         System.out.println("They are the same.");
      else
         System.out.println("They are not the same.");
   }
}
