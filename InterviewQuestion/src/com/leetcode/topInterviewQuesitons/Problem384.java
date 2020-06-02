package com.leetcode.topInterviewQuesitons;

import java.util.Arrays;
import java.util.Random;

/*
 * Shuffle a set of numbers without duplicates.

Example:

// Init an array with set 1, 2, and 3.
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
solution.shuffle();

// Resets the array back to its original configuration [1,2,3].
solution.reset();

// Returns the random shuffling of array [1,2,3].
solution.shuffle();
 */
public class Problem384 
{
	Random rand = new Random();
	public int[] originalArray=null, shuffleArray=null;
	
	public Problem384(int[] nums) 
	{
		originalArray=nums;
	    shuffleArray=Arrays.copyOf(nums, nums.length);
	}
	
	public  int[] reset()
	{
		return originalArray;
	}
	
	public int[] shuffle()
	{
		//shuffleArray=new int[originalArray.length];
		for(int i=0;i<shuffleArray.length;i++)
		{
			int randomIndexToSwap = rand.nextInt(shuffleArray.length);
			swap(shuffleArray, i, randomIndexToSwap);
		}
		return shuffleArray;
	}
	
    public static void swap(int[] arr, int i, int j)
    {
    	int temp=arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    }
    
    public static void main(String[] args)
	{
		int[] arr= { 1, 2, 3, 4, 5, 6, 7 };
		Problem384 solution=new Problem384(arr);

		int[] s=solution.shuffle();
		System.out.println(Arrays.toString(s));
		
		System.out.println("Reset to original: ");
		int[]r= solution.reset();
		System.out.println(Arrays.toString(r));
		 
		
	}
}
