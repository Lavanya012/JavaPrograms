package Array;

public class SecondLargestNumOfArray {

	public static void main(String[] args) {
		int[] arr = { 10, 6, 2, 3, 4, 5 };
		int largest = 0;
		int slargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				slargest = largest;
				largest = arr[i];
			}

			if (slargest < arr[i] && arr[i] != largest) {
				slargest = arr[i];
			}
		}

		System.out.println(largest);
		System.out.println(slargest);
	}

}
