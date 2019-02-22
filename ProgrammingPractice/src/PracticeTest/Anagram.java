package PracticeTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String A = "abcd";
		String B = "dabf";
		boolean isAnagram = false;

		char[] arryA = A.toCharArray();
		char[] arryB = B.toCharArray();

		Arrays.sort(arryA);
		Arrays.sort(arryB);

		for (int i = 0; i < arryA.length; i++) {
			if (arryA[i] == arryB[i]) {
				isAnagram = true;
			} else {
				isAnagram = false;
			}
		}
		
		System.out.println(isAnagram);

	}

}
