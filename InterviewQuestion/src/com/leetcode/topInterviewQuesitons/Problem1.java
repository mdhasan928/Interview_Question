package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		/*
		int[] nums={2,7,11,15};
		int target=9;
		int[] result=twoSum(nums,target);
		for(Integer num:result)
		{
			System.out.print(" "+num);
		}
		*/
		List<Integer> list= new ArrayList<>();
		list.add(2); list.add(7);list.add(11);list.add(15);
		int target=22;
		System.out.println(twoSum(list,target));
	}
	
	// using array
	/*public static int[] twoSum(int[] arr, int target)
	{
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int complement=target-arr[i];
			if(map.containsKey(complement)&& map.get(complement)!=i)
			{
				return new int[] {i, map.get(complement)};
			}
		}
		return new int[] {};
	}
	*/
	
	//using list
	public static List<Integer> twoSum(List<Integer> list, int target)
	{
		List<Integer>  indexList=new ArrayList<>();
		Map<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<list.size();i++)
		{
			map.put(list.get(i), i);
		}
		for(int i=0;i<list.size();i++){
			{
				int complement= target-list.get(i);
				if(map.containsKey(complement)&& map.get(complement)!=i)
				{
					indexList.add(i);
					indexList.add(map.get(complement));
					break;
				}
			}
		}
		return indexList;
	}

}
