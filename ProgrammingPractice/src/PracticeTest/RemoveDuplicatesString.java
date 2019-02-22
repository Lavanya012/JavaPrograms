package PracticeTest;

import java.util.Arrays;

public class RemoveDuplicatesString {

	public static void main(String[] args) {

		String a = "helllo";
		char[] arr = a.toCharArray();
		String duplicates = "";

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i]);
				duplicates = duplicates + arr[i];

			}
		}

		duplicates = duplicates + arr[arr.length - 1];

		System.out.println(duplicates);
	}

}
