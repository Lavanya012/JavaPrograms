package String;

public class LongestSizeOfAString {

	int length;
	int maxlength = 0;
	String longestWord = "";

	public static void main(String[] args) {
		String A = "121 2332 teste";

		LongestSizeOfAString ls = new LongestSizeOfAString();
		ls.LongestSize(A);
	}

	private void LongestSize(String a) {

		String[] words = a.split("\\s+");

		for (String string : words) {

			length = string.length();

			if (length >= maxlength) {
				maxlength = length;
				longestWord = string;
			}

		}
		System.out.println("Length of string:-" + maxlength);
		System.out.println("Longest String:-" + longestWord);
	}

}
