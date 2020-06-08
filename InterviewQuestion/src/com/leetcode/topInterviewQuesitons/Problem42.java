package com.leetcode.topInterviewQuesitons;
/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class Problem42 
{
	public static void main(String[] args)
	{
		int[] arr= {0,1,0,2,1,0,1,3,2,1,2,};
		System.out.println(trapWater(arr));
	}
	
	
	public static int trapWater(int[] arr)
	{
		if(arr.length==0||arr==null)
		{
			return 0;
		}
		int res=0,level=0, l=0, r=arr.length-1;
		
		while(l<r)
		{
			int lower=arr[arr[l]<arr[r]?l++:r--];
		    level=Math.max(level,lower);
		    res+=level-lower;
		}
		
		return res;
	}

}
