package com.leetcode.topInterviewQuesitons;
/*
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class Problem55 
{
	/*
	 * This is a dynamic programming[1] question. Usually, solving and fully understanding a dynamic programming problem is a 4 step process:

     1. Start with the recursive backtracking solution
     2. Optimize by using a memoization table (top-down[2] dynamic programming)
     3. Remove the need for recursion (bottom-up dynamic programming)
     4. Apply final tricks to reduce the time / memory complexity
     
     All solutions presented below produce the correct result, but they differ in run time and memory requirements.
	 */
	
	
	public static void main(String[] args)
	{
		//int[] nums= {2,3,1,1,4};
		int[] nums= {3,2,1,0,4};
		System.out.println(canJump(nums));
	}
	
	
	/*
	 * Approach 1: Backtracking
     This is the inefficient solution where we try every single jump pattern that takes us from the first position to the last. We start from 
     the first position and jump to every index that is reachable. We repeat the process until last index is reached. When stuck, backtrack.
	 */
	/*
	   public static boolean canJumpFromPosition(int position, int[] nums) {
	        if (position == nums.length - 1) {
	            return true;
	        }

	        int furthestJump = Math.min(position + nums[position], nums.length - 1);
	        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
	            if (canJumpFromPosition(nextPosition, nums)) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static boolean canJump(int[] nums) {
	        return canJumpFromPosition(0, nums);
	    }
	    */
	
	
	    // other approaches are in leetCode solution 
	
	    
	    /*
	     * Approach 4: Greedy
          Once we have our code in the bottom-up state, we can make one final, important observation. From a given position, when we try to see if we can jump to a GOOD position, we only ever use one - the first one (see the break statement). In other words, the left-most one. If we keep track of this left-most GOOD position as a separate variable, we can avoid searching for it in the array. Not only that, but we can stop using the array altogether.

          Iterating right-to-left, for each position we check if there is a potential jump that reaches a GOOD index (currPosition + nums[currPosition] >= leftmostGoodIndex). If we can reach a GOOD index, then our position is itself GOOD. Also, this new GOOD position will be the new leftmost GOOD index. Iteration continues until the beginning of the array. If first position is a GOOD index then we can reach the last index from the first position.

          To illustrate this scenario, we will use the diagram below, for input array nums = [9, 4, 2, 1, 0, 2, 0]. We write G for GOOD, B for BAD and U for UNKNOWN. Let's assume we have iterated all the way to position 0 and we need to decide if index 0 is GOOD. Since index 1 was determined to be GOOD, it is enough to jump there and then be sure we can eventually reach index 6. It does not matter that nums[0] is big enough to jump all the way to the last index. All we need is one way.

          Index	0	1	2	3	4	5	6
          nums	9	4	2	1	0	2	0
          memo	U	G	B	B	B	G	G
	     */
	    
	        public static boolean canJump(int[] nums) {
	            int lastPos = nums.length - 1;
	            for (int i = nums.length - 1; i >= 0; i--) {
	                if (i + nums[i] >= lastPos) {
	                    lastPos = i;
	                }
	            }
	            return lastPos == 0;
	        }
	   

}
