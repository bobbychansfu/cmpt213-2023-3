package ca.sfu.cmpt213.graded;

/**
   A class that holds a grade for a graded activity.
*/

public class GradedActivity
{
   protected double score;

   public void setScore(double s)
   {
      score = s;
   }
   public double getScore()
   {
      return score;
   }
   public String getGrade()
   {
      String letterGrade;

      if (score >= 90)
         letterGrade = "A";
      else if (score >= 80)
         letterGrade = "B";
      else if (score >= 70)
         letterGrade = "C";
      else if (score >= 60)
         letterGrade = "D";
      else
         letterGrade = "F";

      return letterGrade;
   }

   // override equals method

   @Override
   public boolean equals(Object other) {
      GradedActivity otherGradedActivity = (GradedActivity) other;
      return this.score == otherGradedActivity.score;
   }
}