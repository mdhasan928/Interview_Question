package com.leetcode.topInterviewQuesitons;
/*
 * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
public class Problem21 
{
	public static void main(String[] args)
	{
		SortNode l11=new SortNode(1);
		SortNode l12=new SortNode(4);
		SortNode l13=new SortNode(6);
		l11.next=l12;
		l12.next=l13;
		
		SortNode l21=new SortNode(2);
		SortNode l22=new SortNode(3);
		SortNode l23=new SortNode(5);
		SortNode l24=new SortNode(9);
		
		
		l21.next=l22;
		l22.next=l23;
		l23.next=l24;
		
		SortNode result=mergeTwoLists(l11,l21);
		while(result!=null)
		{
			System.out.print(" "+result.val);
			result=result.next;
		}
	}
	public static SortNode mergeTwoLists(SortNode l1, SortNode l2)
	{
		//SortNode dummy_head=new SortNode(0);
		//SortNode pointer1=new SortNode(0);
		SortNode pointer1 =l1;
		//SortNode pointer2= new SortNode(0);
		SortNode pointer2=l2;
		
		SortNode result=new SortNode(0);
		//SortNode pointer3= new SortNode(0);
		SortNode pointer3=result;
		
		while(pointer1!=null&&pointer2!=null)
			{
				if(pointer1.val<pointer2.val)
				{
					pointer3.next=pointer1;
					pointer1=pointer1.next;
				}
				else
				{
					pointer3.next=pointer2;
					pointer2=pointer2.next;
				}
				pointer3=pointer3.next;
			}
		if(pointer1!=null)
		{  
			pointer3.next=pointer1;
			pointer1=pointer1.next;
		 	
		}
		
		if(pointer2!=null)
		{
			pointer3.next=pointer2;
			pointer2=pointer2.next;
		}
		
		return result.next;
	}

}
class SortNode
{
	int val;
	SortNode next;
	
	public int getVal() {
		return val;
	}

	public SortNode(int val) {
		super();
		this.val = val;
	}
	
}
