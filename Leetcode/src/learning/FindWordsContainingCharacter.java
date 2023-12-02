package learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindWordsContainingCharacter 
{

	public static void main(String[] args) 
	{
		/*
		 * 2942. Find Words Containing Character Easy 66 2 Companies You are given a
		 * 0-indexed array of strings words and a character x.
		 * 
		 * Return an array of indices representing the words that contain the character
		 * x.
		 * 
		 * Note that the returned array may be in any order.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: words = ["leet","code"], x = "e" Output: [0,1] Explanation: "e" occurs
		 * in both words: "leet", and "code". Hence, we return indices 0 and 1. Example
		 * 2:
		 * 
		 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a" Output: [0,2] Explanation:
		 * "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2. Example 3:
		 * 
		 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z" Output: [] Explanation:
		 * "z" does not occur in any of the words. Hence, we return an empty array.
		 */
		
		
		String[] words = {"abc","bcd","aaaa","cbc"};
		char x = 'a';
		List<Integer> list =  new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].contains(String.valueOf(x)))
			{
				list.add(i);
			}
		}
		
		System.out.println(list);

	}
	
	//Explanation
	
		/*
		 * Logic i used is to iterate over the array and use the inbuilt String.valueOf to convert the character to String so that 
		 * I can use the contains method easily and add them to the arraylist
		 */


}
