package PracticeTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicateWordsAndNumberOfOccurance {
	
	static int count=0;

	public static void main(String[] args) {
		String A = "hello hi hello there hello there hi";

		String[] words = A.split("\\s+");

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}

		}

		for(String word:words)
		{
			if(map.get(word)>1)
			{
				 count++;
			}
		}
		
		if(count>1)
		{
			System.out.println("String does not have all unique char");
		}
		

	}

}
