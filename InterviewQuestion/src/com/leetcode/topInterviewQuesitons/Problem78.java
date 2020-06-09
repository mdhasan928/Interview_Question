package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
public class Problem78 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,2};
		System.out.println(subSet(arr));
	
	}
	public static List<List<Integer>> subSet(int[] arr)
	{
		List<List<Integer>> result=new ArrayList<>();
		if(arr.length<1)
		{
			return result;
		}
		Arrays.sort(arr);// for duplicate elements
		List<Integer> cur=new ArrayList<>();
		int index=0;
		helper(result,arr,cur,index);
		return result;
		
	}
	
	private static void helper(List<List<Integer>> result, int[] arr, List<Integer> cur, int index)
	{
		if(index==arr.length) 
		{
			result.add(new ArrayList<>(cur));
			return;
		}
		
		cur.add(arr[index]);
		helper(result,arr,cur,index+1);
		cur.remove(cur.size()-1);
		while(index+1<arr.length&&arr[index+1]==arr[index])
		{
			index++;
		}
		helper(result,arr,cur,index+1);
	}

}
