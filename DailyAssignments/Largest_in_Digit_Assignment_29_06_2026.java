package DailyAssignments;

public class Largest_in_Digit_Assignment_29_06_2026 {

	public static void main(String[] args) {
		/*
		 * Find Largest Digit
		 * 
		 * Write a Java program to find the largest digit in a given number. Example:
		 * Input: 59371 Output: 9
		 */
		
		int num=59371;
		int largest=0;
		while(num!=0)
		{
			int temp=num%10;
			num=num/10;
			if(temp>largest)
				largest=temp;
		}
		System.out.println(largest);
	}

}
