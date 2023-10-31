package ca.sfu.cmpt213.graded;

/**
   This class determines a passing or failing grade for
   an exam.
*/

public class PassFailExam extends GradedActivity
{
   private int numQuestions;  // Number of questions
   private double pointsEach; // Points for each question
   private int numMissed;     // Number of questions missed
   private int MINPASSING = 50;


   public PassFailExam(int questions, int missed)
   {
      // Call the superclass constructor.
      super();

      // Declare a local variable for the score.
      double numericScore;

      // Set the numQuestions and numMissed fields.
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and
      // the numeric score for this exam.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Call the superclass's setScore method to
      // set the numeric score.
      setScore(numericScore);
   }

   public double getPointsEach()
   {
      return pointsEach;
   }

   public int getNumMissed()
   {
      return numMissed;
   }

   @Override
   public String getGrade(){
      if (getScore() >= MINPASSING){
         return "P";
      }
      else{
         return "F";
      }
   }
}