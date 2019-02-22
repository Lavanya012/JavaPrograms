package Array;

public class ReverseAnnArray {

	public static void main(String[] args) {
		int[] arr = { 34, 1, 2, 3, 4, 7, 6 };
		int start = 0;
		int temp = 0;
		int end = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
