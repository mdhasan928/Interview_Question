package com.leetcode.yahoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */

public class Problem387 
{
	public static void main(String[] args)
	{
		String s="lleettccodde";
		int index=firstUniqueCharater(s);
		System.out.println("Index: "+index);
	}

	public static int firstUniqueCharater(String s)
	{
		Map<Character, Integer> map=new HashMap<>();
		int[] freq=new int[26];
		int n=s.length();
		for(int i=0;i<n;i++)
		{
			//map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
			freq[s.charAt(i)-'a']++; //take the asci value and add one to that index
			
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(freq[s.charAt(i)-'a']==1)
			{
				return i;
			}
		}
		
		/*
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			//Integer value=entry.getValue();
			//Character ch=entry.getKey();
			System.out.print(" "+entry.getValue());
			System.out.print(" "+entry.getKey());
			if(entry.getValue()==1)
			{
				return s.indexOf(entry.getKey());
			}
	
		}
		*/
		return -1;
	}
	
}
