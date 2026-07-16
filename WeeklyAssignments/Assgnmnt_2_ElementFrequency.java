package Publish.WeeklyAssignments;

public class Assgnmnt_2_ElementFrequency {

	public static void main(String[] args) {
		/*
		 * Question 3: Frequency of Each Element Problem Statement Print the frequency
		 * of every unique element in the array. Do not print the frequency of the same
		 * element more than once. 
		 * Sample Input int arr[] = {4, 2, 4, 6, 2, 2, 7};
		 * Expected Output 
		 * 4 occurs 2 times
		 * 2 occurs 3 times
		 * 6 occurs 1 time
		 * 7 occurs 1 time
		 */
		
		int arr[] = {4, 2, 4, 6, 2, 2, 7}; 
		int count = 0;
		for(int i =0;i<arr.length;i++)
		{
			boolean duplicate=false;
			for(int k=0; k<i;k++)
			{
				if(arr[i]==arr[k])
				{
					duplicate = true;
					break;
				}
			}
			if(duplicate)
				continue;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
				
			System.out.println(arr[i]+" occurs "+ count+ " time" );
			count = 0;	
		}

	}

}
