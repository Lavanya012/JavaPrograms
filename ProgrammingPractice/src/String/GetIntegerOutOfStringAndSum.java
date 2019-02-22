package String;

public class GetIntegerOutOfStringAndSum {

	public static void main(String[] args) {
		String A = "abc123";
		int rem = 0;
		int sum = 0;

		int B = Integer.parseInt(A.replaceAll("[a-z]", ""));

		System.out.println(B);

		while (B > 0) {
			rem = B % 10;
			sum = sum + rem;
			B = B / 10;
		}

		System.out.println(sum);

	}

}
