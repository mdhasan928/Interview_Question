package com.leetcode.topInterviewQuesitons;

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
 */
public class Problem49 
{
	public static void main(String[] args)
	{
		
		String[] str= {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result=groupAnagarm(str);
		System.out.println(result);
	}
	public static List<List<String>> groupAnagarm(String[] str)
	{
		List<List<String>> result=new ArrayList<>();
		
		if(str.length==0|| str==null)
		{
			return result;
		}
		Map<String, List<String>> map=new HashMap<>();
		
		for(String word:str)
		{
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String key=new String(ch);
			while(!map.containsKey(key))
			{
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
			
		}
		
		result.addAll(map.values());
		
		//return new ArrayList<>(map.values());
		return result;	
	}

}
