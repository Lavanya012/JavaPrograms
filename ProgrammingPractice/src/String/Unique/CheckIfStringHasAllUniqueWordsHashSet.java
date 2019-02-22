package String.Unique;

import java.util.HashSet;

public class CheckIfStringHasAllUniqueWordsHashSet {

	public static void main(String[] args) {
		String A = "hi there how are you hi";
		boolean flag = false;

		String[] words = A.split("\\s+");

		HashSet<String> set = new HashSet<String>();

		for (String word : words) {
			if (set.add(word)) {
				flag = true;
			} else {
				flag = false;
			}
		}

		System.out.println(flag);

	}
}
