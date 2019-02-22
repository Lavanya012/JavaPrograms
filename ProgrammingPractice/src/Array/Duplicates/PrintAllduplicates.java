package Array.Duplicates;

public class PrintAllduplicates {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 3 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
