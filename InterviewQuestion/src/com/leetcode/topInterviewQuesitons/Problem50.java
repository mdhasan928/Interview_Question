package com.leetcode.topInterviewQuesitons;
/*
 * Implement pow(x, n), which calculates x raised to the power n (xn).

Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
Example 3:

Input: 2.00000, -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class Problem50 
{
	public static void main(String[] args)
	{
		double x=2;
		int n=8;
		System.out.println("Result="+myPower(x,n));
	}
	public static double myPower(double x, int n)
	{
		double result=0;
		if(n<0)
		{
		    result= helper(1/x,n);
		    return result;
		}
		else
		{
		     result=helper(x,n);
		     return result;
		}
	}
	
	private static double helper(double x, int n)
	{

		if(n==0)
		{
			return 1;
		}
		double y=helper(x,n/2);
	    if(n%2==0)
		{
	    	//System.out.println(y*y);
		  	return y*y;
		  	
		}
		else
		{
			//System.out.println(y*y*x);
			return y*y*x;
		}
	}

}
