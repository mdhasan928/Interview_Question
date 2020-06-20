package com.leetcode.topInterviewQuesitons51to100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */

public class Problem102 
{
	
	public static List<List<Integer>> leveOrder(TreeNode root)
	{
		List<List<Integer>> result =new ArrayList<>();
		if(root==null)
		{
			return result;
		}
		Queue<TreeNode> que=new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty())
		{
			int queSize=que.size();
			List<Integer> levelList=new ArrayList<>();
			for(int i=0;i<queSize;i++)
			{
				TreeNode currentNode=que.poll();
				levelList.add(currentNode.val);
				if(currentNode.left!=null)
				{
					que.offer(currentNode.left);
				}
				if(currentNode.right!=null)
				{
					que.offer(currentNode.right);
				}
			}
			result.add(levelList);
			
		}
		return result;
	}

}
