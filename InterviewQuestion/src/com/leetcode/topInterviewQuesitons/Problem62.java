package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;

/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 7 x 3 grid. How many possible unique paths are there?

 

Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
Example 2:

Input: m = 7, n = 3
Output: 28
 */

public class Problem62 
{
	public static void main(String[] args)
	{
		int m=8;
		int n=11;
		System.out.println(uniquePaths(m,n));
	}
	
	public static int uniquePaths(int m, int n)
	{
		int[][] grid= new int[m][n];
		for(int i=0;i<m;i++)
		{
			grid[i][0]=1;
		}
		for(int i=0;i<n;i++)
		{
			grid[0][i]=1;
		}
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				grid[i][j]=grid[i-1][j]+grid[i][j-1];
			}
		}
		for(int i=0;i<m;i++)
		{
			System.out.println(Arrays.toString(grid[i]));
		}
		return grid[m-1][n-1];
	}

}
