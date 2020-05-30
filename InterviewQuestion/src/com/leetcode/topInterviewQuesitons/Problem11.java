package com.leetcode.topInterviewQuesitons;
/*
 * Given n non-negative integers a1, a2, ..., an , where each represents a 
 * point at coordinate (i, ai). n vertical lines are drawn such that the two 
 * endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together 
 * with x-axis forms a container, such that the container contains the most water.
 * Input: [1,8,6,2,5,4,8,3,7]
   Output: 49
 */
public class Problem11 
{
	/*
	 * coordinats are (0,1),(1,8), (2,6), ...
	 */
	public static void main(String[] args)
	{
		int[] arr= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(arr));
	}
     public static int  maxArea(int[] arr)
     {   int area=0;
         int l=0;
         int r=arr.length-1;
         if(arr.length==0)
         {
        	 return 0;
         }
         while(l<r)
         {
        	     area=Math.max(area, (r-l)*Math.min(arr[l], arr[r]));
        	     if(arr[l]<=arr[r])
        	     {
        		     l++;
          	 }
         	 else
         	 {
        		    r--;
        	     }
         }
     
     
    	 return area;
     }
}
