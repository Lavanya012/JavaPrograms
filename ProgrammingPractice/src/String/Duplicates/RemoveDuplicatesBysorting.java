package String.Duplicates;

import java.util.Arrays;

public class RemoveDuplicatesBysorting {

	public static void main(String[] args) {
		String A = "Helllo";
		char[] arr = A.toCharArray();
		Arrays.sort(arr);
		boolean flag = false;
		String B="";

		for (int i = 0; i < arr.length-1; i++) {
			flag=false;
			if (arr[i] != arr[i + 1]) {
				B=B+arr[i];

			}

			
			
		}
		B=B+arr[arr.length-1];
		System.out.println(B);

	}

}
