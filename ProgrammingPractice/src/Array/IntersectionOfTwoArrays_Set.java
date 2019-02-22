package Array;

import java.util.HashSet;

public class IntersectionOfTwoArrays_Set {

	public static void main(String[] args) {
		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}

		for (int j = 0; j < arr2.length; j++) {
			if (set.contains(arr2[j])) {
				System.out.println(arr2[j]);
			}
		}

	}

}
