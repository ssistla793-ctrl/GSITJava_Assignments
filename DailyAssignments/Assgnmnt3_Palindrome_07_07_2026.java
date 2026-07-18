package Publish.DailyAssignments;

public class Assgnmnt3_Palindrome_07_07_2026 {

	public static void main(String[] args) {
		int rows = 4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			int num=1;
			for(int k=1;k<=i;k++)
			{	
				
				System.out.print(num);
				num++; //2
			}
			for(int k=0;k<=i;k++)
			{	
				System.out.print(num--);	
			}
			System.out.println();
		}
			
	}

}
