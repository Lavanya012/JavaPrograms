package Array;

import java.util.HashSet;

public class RemoveDuplicatesFromUnSortedArray {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 3, 5, 1, 4, 4 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);

		}
		
		for (Integer in : set) {
			System.out.println(in);
			
		}

	}

}
