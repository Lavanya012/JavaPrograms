package String.Duplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfEachDuplicateUsingHashMap {

	public static void main(String[] args) {
		String A = "HHellolooo";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < A.length(); i++) {
			if (map.containsKey(A.charAt(i))) {
				map.put(A.charAt(i), map.get(A.charAt(i)) + 1);
			}

			else {
				map.put(A.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> record : map.entrySet()) {

			if(record.getValue()>1)
			{
				System.out.println(record);
			}
			

		}

	}

}
