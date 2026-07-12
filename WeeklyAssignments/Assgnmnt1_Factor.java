package WeeklyAssignments;

public class Assgnmnt1_Factor {

	public static void main(String[] args) {
		/*
		 * 4) Question: Print Factors of a Number
		 * 
		 * Question: Write a Java program to print all the factors of the number 24
		 * using a loop.
		 * 
		 * A factor is a number that divides another number completely without leaving a remainder.
		 * 
		 * Expected Output:
		 * 
		 * Factors of 24 are: 1 2 3 4 6 8 12 24
		 */
		int num=24;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
			else
				continue;
		}

	}

}
