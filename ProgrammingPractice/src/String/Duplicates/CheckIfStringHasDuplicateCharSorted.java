package String.Duplicates;

import java.util.Arrays;

public class CheckIfStringHasDuplicateCharSorted {

	public static void main(String[] args) {
		String A = "helo";
		char[] arr = A.toCharArray();
		Arrays.sort(arr);
		boolean flag = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			System.out.println("Has duplicates");
		}

		else {
			System.out.println("No duplicates");
		}

	}

}
