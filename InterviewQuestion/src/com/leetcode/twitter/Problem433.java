package com.leetcode.twitter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/*
 * A gene string can be represented by an 8-character long string, with choices from "A", "C", "G", "T".

Suppose we need to investigate about a mutation (mutation from "start" to "end"), where ONE mutation is defined as ONE single character changed in the gene string.

For example, "AACCGGTT" -> "AACCGGTA" is 1 mutation.

Also, there is a given gene "bank", which records all the valid gene mutations. A gene must be in the bank to make it a valid gene string.

Now, given 3 things - start, end, bank, your task is to determine what is the minimum number of mutations needed to mutate from "start" to "end". If there is no such a mutation, return -1.

Note:

Starting point is assumed to be valid, so it might not be included in the bank.
If multiple mutations are needed, all mutations during in the sequence must be valid.
You may assume start and end string is not the same.
 

Example 1:

start: "AACCGGTT"
end:   "AACCGGTA"
bank: ["AACCGGTA"]

return: 1
 

Example 2:

start: "AACCGGTT"
end:   "AAACGGTA"
bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]

return: 2
 

Example 3:

start: "AAAAACCC"
end:   "AACCCCCC"
bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]

return: 3
 */
public class Problem433 
{
	public static void main(String[] args)
	{
		String start= "AACCGGTT";
		String	end=   "AAACGGTA";
		String[] bank= {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
		int result=minMutation(start,end,bank);
		System.out.println(result);
	}

    public static int minMutation(String start, String end, String[] bank) {
        // check input
        if (start == null || start.length() < 8 || end == null || end.length() < 8) {
            throw new IllegalArgumentException("the input is invalid");
        }

        char[] candidates = new char[]{'A', 'C', 'G', 'T'};
        Set<String> genes = new HashSet<>(Arrays.asList(bank));

        // BFS
        Map<String, Integer> distanceMap = new HashMap<>();
        distanceMap.put(start, 0);
        Queue<String> queue = new LinkedList<>();
        queue.add(start);

        while (queue.size() > 0) {
            String curr = queue.remove();
            int distance = distanceMap.get(curr);

            if (curr.equals(end)) {
                return distance;
            }

            char[] chars = curr.toCharArray();
            for (int i = 0; i < 8; i ++) {
                char originalChar = chars[i];

                for (int j = 0; j < candidates.length; j ++) {
                    if (candidates[j] == originalChar) {
                        continue;
                    }
                    chars[i] = candidates[j];
                    String newStr = String.valueOf(chars);
                    if (!genes.contains(newStr) || distanceMap.containsKey(newStr)) {
                        continue;
                    }

                    distanceMap.put(newStr, distance + 1);
                    queue.add(newStr);
                }

                chars[i] = originalChar;
            }
        }

        return -1;
    }
}
