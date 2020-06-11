package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;
/*
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class Problem66 
{
	public static void main(String[] args) 
	{
		int[] digits= {4,9,9};
		System.out.println(" "+Arrays.toString(plusOne(digits)));
	}
	
	/*
	 * Three cases:
	 * 1. if elements <9
	 * 2. if elements=9
	 * 3. if all elements are 9
	 */
	
	public static int[] plusOne(int[] digits) {
        if(digits.length==0)
        {
            return digits;
        }
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9) // for plus one
            {
               digits[i]++; 
            return digits;
            }
            digits[i]=0;   // if element 9 set it to 0
        }
        int[] new_digits= new int[n+1]; // if all the elements are 9
        new_digits[0]=1;
        return new_digits;
    }

}
