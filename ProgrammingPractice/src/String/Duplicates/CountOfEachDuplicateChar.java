package String.Duplicates;

public class CountOfEachDuplicateChar {

	public static void main(String[] args) {
		String A = "HHellol";
		int count = 0;
		String character;
		int length = A.length() - 1;

		while (length > 0) {

			count = 1;

			for (int j = 1; j < A.length(); j++) {

				if (A.charAt(0) == A.charAt(j)) {
					count++;

				}

			}

			if (count > 1) {
				System.out.println(A.charAt(0) + ":" + count);

			}

			character = String.valueOf(A.charAt(0));
			A = A.replaceAll(character, "");
			

			// We are replacing the characters so length will be reduced by the
			// count of repeated char
			length = length - count;

		}

	}

}
