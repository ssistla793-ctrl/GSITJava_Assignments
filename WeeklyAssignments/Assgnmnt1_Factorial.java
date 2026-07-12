package WeeklyAssignments;

public class Assgnmnt1_Factorial {

	public static void main(String[] args) {
		/*
		 * Factorial of a Number
		 * 
		 * Question: Write a Java program to calculate the factorial of 6 using a loop.
		 * 
		 * Expected Output:
		 * 
		 * Factorial of 6 = 720
		 */
		int num=6;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 6 is: "+fact);
	}

}
