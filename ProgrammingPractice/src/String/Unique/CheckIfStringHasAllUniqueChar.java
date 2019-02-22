package String.Unique;

import java.util.HashSet;

public class CheckIfStringHasAllUniqueChar {

	public static void main(String[] args) {
		String A = "hhelo";
		char[] arr = A.toCharArray();
		boolean flag = false;

		HashSet<Character> set = new HashSet<Character>();

		for (char c : arr) {

			if (set.add(c)) {

				flag = true;

			}

			else {
				flag = false;
				break;
			}

		}

		System.out.println(flag);

	}

}
