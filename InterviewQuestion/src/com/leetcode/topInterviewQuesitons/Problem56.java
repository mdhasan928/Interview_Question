package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class Problem56 
{
	public static void main(String[] args)
	{
		int[][] intervals= {{1,3},{8,10},{2,6},{15,18}};
		int[][] result=merge(intervals);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(" "+Arrays.toString(result[i]));
		}
		
	}
	
	 public static int[][] merge(int[][] intervals) {
	       
	        List<int[]> merge=new ArrayList<>();
	        
	       if(intervals.length==0)
	       {
	           return intervals;
	       }
	       Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
	       
	       int[] currentInterval=intervals[0];
	       merge.add(currentInterval);
	       
	      
	       
	       for(int[] interval:intervals)
	       {
	    	  int currentStart=currentInterval[0];
	    	  int currentEnd=currentInterval[1];
	    	  int nextStart=interval[0];
	    	  int nextEnd=interval[1];
	    	  
	    	  if(currentEnd>=nextStart)
	    	  {
	    		 currentInterval[1]=Math.max(currentEnd, nextEnd); 
	    	  }
	    	  else
	    	  {
	    		  currentInterval=interval;
	    		  merge.add(currentInterval);
	    	  }
	       }
	       
	       
	       
	      
	        return merge.toArray(new int[merge.size()][]);
	    }

}
