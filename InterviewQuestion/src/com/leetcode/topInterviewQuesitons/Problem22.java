package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class Problem22 
{
	public static void main(String[] args)
	{
		int n=2;
		System.out.println(generateParenthesis(n));
	}
	public static List<String> generateParenthesis(int n)
	{
		List<String> list=new ArrayList<>();
		backtrack(list,"",0,0,n);
		return list;
	}
	
	public static void backtrack(List<String> list,String s, int left, int right, int n ) 
	{

		if(s.length()==2*n)
		{
			list.add(s);
		}
		if(left<n)
		{
			backtrack(list, s+"(",left+1,right, n);
		}
		if(right<left)
		{
			backtrack(list,s+")",left,right+1,n);
		}
		
	}

}
