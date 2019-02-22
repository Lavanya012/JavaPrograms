package String.Duplicates;

public class FindDuplicatesCharOfString {

	public static void main(String[] args) {
		String A = "HHellooo";
		String duplicates = "";
		boolean flag = false;
		int count = 0;

		for (int i = 0; i < A.length(); i++) {
			flag = false;

			for (int j = i + 1; j < A.length(); j++) {

				if (A.charAt(i) == A.charAt(j)) {
					flag = true;

				}

			}

			if (flag == true) {
				duplicates = duplicates + A.charAt(i);

			}

		}

		System.out.println(duplicates);

	}

}
