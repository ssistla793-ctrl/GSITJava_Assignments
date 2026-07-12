package WeeklyAssignments;

public class Assignmnt1_SumOfDigits {

	public static void main(String[] args) {
		/*
		 * 3) Sum of Digits
		 * Question: Write a Java program to find the sum of digits of the number 4567.
		 * 
		 * Expected Output:
		 * 
		 * Sum of digits = 22
		 */
		int num=4567;
		int sum=0;
		for(;num>0;)
		{
			int temp=num%10;
			num=num/10;
			sum=sum+temp;
		}
		System.out.println("Sum of the digits in 4567 is: "+sum);

	}

}
