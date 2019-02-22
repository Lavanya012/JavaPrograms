package Array;

import java.util.HashMap;

public class FindOneUniQueElement_Map {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}

			else {
				map.put(arr[i], 1);
			}
		}

		for (Integer set : map.keySet()) {
			if (map.get(set) == 1) {
				System.out.println(set);
			}

		}

	}

}
