package String.Unique;

import java.util.LinkedHashSet;

public class FindAllUniqueCharHashSet {

	public static void main(String[] args) {
		String A = "hello";

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < A.length(); i++) {
			set.add(A.charAt(i));
		}

		for (char c : set) {
			System.out.println(c);
		}

	}

}
