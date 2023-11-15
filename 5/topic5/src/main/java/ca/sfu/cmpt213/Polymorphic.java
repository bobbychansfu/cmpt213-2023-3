package ca.sfu.cmpt213;

import ca.sfu.cmpt213.graded.FinalExam;
import ca.sfu.cmpt213.graded.GradedActivity;
import ca.sfu.cmpt213.graded.PassFailExam;

/**
   This program demonstrates polymorphic behavior.
*/

public class Polymorphic
{
   public static void main(String[] args)
   {
      GradedActivity[] tests = new GradedActivity[3];
      
      tests[0] = new GradedActivity();
      tests[0].setScore(95);

      tests[1] = new FinalExam(50, 7);
      tests[2] = new PassFailExam(20, 5);


      for (int i = 0; i < tests.length; i++) {
         System.out.println("Test " + (i + 1) + ": " +
                  " " + tests[i].getClass().getSimpleName() + ": " +
                    "score " + tests[i].getScore() +
                    ", grade " + tests[i].getGrade());
      }
   
   }
}
