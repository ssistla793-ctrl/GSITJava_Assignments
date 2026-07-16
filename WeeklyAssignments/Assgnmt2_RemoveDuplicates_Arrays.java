package Publish.WeeklyAssignments;

import java.util.Arrays;

public class Assgnmt2_RemoveDuplicates_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Question 1: Remove Duplicate Prints 
		 * Problem Statement Print only the unique elements from an array.
		 * Do not use another array or any collection. 
		 * Sample Input int arr[] = {5, 3, 8, 5, 2, 3, 9, 8};
		 * Expected Output 5 3 8 2 9
		 */
			int arr[]={5, 3, 8, 5, 2, 3, 9, 8};
			for(int i=0;i<arr.length;i++)
			{
				boolean duplicate=false;
				for(int j=0;j<i;j++)
				{
					if(arr[i]==arr[j])
					{
						duplicate = true;
						break;
					}
				}
				
				if(!duplicate)
				{
					System.out.println(arr[i]);
				}
					
			}		
				
	}

}
