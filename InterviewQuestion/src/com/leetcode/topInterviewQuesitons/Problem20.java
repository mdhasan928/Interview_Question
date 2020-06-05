package com.leetcode.topInterviewQuesitons;

import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class Problem20 
{
	public static void main(String[] args)
	{
		String s= "{[]}([()])";
		System.out.println(isValidParen(s));
	}
	public static boolean isValidParen(String s)
	{
		if(s.length()==0||s==null)
		{
			return false;
		}
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			if((ch==')'&& stack.peek()=='(')||(ch=='}'&& stack.peek()=='{')||(ch==']'&& stack.peek()=='[')) 
			{
				stack.pop();
			}
			/*else if(ch=='}'&& stack.peek()=='{')
			{
				stack.pop();
			}
			else if(ch==']'&& stack.peek()=='[')
			{
				stack.pop();
			}*/
		}
		if(stack.isEmpty())
		{
			return true;
		}
		
		return false;
	}

}
