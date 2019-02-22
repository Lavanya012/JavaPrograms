package Array;

import java.util.Arrays;

public class ReverseBySwapping {

	public static void main(String[] args) {
		String A = "hello";
		swap(A);

	}

	static void swap(String A) {
		char[] arr = A.toCharArray();
		char tt;
		int start = 0;
		int end = arr.length-1;

		for (int i = start; i < arr.length; i++) {
			tt = arr[i];
			arr[i] = arr[end];
			arr[end] = tt;
			end--;
			//System.out.println(tt);
			System.out.println(arr[i]);
		}
		
		String news=Arrays.toString(arr);
		System.out.println(news);

	}

}
