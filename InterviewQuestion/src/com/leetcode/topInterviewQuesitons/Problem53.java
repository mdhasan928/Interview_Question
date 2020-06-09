package com.leetcode.topInterviewQuesitons;
/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class Problem53 
{
	public static void main(String[] args)
	{
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
		
	}
	public static int maxSubArray(int[] arr)
	{
		if(arr.length<1)
		{
			return -1;
		}
		int finalResult=arr[0];
		int result=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		  result=Math.max(arr[i], result+=arr[i]) ;
		   
		   if(result>finalResult)
		   {
			   finalResult=result;
		   }
		  
	    }
		return finalResult;
	}

}
