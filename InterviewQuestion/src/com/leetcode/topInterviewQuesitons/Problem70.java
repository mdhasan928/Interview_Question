package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.List;

/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
public class Problem70 
{
	public static void main(String[] args)
	{
		int n=10;
		System.out.println(climbStairs(n));
	}
	
	public static int climbStairs(int n)
	{
		List<Integer> dp=new ArrayList<>();
		dp.add(0,1);
		dp.add(1,1);
		for(int i=2;i<=n;i++)
		{
			dp.add(i,dp.get(i-1)+dp.get(i-2));
		}
		return dp.get(n);
		
	}

}
