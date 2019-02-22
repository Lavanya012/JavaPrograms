package String;

public class SwapStringWithoutExtraVar {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;

		a = a + b;// 5+6=11
		b = a - b;// 11-6=5
		a = a - b;// 11-5=6

		String A = "hello";
		String B = "world";

		A = A.concat(B);// Helloworld
		B = A.substring(0, A.length() - B.length());// world
		A = A.substring(A.length() - B.length());// Hello

		System.out.println(A);
		System.out.println(B);

	}

}
