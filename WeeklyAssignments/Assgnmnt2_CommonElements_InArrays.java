package Publish.WeeklyAssignments;

public class Assgnmnt2_CommonElements_InArrays {

	public static void main(String[] args) {
		/*
		 * Question 2: Find Common Elements Problem Statement Given two integer arrays
		 * of the same size, print all common elements. Avoid printing duplicate common
		 * elements.
		 * Sample Input int arr1[] = {2, 5, 7, 9, 11, 5}; int arr2[] = {1, 5, 7, 15, 20, 5}; 
		 * Expected Output 5 7
		 */
		int arr1[] = {2, 5, 7, 9, 11, 5}; 
		int arr2[] = {1, 5, 7, 15, 20, 5}; 
		for(int i=0;i<arr1.length;i++)
		{
			boolean alreadyprinted = false;
			
			for(int k=0; k<i;k++)
			{
				if(arr1[i]==arr1[k])
				{
					alreadyprinted = true;
					break;
				}
			}
			if(alreadyprinted)
				continue;
			
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					break;
				}
				
			}
		}
		
	}

}

