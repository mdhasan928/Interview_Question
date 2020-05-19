package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Follow up:

A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?
 */

public class Problem75 
{
	
	public static void main(String[] args)
	{
		int[] arr= {2,0,2,1,1,0,2,1,2};
		List<List<Integer>> result=sortColor(arr);
		for(int i=0;i<result.size();i++)
		{
			for(int j=0;j<result.get(i).size();j++)
			{
				System.out.print(" "+result.get(i).get(j));
			}
		}
		/*
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i));
		}
		*/
	}
	
	public static List<List<Integer>> sortColor(int[] arr)
	{
		Map<Integer, List<Integer>> map= new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
		   int key=arr[i];
		   if(!map.containsKey(key)) 
		   {
			   map.put(key, new ArrayList<>());
		   }
		   map.get(key).add(arr[i]);
		
		}
		
		return new ArrayList<>(map.values());
	}

}
