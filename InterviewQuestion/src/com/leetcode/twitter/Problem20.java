package com.leetcode.twitter;

import java.util.ArrayDeque;
import java.util.Deque;
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
		String s= "(){[]}[]";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s)
	{
		int n=s.length();
		//Deque<Character> stack= new ArrayDeque<>();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<n;i++) 
		{
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
			{
				stack.push(s.charAt(i));
			}
			else 
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else if(stack.peek()!='('&& s.charAt(i)==')')
				{
					return false;
				}
			
			    else if(s.charAt(i)=='}'&& stack.peek()!='{') 
			    {
				    return false;
			    }
			    else if(s.charAt(i)==']'&& stack.peek()!='[')
			    {
				    return false;
			    }
				
			    stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
