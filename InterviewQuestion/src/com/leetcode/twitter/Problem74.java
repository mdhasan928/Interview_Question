package com.leetcode.twitter;
/*
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
Example 2:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
 */
public class Problem74 {
	public static void main(String[] args)
	{
		int[][] matrix = {
		          {1,   3,  5,  7},
		          {10, 11, 16, 20},
		          {23, 30, 34, 50}
		         };
		int target=16;
		System.out.println(searchMatrix(matrix,target));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target)
	{
		int m= matrix.length; 
		int n=matrix[0].length; 
		int left=0;
		int right=m*n-1;
		if(matrix==null||matrix.length==0||matrix[0].length==0||matrix[0][0]>target
				||matrix[m-1][n-1]<target)
		{
			return false;
		}
		while(left<=right)
		{
			int mid=left+(right-left)/2;  //System.out.println(mid);
			int row=mid/n;                //System.out.println(row);
			int column=mid%n;             //System.out.println(column);
			if(matrix[row][column]==target)
			{
				return true;
			}
			else if(matrix[row][column]>target)
			{
				right=mid-1;
			}
			else 
			{
				left=mid+1;
			}
		}
		
		return false;
	  	
	}

}
