package com.leetcode.yahoo;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

Note:

The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.
Example 1:

Input: s = "leetcode", wordDict = ["leet", "code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple", "pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
             Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
Output: false
 */

//Yahoo Question

public class Problem139 
{
	
	public static void main(String[] args) 
	{
		String s="leetcodecode";
		List<String> strs= new ArrayList<String>();
		strs.add("leet");
		strs.add("code");
		strs.add("apple");
		boolean bo=checkDictionary(s,strs);
		System.out.println(bo);
		
	}
	
	public static boolean checkDictionary(String s, List<String> strs)
	{
		int n=s.length();
		boolean[] bo=new boolean[n+1];
		
		bo[0]=true;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				//if(bo[j]&&strs.contains(s.substring(j,i)))
				if(strs.contains(s.substring(j,i)))
						
				{
					bo[i]=true;
					//break;
				}
			}
		}
		
		return bo[n];
	}
	

}
