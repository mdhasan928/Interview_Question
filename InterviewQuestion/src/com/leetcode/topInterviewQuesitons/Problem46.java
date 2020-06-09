package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
public class Problem46 
{
	public static void main(String[] args)
	{
		int[] arr= {1,1,3};
		System.out.println(permute(arr));
	}
	public static List<List<Integer>> permute(int[] arr)
	{
		List<List<Integer>> result=new ArrayList<>();
        if(arr.length==0|| arr==null) 
        {
        	return result;	
		}
        Arrays.sort(arr); // for duplicate elements
        List<Integer> cur=new ArrayList<> ();
        boolean[] visited=new boolean[arr.length];
		helper(result,arr,cur,visited);
		
		return result;
	}
	
	private static void helper (List<List<Integer>> result, int[] arr, List<Integer> cur, boolean[] visited) 
    {
		if(cur.size()==arr.length) 
		{
			result.add(new ArrayList(cur));
			return;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(visited[i])
			{
				continue;
			}
			if(i>0&&arr[i]==arr[i-1]&&!visited[i-1]) // for duplicate elements
			{
				continue;
			}
			visited[i]=true;
			cur.add(arr[i]);
			helper(result,arr,cur,visited);
			cur.remove(cur.size()-1);
			visited[i]=false;
		}
	}

}
