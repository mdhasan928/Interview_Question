package com.leetcode.topInterviewQuesitons;
/*
 * Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 

Constraints:

board and word consists only of lowercase and uppercase English letters.
1 <= board.length <= 200
1 <= board[i].length <= 200
1 <= word.length <= 10^3
 */

public class Problem79 
{
	public static void main(String[] args)
	{
		char[][] board= {
				{'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
                {'B','P','E','R'}
                
		};
		String word="ASFDEER";
		System.out.println(searchWord(board,word));
	}
	public static boolean searchWord(char[][] board, String word)
	{
		if(board.length==0||board[0].length==0||word.length()==0)
		{
			return false;
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				if(helper(board,i,j,0,word))
				{
					return true;
				}
			}
				
		}
		return false;
	}
	
	private static boolean helper(char[][] board,int i,int j, int count, String word)
	{
		if(count==word.length())
		{
			return true;
		}
		if(i<0||i>=board.length||j<0||j>=board[i].length||board[i][j]!=word.charAt(count))
		{
			return false;
		}
		
		char temp=board[i][j];
		board[i][j]= ' ';
		boolean found=helper(board,i-1,j,count+1,word)
				|| helper(board,i+1,j,count+1,word)
				|| helper(board,i,j-1,count+1,word)
				|| helper(board,i,j+1,count+1,word);
		board[i][j]=temp;
		return found;
	}

}




















