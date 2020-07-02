package com.leetcode.topInterviewQuesitons51to100;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]


 */
public class Problem118 {
	
	public static void main(String[] args) {
		int rowNum=5;
		List<List<Integer>> result=pascalTriangle(rowNum);
		System.out.println(result);
	}

	public static List<List<Integer>> pascalTriangle(int rowNum){
		List<List<Integer>> result=new ArrayList<>();
		
		List<Integer> row=new ArrayList<>();
		int n=0;
		while(n<rowNum) {
			row.add(0,1);
			for(int i=1;i<row.size()-1;i++) {
				row.set(i, row.get(i)+row.get(i+1));
			}
			result.add(new ArrayList(row));
			
			n++;
		}
		
		return result;
	}
}
