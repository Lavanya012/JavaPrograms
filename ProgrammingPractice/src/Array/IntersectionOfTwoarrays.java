package Array;

public class IntersectionOfTwoarrays {

	public static void main(String[] args) {
		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };
		int[] temp = new int[arr1.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					temp[k++] = arr1[i];

				}
			}
		}

		for (int i = 0; i < k; i++) {
			System.out.println(temp[i]);
		}

	}

}
