package DailyAssignments;

public class Assignment_StudentGrades_24_06_2026 {

	public static void main(String[] args) {
		/*
		 * Student Grade Calculator (if-else-if) Problem Statement
		 * 
		 * Write a Java program that accepts the marks of a student (out of 100) and
		 * displays the corresponding grade based on the following criteria.
		 * Grading Criteria 
		 * Marks  	Grade 
		 * 90->100	  A 
		 * 75->89	  B 
		 * 60->74	  C 
		 * 40->59	  D
		 * 0->39      Fail
		 */
		double marksOfStudent=78.8;
		if(marksOfStudent>=90)
			System.out.println("Grade secured: A");
		else if(marksOfStudent>=75 && marksOfStudent<90)
			System.out.println("Grade secured: B");
		else if(marksOfStudent>=60 && marksOfStudent<75)
			System.out.println("Grade secured: C");
		else if(marksOfStudent>=40 && marksOfStudent<60)
			System.out.println("Grade secured: D");
		else
			System.out.println("Grade secured: Fail");
		

	}

}
