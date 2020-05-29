package com.leetcode.topInterviewQuesitons;
/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class Problem4 
{
	public static void main(String[] args)
	{
		int[] a= {1, 2,12,18};
		int[] b= {3,4,7,9};
		System.out.println(median(a,b));
	}
	public static double median(int[] a, int[] b)
	{
		int n1=a.length;
		int n2=b.length;
		int[] ab= new int[n1+n2];
		int i=0, j=0,k=0; double median=0;
	   /* only works if length of a and b are equal
		for(int i=0;i<ab.length;i++)
		{
			if(a[j]<b[k]) 
			{
				ab[i]=a[j];
				j++;
			}
			else
			{
				ab[i]=b[k];
				k++;
			}
		
		}
		*/
		
		// for any size
		
		//case1: until both arrays has the elements 
		while(i<n1&&j<n2)
		{
			if(a[i]<=b[j])
			{
				ab[k]=a[i];
				i++;
			}
			else
			{
				ab[k]=b[j];
				j++;
			}
			k++;
			
		}
		//case2: if a has more elements than b
		while(i<n1)
		{
			ab[k]=a[i];
			i++;
			k++;
		}
		
		//case3: if b has more elements than a
		while(j<n2)
		{
			ab[k]=b[j];
			j++;
			k++;
		}
		
		int m=ab.length/2;
		if(ab.length%2!=0)
		{
			median=(double) ab[m];
		}
		else
		{
			median=(double)(ab[m-1]+ab[m])/2;
		}
		
		return median;
	}

}
