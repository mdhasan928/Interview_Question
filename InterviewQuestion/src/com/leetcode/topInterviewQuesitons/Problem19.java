package com.leetcode.topInterviewQuesitons;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */
public class Problem19 
{
	ListNode listNode=new ListNode();
	public static void main(String[] args)
	{
		LNode l1=new LNode(1);
		LNode l2=new LNode(2);
		LNode l3=new LNode(3);
		LNode l4=new LNode(4);
		LNode l5=new LNode(5);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		//LNode result=removeNthFromStart(l1,4);
		//LNode result=removeNthFromEnd(l1,4);
		//LNode result=removeNthFromEndNi(l1,3);
		LNode result=removeNthFromEndCounter(l1,3);
		while(result!=null)
		{
			System.out.print(" "+result.val);
			result=result.next;
		}
		
	}
	public static LNode removeNthFromEnd(LNode head, int n)
	{
		LNode dummy_head=new LNode(0);
		dummy_head.next=head;
		
		LNode fast=dummy_head;
		LNode slow=dummy_head;
		
		for(int i=1; i<=n+1;i++)
		{
			fast=fast.next;
		}
		while(fast!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		
		return dummy_head.next;
	}
	
	public static LNode removeNthFromStart(LNode head, int n)
	{
		LNode dummy_head=new LNode(0);
		dummy_head.next=head;
		
		LNode fast=dummy_head;
		
		for(int i=1; i<n;i++)
		{
			fast=fast.next;
		}
		
		fast.next=fast.next.next;
		
		return dummy_head.next;
	}
	
	public static LNode removeNthFromEndNi(LNode l1, int n) {
        LNode listNode = l1;
       List<LNode> list = new ArrayList<>();
       while(listNode.next != null){
           list.add(listNode);
           listNode = listNode.next;
       }
       list.add(listNode);
       
       if(list.size() == 1)
           return null;
       if(list.size() == n)
           return l1.next;
       list.get(list.size()-n-1).next = list.get(list.size()-n).next;
       return l1;
       
   }
 
	public static LNode removeNthFromEndCounter(LNode head, int n)
	{
		LNode dummy_head=new LNode(0);
		dummy_head.next=head;
		
		LNode pointer=dummy_head;
		LNode pointer1=dummy_head;
		int counter=0;
		while(pointer!=null)
		{
			counter++;
			pointer=pointer.next;
		}
		for(int i=1; i<counter-n;i++)
		{
			pointer1=pointer1.next;
		}
		
		pointer1.next=pointer1.next.next;
		
		return dummy_head.next;
	}
	
}


class LNode
{
	int val;
	LNode next;
	
	public int getVal() {
		return val;
	}
	
	public LNode(int val) {
		super();
		this.val = val;
	}
	
	

}