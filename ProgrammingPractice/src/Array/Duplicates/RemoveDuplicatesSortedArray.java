package Array.Duplicates;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6, 6 };
		int[] temp = new int[arr.length];
		int k = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k] = arr[i];
				k++;
			}

		}
		temp[k] = arr[arr.length - 1];

		for (int j = 0; j <= k; j++) {
			System.out.println(temp[j]);
		}

	}

}
