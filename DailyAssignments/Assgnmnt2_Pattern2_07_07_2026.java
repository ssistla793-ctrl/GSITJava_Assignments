package Publish.DailyAssignments;

public class Assgnmnt2_Pattern2_07_07_2026 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=2*(rows-i);k++)
			{
				System.out.print("@ ");
			}
			for(int m=1; m<=i; m++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int k=1;k<=2*(rows-i);k++)
			{
				System.out.print("@ ");
			}
			for(int m=1; m<=i; m++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
	}

}
}

