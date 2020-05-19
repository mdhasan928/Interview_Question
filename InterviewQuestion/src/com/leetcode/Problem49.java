package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */

//Yahoo Question
public class Problem49 {
	
	public static void main(String[] args)
	{
		Problem49 p49=new Problem49();
		String[] strs= {"cat","top","tac","pot","atc","mog"};
		List<List<String>> result=p49.groupAnagrams(strs);
		System.out.print("[ ");
		/*
		for(int i=0;i<result.size();i++) 
		{   System.out.print("[");
			for(int j=0;j<result.get(i).size();j++)
			{
				System.out.print(" "+result.get(i).get(j));
			}
			System.out.print("]");
		}
		*/
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i)+",");
		}
		System.out.print(" ]");
		
	}
	
	public List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String,List<String>> map=new HashMap<>();
		for(String word:strs) 
		{
			char[] c=word.toCharArray();
			Arrays.sort(c);
			String key=new String(c);
			if(!map.containsKey(key)) 
			{
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
		}
		
		return new ArrayList<>(map.values());
	}

}
