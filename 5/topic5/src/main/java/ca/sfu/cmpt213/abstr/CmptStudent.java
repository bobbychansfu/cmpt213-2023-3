package ca.sfu.cmpt213.abstr;

/**
   This class holds data for a computer science student.
*/

public class CmptStudent extends Student
{
   // Required credits
   private final int MATH_CREDITS = 20;   // Math 
   private final int CS_CREDITS = 60;     // Comp sci credits
   private final int GEN_ED_CREDITS = 40; // Elective credits

   // Credits taken
   private int mathCredits;  // Math credits taken
   private int csCredits;    // Comp sci credits taken
   private int genEdCredits; // Elective credits taken

   public CmptStudent(String n, String id, int year)
   {
      super(n, id, year);
      mathCredits = 0;
      csCredits = 0;
      genEdCredits = 0;
   }


   public void setMathCredits(int math)
   {
      mathCredits = math;
   }

   public void setCsCredits(int cs)
   {
      csCredits = cs;
   }

   public void setGenEdCredits(int genEd)
   {
      genEdCredits = genEd;
   }

   @Override
   public int getRemainingCredits()
   {
      int reqCredits,        // Total required credits
          remainingCredits;  // Remaining credits

      // Calculate the required credits.
      reqCredits = MATH_CREDITS + CS_CREDITS + GEN_ED_CREDITS;
      
      // Calculate the remaining credits.
      remainingCredits = reqCredits - (mathCredits + csCredits
                         + genEdCredits);
                         
      return remainingCredits;
   }
   
   @Override
   public String toString()
   {
      String str;

      str = super.toString() +
         "\nMajor: Computing Science" +
         "\nMath Credits Taken: " + mathCredits +
         "\nComputer Science Credits Taken: " + csCredits +
         "\nGeneral Ed Credits Taken: " + genEdCredits;

      return str;
   }
}