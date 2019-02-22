package String;

import java.util.Arrays;

public class StringsAreAnagram {

	String A = "hello";
	String B = "lloeh";

	public boolean isAnagram() {
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		if (A.length() != B.length()) {
			
			System.out.println("Both Strings are not of same length so not Anagram");

			System.exit(0);
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {

				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		StringsAreAnagram anagram = new StringsAreAnagram();
		if (anagram.isAnagram()) {
			System.out.println("Both Strings are  Anagram");
		} else {
			System.out.println("Both Strings are not Anagram");
		}

	}

}
