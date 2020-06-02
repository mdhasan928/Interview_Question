package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

public class Problem15 
{
	public static void main(String[] args)
	{
		int[] arr= {-1, 0, 1, 2, -1, -4};
		int target=0;
		System.out.println(threeSum(arr,target));
		
	}
	public static List<List<Integer>> threeSum(int[] arr, int target)
	{
		Arrays.sort(arr);
		List<List<Integer>> list= new ArrayList<>();
		
		for(int i=0;i<arr.length-2;i++)
		{
			int l=i+1, r=arr.length-1;
			
			if(i>=1&& arr[i]==arr[i-1]) 
			{
				continue;
				
			}
			while(l<r)
			{   int sum=arr[i]+arr[l]+arr[r];
				if(sum==target) {
					list.add(Arrays.asList(arr[i], arr[l], arr[r]));
					while((l+1<r)&&arr[l+1]==arr[l])
					{
						l++;
					}
					while((r-1>l)&& arr[r]==arr[r-1])
					{
						r--;
					}
					l++;
					r--;
				}
				else if(sum>target)
				{
					r--;
				}
				else
				{
					l++;
				}
			}
		}
		return list;
	}
 
}
