package Publish.DailyAssignments;

public class Assgnmnt1_Pattern1_07_07_2026 {
	/*
	 * 1. Diamond Pattern (5 Rows)
	 *
	 ***
	 *****
	 *******
	 *********
	 *******
	 *****
	 ***
	 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 9; 
		for (int i = 1; i <= row; i++) 
		{ if (i % 2 == 0) 
			continue; 
			for (int j = 1; j <= (row - i) / 2; j++)
			{ 
				System.out.print(" "); 
			}
			for (int k = 1; k <= i;k++) 
			{ 
				System.out.print("*"); 
			}	 
				System.out.println(); 
		}
		for (int i = row; i >= 1; i--) 
		{
		    if (i % 2 == 0)
		    	continue;
		    // Spaces
		    for (int j = 1; j <= (row - i)/2; j++) 
		    {
		        System.out.print(" ");
		    }
		    // Stars
		    for (int k = 1; k <= i; k++) 
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}

