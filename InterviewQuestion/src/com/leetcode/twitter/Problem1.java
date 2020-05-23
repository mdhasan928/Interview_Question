package com.leetcode.twitter;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class Problem1 
{
	public static void main(String[] args)
	{
		int[] arr= {3,4,2,6,7,8};
		int target=12;
		int[] result=twoSum(arr,target);
		for(Integer num:result)
		{
			System.out.print(" "+num);
		}
		
	}

	public static int[] twoSum(int[] arr, int target)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int complement=target-arr[i];
			
			if(map.containsKey(complement)&&map.get(complement)!=i)
			{
				return new int[] {i, map.get(complement)};	
			}
		}
		return new int[] {0,0};
		
	}
}
