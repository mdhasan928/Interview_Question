package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class Problem54 
{
	public static void main(String[] args) 
	{
		int[][] matrix= {  
				         {1, 2, 3, 4},
				         {5, 6, 7, 8},
				         {9,10,11,12}
						};
		System.out.println(spiralMatrix(matrix));
	}
	public static List<Integer> spiralMatrix(int[][] matrix)
	{
		List<Integer> result=new ArrayList<>();
		if(matrix.length==0||matrix==null)
		{
			return result;
		}
		int top=0;
		int bottom=matrix.length-1;
		int left=0;
		int right=matrix[0].length-1;
		int size=matrix.length*matrix[0].length;
		while(result.size()<size)
		{
			//for top of the matrix
			for(int i=left;i<=right&&result.size()<size;i++)
			{
				result.add(matrix[top][i]);
			}
			top++;
			
			//for right of the matrix
			for(int i=top;i<=bottom&&result.size()<size;i++)	
			{
				result.add(matrix[i][right]);
			}
			right--;
			
			//for the bottom of the matrix
			for(int i=right;i>=left&&result.size()<size;i--)
			{
				result.add(matrix[bottom][i]);
			}
			bottom--;
			
			//for left of the matrix
			for(int i=bottom;i>=top&&result.size()<size;i--)
			{
				result.add(matrix[i][left]);
			}
			left++;
		}
		return result;
	}

}
