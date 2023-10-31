package ca.sfu.cmpt213.graded;

/**
 This program demonstrates the FinalExam class,
 which extends the GradedActivity class.
 */

public class FinalExamDemo
{
    public static void main(String[] args)
    {
        int questions = 25;    // Number of questions
        int missed = 13;       // Number of questions missed

        FinalExam exam = new FinalExam(questions, missed);

        // Display the test results.
        System.out.println(
                "Each question counts " + exam.getPointsEach() +
                        " points.\nThe exam score is " +
                        exam.getScore() + "\nThe exam grade is " +
                        exam.getGrade());

        System.exit(0);
    }
}
