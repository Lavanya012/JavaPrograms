package String;

public class FirstRepeatedAndNonRepeatedchar {

	public static void main(String[] args) {
		String s = "Hello";
		char[] arr = s.toCharArray();
		String repeated = "";
		String nonrepeated = "";

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					repeated = repeated + arr[i];

				} else {
					nonrepeated = nonrepeated + arr[i];

				}

			}

		}

		System.out.println("First Non Repeated char is: " + repeated.charAt(0));
		System.out.println("First Repeated char is: " + nonrepeated.charAt(0));

	}

}
