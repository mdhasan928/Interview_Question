package com.leetcode.topInterviewQuesitons51to100;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 
 */
public class Problem125 {
	
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		int l=0;
		int r=s.length()-1;
		while(l<r) {
			while(l<r&&!Character.isLetterOrDigit(s.charAt(l))) {
				l++;
			}
			while(l<r&& !Character.isLetterOrDigit(s.charAt(r))) {
				r--;
			}
			
			if(l<r&&Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
				return false;
			}
			l++;
			r--;
		}
    
		return true;
	}

}
