package String;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateWordsAndMainTainSeq {

	public static void main(String[] args) {

		String a = "Hello jj Hello Hi  jj rr ".toLowerCase();
		String[] arr = a.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (String word : arr) {

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}

		}
		
		Set<String> set= map.keySet();
		for (String val : set) {
			
			if(map.get(val)==2)
			{
				System.out.println(val);
			}
			
		}

	}
}
