package String;

public class LongestPalindromeOfAString {

	int length;
	int maxlength = 0;
	String longestWord = "";

	public static void main(String[] args) {
		String A = "121 2332";

		LongestPalindromeOfAString ls = new LongestPalindromeOfAString();
		ls.longestPalindrome(A);

	}

	private void longestPalindrome(String a) {

		String[] words = a.split("\\s+");
		String rev = "";

		for (String string : words) {
			rev = "";
			for (int i = string.length() - 1; i >= 0; i--) {
				rev = rev + string.charAt(i);
			}

			if (rev.equals(string)) {
				length = string.length();

				if (length >= maxlength) {
					maxlength = length;
					longestWord = string;
				}

			}

		}

		System.out.println("Length of string:-"+maxlength);
		System.out.println("Longest Palindrome String:-"+longestWord);
	}

}
