package com.leetcode.yahoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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
		int[] arr= {3,5,6,8,9,1};
		int target=13;
		int[] output=twoSum(arr,target);
		
		for(int i=0;i<output.length;i++) 
		{
			System.out.print(output[i]+" ");
		}
	}
	
	public static int[] twoSum(int[] arr, int target) 
	{
		int n=arr.length;
		Map<Integer, Integer> map1= new HashMap<Integer, Integer>();
		
		//inserting key and values in map
		for(int i=0;i<n;i++) 
		{
			map1.put(arr[i], i);
		}
		
		//to get the result
		for(int i=0;i<n;i++) 
		{   
			int comp=target-arr[i];
			
		    if(map1.containsKey(comp)&& map1.get(comp)!=i) 
		    {
		    	return new int[] {i, map1.get(comp)};
		    }
		}
	    throw new IllegalArgumentException("There are no two sum");
	    
	}

}
