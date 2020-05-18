package com.consultAdd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * Frequency of elements in a list
 */

public class CountFrequency {
	

		public static void main(String[] args) {
			ArrayList<Integer> list= new ArrayList<Integer>();
			ArrayList<String> list1= new ArrayList<String>();
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
			list1.add("hasan");
			list1.add("hasan");
			list1.add("kamal");
			list1.add("hasan");
			list1.add("hasan");
			list1.add("moti");
			list1.add("moti");
			list1.add("hasan");
			list1.add("John");
			countFreq(list); // without using collections
			countFreqInteger(list);// Using Collections Set and Map for Integer values
			countFreqString(list1);	//Using Collections Set and Map for String values
		}
		
		//Without using Collections
		public static void countFreq(ArrayList<Integer> list) {
			list.sort(null);
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
		
		// Using collections Map and Set
		
		//for Integers
		public static void countFreqInteger(ArrayList<Integer> list) {
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
			System.out.println("\n=============For Integer================");
			for (Entry<Integer, Integer> entry : map.entrySet()) {
			    Integer key = entry.getKey();
			    Integer value = entry.getValue();
			    System.out.println(key + " appears " + value+ " times.");
			}

		}
		
		//for String
				public static void countFreqString(ArrayList<String> list) {
					int n= list.size();
					int count=1;
					Set<String> s= new HashSet<String>();
					Map<String,Integer> map=new HashMap<String,Integer>();
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
					System.out.println("\n=============For String================");
					for (Entry<String, Integer> entry : map.entrySet()) {
					    String key = entry.getKey();
					    Integer value = entry.getValue();
					    System.out.println(key + " appears " + value+ " times.");
					}

				}
}
