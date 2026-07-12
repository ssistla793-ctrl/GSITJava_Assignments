package WeeklyAssignments;

public class Assignmnt1_CountDigits {

	public static void main(String[] args) {
		/* 2) Count Digits
		 * 
		 * Question: Write a Java program to count the number of digits in the number
		 * 987654 using a loop.
		 * 
		 * Expected Output:
		 * 
		 * Number of digits = 6
		 */
		int num = 987654;
		int count=0;
		for(;num!=0;)
		{
			num=num/10;
			count++;
			System.out.println(num);
		}
		System.out.println(count);

	}

}
