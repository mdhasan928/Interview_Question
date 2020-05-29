package com.leetcode.topInterviewQuesitons;
/*
 * Given a string s, find the longest palindromic substring in s. You may assume that 
 * the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class Problem5 
{
	/*
	 *  abcabab
	 *  abcab length=5
	 */
	public static void main(String[] args)
	{
		String s= "abcbaaaaaa";
		System.out.println(longestPalindromicSubstring(s));
	}
	
	
	public static String longestPalindromicSubstring(String s)
	{
		 int n=s.length();
		 int length=0;
		 int start=0;
		 int end=0;
		
		if(n==0||s==null)
		{
			return "";
		}
		
		for(int i=0;i<n;i++)
		{  
			int length1=expandAroundCenter(s,i,i);
			int length2=expandAroundCenter(s,i,i+1);
			length=Math.max(length1, length2);
			if(length>end-start)
			{
				start=i-(length-1)/2;
				end=i+length/2;
			}
			
		}
		return s.substring(start, end+1); //end+1 because of last charcter
		
	}
		public static int expandAroundCenter(String s, int left, int right)
		{
			int n=s.length();
			int l=left;
			int r=right;
			
			while(l>=0&&r<n&&s.charAt(l)==s.charAt(r))
			{
				l--;
				r++;
				
			}
		
	
		    return r-l-1; //because l becomes negative
	    }

}
