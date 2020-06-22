package com.leetcode.topInterviewQuesitons51to100;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 */
public class Problem101 
{
	
	public static void main(String[] args)
	{
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(3);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(4);
		System.out.println(isSymmetric(root));
	}
	/*
	//recursive
	
	public static boolean isSymmetric(TreeNode root)
	{
		if(root==null)
		{
			return true;
		}
		return isSymmetric(root.left,root.right);
	}
	
	private static boolean isSymmetric(TreeNode left, TreeNode right )
	{
		if(left==null||right==null)
		{
			return left==right;
		}
		if(left.val!=right.val)
		{
			return false;
		}
		
		return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
		
	}
	*/
	
	
	//iterative
	
	 public static boolean isSymmetric(TreeNode root)
		{
			if(root==null)
			{
				return true;
			}
			Queue<TreeNode> q1=new LinkedList<>();// for left subtree
			Queue<TreeNode> q2=new LinkedList<>();//for right subtree
			q1.offer(root.left);
			q2.offer(root.right);
	        
			while(!q1.isEmpty() && !q2.isEmpty())
			{
				TreeNode n1=q1.poll();
				TreeNode n2=q2.poll();
				if((n1==null&&n2!=null)||(n1!=null&&n2==null))
	            {
					return false;
	            }
	            if(n1!=null)
	            {
				    if(n1.val!=n2.val)
	                {
					   return false;
	                }
				    q1.offer(n1.left);
			    	q1.offer(n1.right);
			    	q2.offer(n2.right);
			    	q2.offer(n2.left);
	            }
				
			}
			return true;
		}


}

class TreeNode
{
	Integer val;
	TreeNode left;
	TreeNode right;
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode(Integer val) {
		super();
		this.val = val;
	}

}
