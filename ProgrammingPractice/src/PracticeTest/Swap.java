package PracticeTest;

public class Swap {

	public static void main(String[] args) {

		String A = "hello";
		String B = "world";

		A = A + B;

		B = A.substring(0, A.length() - B.length());
		A = A.substring(B.length());

		System.out.println(A);
		System.out.println(B);
	}

}
