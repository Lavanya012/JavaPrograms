package String;

public class ReverseAString {

	public static void main(String[] args) {
		String A = "abcd";
		String B = "";

		for (int i = A.length() - 1; i >= 0; i--) {
			B = B + A.charAt(i);
		}

		System.out.println(B);

	}

}
