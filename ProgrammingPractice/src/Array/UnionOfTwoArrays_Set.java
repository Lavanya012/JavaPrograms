package Array;

import java.util.HashSet;

public class UnionOfTwoArrays_Set {

	public static void main(String[] args) {

		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}

		for (int j = 0; j < arr2.length; j++) {
			set.add(arr2[j]);
		}

		for (int un : set) {
			System.out.println(un);
		}

	}

}
