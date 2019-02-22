package String.Unique;

import java.util.LinkedHashSet;

public class FindUniqueWordsOfAStringHashSet {

	public static void main(String[] args) {
		String A = "there Hello there Hello there";

		String[] words = A.split("\\s+");
		/*Hash Set Won't allow duplicates and linked HashSet will maintain Order*/
		LinkedHashSet<String> set = new LinkedHashSet<>();

		for (String word : words) {

			set.add(word);

		}

		for (String ss : set) {
			System.out.println(ss);
		}

	}

}
