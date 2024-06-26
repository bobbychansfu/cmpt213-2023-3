package ca.sfu.cmpt213.abstr;

public class CmptStudentDemo
{
    public static void main(String[] args)
    {
        Student s1 = new CmptStudent("john","20001",1999); // legal
        // Create a CmptStudent object.
        CmptStudent s = new CmptStudent("bob","20003",1999);
        // Display the student's data.
        System.out.println(s);
        // Display the number of remaining hours.
        System.out.println(s.getRemainingCredits());
    }
}