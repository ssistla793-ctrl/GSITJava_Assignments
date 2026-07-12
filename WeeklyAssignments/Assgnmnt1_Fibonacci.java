package WeeklyAssignments;

public class Assgnmnt1_Fibonacci {

	public static void main(String[] args) {
		/*
		 * 5)Print Fibonacci Series
		 * 
		 * Question: Write a Java program to print the first 10 terms of the Fibonacci
		 * series using a loop.
		 * 
		 * Expected Output:
		 * 
		 * 0 1 1 2 3 5 8 13 21 34
		 */
		int first=0;int second=1;
		int temp;
		for(int i=1;i<=10;i++)
		{
			System.out.println(first);
			temp=first+second;
			first=second;
			second=temp;
			
		}

	}

}
