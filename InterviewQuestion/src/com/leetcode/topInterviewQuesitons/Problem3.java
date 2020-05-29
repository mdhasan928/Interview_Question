package com.leetcode.topInterviewQuesitons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Problem3 
{
	public static void main(String[] args)
	{
		String s="abbcabcbb";
		System.out.println(longestSubstrig(s));
	}
	public static int longestSubstrig(String s)
	{
		if(s==null||s.length()==0)
		{
			return 0;
		}
		
		Set<Character> set=new HashSet<>();
		int length=0;
		int left=0, right=0;
		
		while(right<s.length())
		{
			if(set.contains(s.charAt(right)))
			{
				set.remove(s.charAt(left));
				left++;
		
			}
			else
			{
				set.add(s.charAt(right));
				right++;
				length=Math.max(length, set.size());
				
			}
		}
		return length;
	}

}
