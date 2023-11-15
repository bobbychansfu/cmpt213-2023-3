package ca.sfu.cmpt213.graded;

/**
   This class determines the grade for a final exam.
*/

public class FinalExam extends GradedActivity
{
   private int numQuestions;  // Number of questions
   private double pointsEach; // Points for each question
   private int numMissed;     // Questions missed

   public FinalExam(int questions, int missed)
   {
      double numericScore;  // To hold a numeric score
      numQuestions = questions;
      numMissed = missed;

      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // set the numeric score.
      this.score = numericScore;
   }

   public double getPointsEach()
   {
      return pointsEach;
   }
   public int getNumMissed()
   {
      return numMissed;
   }

}