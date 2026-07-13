package Publish.DailyAssignments;

public class Assgnmt2_ASCII_A_Z_30_06_2026 {

	public static void main(String[] args) {
		/*Using while loop
		 * Print ASCII values of A to Z
		 * 
		 * Output: A = 65 B = 66 ... Z = 90
		 */
		char ch='A';
		int asc_val=ch;
		
		while(ch<='Z')
		{
			System.out.println(ch+"="+asc_val);
			ch+=1;
		}
		
	}

}
