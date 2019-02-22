package Array.Duplicates;

public class RemoveDuplicatesUnSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 1, 5, 6, 6 };
		int temp[] = new int[arr.length];
		int k = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;

				}

			}

			if (flag == false) {
				temp[k] = arr[i];
				k++;
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(temp[i]);
		}
	}

}
