package com.leetcode.topInterviewQuesitons;
/*
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Your algorithm's runtime complexity must be in the order of O(log n).

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
 */
public class Problem33 
{
	public static void main(String[] args)
	{
		int[]arr= {4,5,6,7,0,1,2};
		int target=0;
		
		System.out.println(search(arr,target));
	}
	public static int search(int[] arr, int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int mid= left+(right-left)/2;
			if(arr[mid]>arr[right])
			{
				left=mid+1;
			}
			else
			{
				right=mid;
			}
		}
		
		int start=left;
		left=0;
		right=arr.length-1;
		if(target>=arr[start]&& target<=arr[right])
		{
			left=start;
		}
		else
		{
			right=start-1;
		}
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==target)
			{
				return mid;
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
		
		return -1;
	}

}
