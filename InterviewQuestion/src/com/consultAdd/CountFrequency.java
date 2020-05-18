package com.consultAdd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CountFrequency {
	

		public static void main(String[] args) {
			ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(1);//= {1,2,2,4,5,5,5,7};
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(5);
			list.add(5);
			list.add(3);
			list.add(5);
			list.add(5);
			list.add(3);
			list.add(5);
			list.add(5);
			list.add(5);
			list.add(5);
			list.add(5);
			list.add(15);
			list.add(15);
			list.add(7);
			list.add(7);
			list.add(7);
			list.add(7);
			list.add(1);
			//list.sort(null);
			countFreq(list);
			
		}
		
		
		/*public static void countFreq(ArrayList<Integer> list) {
			int n= list.size();
			int count=1;
			int saveCount=0;
			
					
			for(int i=0;i<n-1;i++) {
				if(list.get(i)!=list.get(i+1))  {
					System.out.println(list.get(i)+" contains= "+count+" times");
					count=1;
				}
				if(list.get(i)==list.get(i+1)) {
					count++;
					saveCount=count;
				}
					
			}
			if(list.get(n-1)==list.get(n-2))  {
				System.out.println(list.get(n-1)+" contains= "+saveCount+" times");
			}
			else {
				System.out.println(list.get(n-1)+" contains= "+count+" times");
			}
	
		}
		
		*/
		
		
		// Using collections
		
		public static void countFreq(ArrayList<Integer> list) {
			int n= list.size();
			int count=1;
			Set<Integer> s= new HashSet<Integer>();
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++) {
				if(s.contains(list.get(i))) {
					count++;
					map.put(list.get(i), count);
				}
				else {
					s.add(list.get(i));
					count=1;
					map.put(list.get(i), count);
				}
					
			}
			for (Entry<Integer, Integer> entry : map.entrySet()) {
			    Integer key = entry.getKey();
			    Integer value = entry.getValue();
			    System.out.println("key, " + key + " value " + value);
			}

		}
}
