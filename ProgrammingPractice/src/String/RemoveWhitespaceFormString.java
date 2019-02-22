package String;

public class RemoveWhitespaceFormString {

	public static void main(String[] args) {

		String A = "name=john age=13 year=2001";

		/**
		 * Method 1-this will remove all spaces either it is tab or single or double spaces
		 */
		System.out.println("Method 1:" + A.replaceAll("\\s", ""));

		/**
		 * Method 2
		 */
		String b = "";

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != ' ') {
				b = b + A.charAt(i);
			}

		}

		System.out.println("Method 2:" + b);
	}

}
