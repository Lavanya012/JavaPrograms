package Array;

public class PairsOfIntArraySumEqualTogivenNum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5,4,6 };
		int n = 9;

		int i, j;
		for (i = 0; i < arr.length; i++) {

			for (j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == n) {
					System.out.println("Pair found:"+arr[i] + " and " + arr[j]);
				}

			}

		}
	}
}
