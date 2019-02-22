package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordAndNumberOfOccurance {

	public static void main(String[] args) {

		String s = "jj Hello Hi Hello jj rr".toLowerCase();

		/**
		 * Case 1: If String is Empty
		 */
		if (s.isEmpty()) {
			System.out.println("String is Empty");
			System.exit(0);
		}
		String[] arr = s.split(" ");

		/**
		 * Case 2: If String is a single word String
		 */
		if (arr.length == 1) {
			System.out.println("It's a single word string");
			System.exit(0);
		}

		/**
		 * Case 3: If String has duplicate words
		 */

		Map<String, Integer> map = new HashMap<>();

		for (String word : arr) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);

			else {
				map.put(word, 1);
			}
		}

		Set<String> set = map.keySet();
		for (String values : set) {
			if (map.get(values) > 1) {
				System.out.println(values + ":-" + map.get(values));
			}

			
		}

	}

}
