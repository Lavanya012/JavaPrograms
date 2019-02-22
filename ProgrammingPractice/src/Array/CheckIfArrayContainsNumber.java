package Array;

public class CheckIfArrayContainsNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int num = 6;
		boolean contains = false;

		for (int val : arr) {
			if (val == num) {
				contains = true;
			}

			else {
				contains = false;
			}
		}

		System.out.println(contains);

	}

}
