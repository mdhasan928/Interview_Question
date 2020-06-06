package com.leetcode.topInterviewQuesitons;
/*
 * Given two integers dividend and divisor, divide two integers without using multiplication, division and mod operator.

Return the quotient after dividing dividend by divisor.

The integer division should truncate toward zero, which means losing its fractional part. For example, truncate(8.345) = 8 and truncate(-2.7335) = -2.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = truncate(3.33333..) = 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = truncate(-2.33333..) = -2.
Note:

Both dividend and divisor will be 32-bit signed integers.
The divisor will never be 0.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 231 − 1 when the division result overflows.
 */
public class Problem29 
{
	public static void main(String[] args) 
	{
		int dividend=258124694;
		int divisor=-3;
		System.out.println(divide(dividend,divisor));
	}
	public static int divide(int dividend, int divisor)
	{
		if(divisor==0) {
			return 0;
		}
		if(dividend<Integer.MIN_VALUE||dividend>Integer.MAX_VALUE)
		{
			return Integer.MAX_VALUE;
		}
		if(divisor<Integer.MIN_VALUE||divisor>Integer.MAX_VALUE)
		{
			return Integer.MAX_VALUE;
		}
		int sign1=(dividend<0)?-1:1;
		int sign2=(divisor<0)?-1:1;
		dividend=Math.abs(dividend);
		divisor=Math.abs(divisor);
		
		int quotient=0;
		while(dividend>=divisor)
		{   
			
			dividend=dividend-divisor;
			quotient++;
		}
		
		return sign1*sign2*quotient;
	}

}

















