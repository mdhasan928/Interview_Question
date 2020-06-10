package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;

public abstract class Problem59 
{
	public static void main(String[] args)
	{
		int n=5;
		int[][] result=generateMatrix(n);
		for(int i=0;i<result[0].length;i++)
		{
			System.out.println(Arrays.toString(result[i]));
		}
			
	}
	 public static int[][] generateMatrix(int n) {
	        int[][] matrix= new int[n][n];
	        if(n<1){
	           return matrix;
	        }
	        int size=1;//result.length*result[0].length;
	        int left=0;
	        int right=n-1;
	        int top=0;
	        int bottom=n-1;
	        while(size<=n*n)
	        {
	            for(int i=left;i<=right;i++)
	            {
	                matrix[top][i]=size++;
	            }
	            top++;
	            for(int i=top;i<=bottom;i++)
	            {
	                matrix[i][right]=size++;
	            }
	            right--;
	            for(int i=right;i>=left;i--)
	            {
	                matrix[bottom][i]=size++;
	            }
	            bottom--;
	            for(int i=bottom;i>=top;i--)
	            {
	                matrix[i][left]=size++;
	            }
	            left++;
	        }
	        
	        return matrix;
	    }

}
