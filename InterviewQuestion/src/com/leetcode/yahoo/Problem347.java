package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
 */

public class Problem347 
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<>();
		list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);
		list.add(2);list.add(2);list.add(3);
		list.add(3);list.add(3);list.add(3);list.add(9);list.add(9);list.add(9);
		list.add(9);list.add(9);list.add(9);list.add(9);
		int k=2;
		System.out.println(mostFrequenElements(list,k));
	}
	
	public static List<Integer> mostFrequenElements(List<Integer> list, int k)
	{
		int n=list.size();
		//int count=1;
		List<Integer> tempList=new ArrayList<>();
		List<Integer> resultList=new ArrayList<>();
		Map<Integer, Integer> map=new HashMap<>();
		//Set<Integer> set= new HashSet<>();
		//for(int i=0;i<n;i++)
		for(Integer num:list)
		{   
			//to count frequency of elements in the List
			map.put(num, map.getOrDefault(num,0)+1);
			
			//or
			/*if(set.contains(list.get(i)))
			{   count++;
				map.put(list.get(i), count);
			}
			else
			{
				set.add(list.get(i));
				count=1;
				map.put(list.get(i), count);
				
			}*/
		}
		
		//sort map by values 
		LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>(); 
		map.entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByValue())
		    .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		   
		
		for(Entry<Integer,Integer>entry:sortedMap.entrySet())
		{
			Integer value=entry.getValue();
			Integer key=entry.getKey();
			tempList.add(key);
			
		}
		
		for(int i=tempList.size()-1;i>=(tempList.size()-k);i--)
		{
			
			resultList.add(tempList.get(i));

		}
	    return resultList;
	}

}
