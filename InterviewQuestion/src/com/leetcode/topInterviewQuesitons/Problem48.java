package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;

/*
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
 */
public class Problem48 
{
	public static void main(String[] args)
	{
		int[][] matrix= {
				          {1,2,3},
				          {4,5,6},
				          {7,8,9}
		            	};
		rotateImage(matrix);
	}
	public static void rotateImage(int[][] matrix)
	{
		if(matrix.length<1)
		{
			System.out.println(0); 
		}
		transpose(matrix);
		flipHorizontally(matrix);
		for(int i=0;i<matrix.length;i++)
		{
			System.out.println(Arrays.toString(matrix[i]));
		}
		
	}
	
	private static void transpose(int[][] matrix)
	{
		int n=matrix.length;
		for(int i=0;i<n;i++) 
		{
			for(int j=i;j<n;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
			
		}
		
	}
	
	private static void flipHorizontally(int[][] matrix)
	{
		int n=matrix.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n/2;j++)
			{
				int temp=matrix[i][j];
				matrix[i][j]=matrix[i][n-1-j];
				matrix[i][n-1-j]=temp;
			}
		}
		
	}

}
