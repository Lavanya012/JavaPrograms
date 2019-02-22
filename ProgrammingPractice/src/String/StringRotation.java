package String;

import java.util.Arrays;

public class StringRotation {
	/**
	 * Input : s1 = "ABCD", s2 = "CDAB" Output : True String s1 is rotation of
	 * s2.
	 * 
	 * Input : s1 = "ABAD", s2 = "ADAB" Output : True
	 * 
	 * Input : s1 = ABCD, and s2 = ACBD Output : False
	 */

	String A = "abcd";
	String B = "abb";
	
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
		

		/**
		 * Method 1 - By sorting both Strings
		 */
		/*
		 * Method 1 - Concat first strings 
		  if (A.length() == B.length() && A.concat(A).contains(B)) {
		 * System.out.println(true); }
		 * 
		 * else { System.out.println(false); }
		 */

		/**/

		
		
	}		
		
}
