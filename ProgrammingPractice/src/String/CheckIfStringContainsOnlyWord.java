package String;

import java.util.regex.Pattern;

public class CheckIfStringContainsOnlyWord {

	public static void main(String[] args) {

		String A = "abcuygiuyiuyiuy";

		String B = A.replaceAll("[a-z,A-Z]", "");

		int size = B.length();

		if (size > 0) {
			System.out.println("String does not have all letters");
		}

		else {
			System.out.println("String have all letters");
		}

		if (Pattern.matches("\\d", A) == true) {
			System.out.println("String does not have all letters");
		}

		else {
			System.out.println("String have all letters");

		}
	}

}
