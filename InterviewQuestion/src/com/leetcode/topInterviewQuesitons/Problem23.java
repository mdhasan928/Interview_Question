package com.leetcode.topInterviewQuesitons;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6
 */
public class Problem23 
{
	public static void main(String[] args)
	{
		LNode l11=new LNode(1);
		LNode l12=new LNode(4);
		LNode l13=new LNode(5);
		l11.next=l12;
		l12.next=l13;
		LNode l21=new LNode(1);
		LNode l22=new LNode(3);
		LNode l23=new LNode(4);
		l21.next=l22;
		l22.next=l23;
		LNode l31=new LNode(2);
		LNode l32=new LNode(6);
		l31.next=l32;
		LNode[] lists= {l11,l21,l31};
		LNode result=kSortedList(lists);
		while(result!=null)
		{
			System.out.print(" "+result.val);
			result=result.next;
		}
	}
	public static LNode kSortedList(LNode[] lists)
	{
		LNode result=new LNode(0);
		LNode pointer=result;
		
		Queue<Integer> heap=new PriorityQueue<>();
		for(LNode node:lists)
		{
			while(node!=null)
			{
				heap.add(node.val);
				node=node.next;
			}
			
		}
		
		while(!heap.isEmpty())
		{
			pointer.next=new LNode(heap.remove());
			pointer=pointer.next;
		}
		
		return result.next;
	}

}
