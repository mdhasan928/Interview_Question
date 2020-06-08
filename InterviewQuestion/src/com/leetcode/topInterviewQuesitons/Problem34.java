package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;

/*
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class Problem34 
{
	public static void main(String[] args)
	{
		int[] arr= {5,7,7,8,8,8,8,9,10};
		int target=7;
		int[] result=searchRange(arr,target);
		System.out.println(Arrays.toString(result));
	}
	
	//myself
	/* 
	public static int[] searchRange(int[] arr, int target)
	{	
	    if(arr.length==0)
		{
			return new int[] {-1,-1};
		}
		int start=0;
		int end=0;
		int left=0;
		int right=arr.length-1;
		
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			if(arr[mid]==target)
			{
				start=mid;
				break;
				
			}
			else if(arr[mid]<target)
			{
				left=mid;
			}
			else 
			{
				right=mid;
			}
			
		}
		end=start;
		right=arr.length-1;
		
		for(int i=start;i<arr.length-1;i++)
		{
			if(arr[end]==arr[end+1])
			{
				end++;
			}
		}
		
		return new int[] {start,end};
	}
  */
	public static int[] searchRange(int[]arr, int target)
	{
		int[] result= new int[2];
		result[0]=findStartingIndex(arr, target);
		result[1]=findEndingIndex(arr,target);
		return result;
	}
	
	public static int findStartingIndex(int[] arr, int target)
	{
		int index=-1;
		int start=0;
		int end =arr.length-1;
		while(start<=end)
		{
			int midpoint=start+(end-start)/2;
			if(arr[midpoint]>=target)
			{
				end=midpoint-1;
			}
			else
			{
				start=midpoint+1;
			}
			if(arr[midpoint]==target)
			{
				index=midpoint;
			}
		}
		
		return index;
	}
	public static int findEndingIndex(int[] arr, int target)
	{
		int index=-1;
		int start=0;
		int end =arr.length-1;
		while(start<=end)
		{
			int midpoint=start+(end-start)/2;
			if(arr[midpoint]<=target)
			{
				start=midpoint+1;
			}
			else
			{
				end=midpoint-1;
			}
			if(arr[midpoint]==target)
			{
				index=midpoint;
			}
		}
		
		return index;
	}
}
