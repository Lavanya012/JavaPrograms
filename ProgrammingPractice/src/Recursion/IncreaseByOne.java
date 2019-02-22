package Recursion;

public class IncreaseByOne {

	public static void main(String[] args) {
		increaseByOne(1);

	}

	private static void increaseByOne(int n) {

		if (n > 10) {
			return;
		}

		else {
			System.out.println(n);
			increaseByOne(n + 1);
		}

	}

}
