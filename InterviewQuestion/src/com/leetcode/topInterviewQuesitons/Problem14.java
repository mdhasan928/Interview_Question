package com.leetcode.topInterviewQuesitons;
/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class Problem14 
{
	public static void main(String[] args)
	{
		String[] sArr= {"flower","flow","flight"};
		System.out.println(commonPrefix(sArr));
	}
	public static String commonPrefix(String[] sArr)
	{
		if(sArr.length==0)
		{
			return " ";
		}
		String prefix=sArr[0];
		
		for(int i=1;i<sArr.length;i++)
		{
			while(sArr[i].indexOf(prefix)!=0)// always returns -1 because prefix index always 0
			{
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
				{
					return " ";
				}
			}
		}
		
		return prefix;
	}

}
